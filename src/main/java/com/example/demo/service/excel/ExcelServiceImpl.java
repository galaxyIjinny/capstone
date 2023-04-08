package com.example.demo.service.excel;

import com.example.demo.dto.CostExcelDto;
import com.example.demo.entity.CostExcel;
import com.example.demo.repository.CostExcelRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ExcelServiceImpl implements ExcelService {
    @Autowired
    private CostExcelRepository costExcelRepository;

    @Override
    public List<CostExcelDto> costExcels() {
        return costExcelRepository.findAll().stream()
                .map(CostExcelDto::createCostExcelDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public CostExcelDto create(CostExcelDto dto) {
        return null;
    }

    @Transactional
    public CostExcelDto read(@RequestParam("file") MultipartFile file, Long id, String country, CostExcelDto dto)  { // 선택된 항목만
        //throw IOException {
            List<CostExcel> costExcelList = new ArrayList<>();
            String extension = FilenameUtils.getExtension(file.getOriginalFilename());
            if (!extension.equals("xlsx") && !extension.equals("xls")) {
                throw new IllegalArgumentException("엑셀파일만 업로드 해주세요.");
            }
            Workbook workbook = null;

            if (extension.equals("xlsx")) {
                workbook = new XSSFWorkbook(file.getInputStream());
            } else if (extension.equals("xls")) {
                workbook = new HSSFWorkbook(file.getInputStream());
            }

            Sheet worksheet = workbook.getSheetAt(0);
            for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {
                Row row = worksheet.getRow(i);
                CostExcel data = new CostExcel();

                data.setNum((int) row.getCell(0).getNumericCellValue());
                data.setName(row.getCell(1).getStringCellValue());
                data.setEmail(row.getCell(2).getStringCellValue());
            }
            costExcelDto.addAttribute("datas", costExcelList);

            return "excelList";
        //}
    }

    @Override
    @Transactional
    public CostExcelDto update(MultipartFile file) {
        try {
            List<CostExcel> costExcelList = new ArrayList<>();
            String extension = FilenameUtils.getExtension(file.getOriginalFilename());
            if (!extension.equals("xlsx") && !extension.equals("xls")) {
                throw new IllegalArgumentException("엑셀파일만 업로드 해주세요.");
            }
            InputStream is = file.getInputStream();
            XSSFWorkbook workbook = new XSSFWorkbook(is);
            XSSFSheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue;
                String country = row.getCell(0).getStringCellValue();
                int age = (int) row.getCell(1).getNumericCellValue();
                String address = row.getCell(2).getStringCellValue();

                CostExcel costExcel = new CostExcel(country, age, address);
                costExcelRepository.save(costExcel);
            }

            workbook.close();
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    /*@Override
    public CostExcelDto delete(Long id) {
        return null;
    }*/

    @Override
    public Long getCellValue(XSSFCell cell) {
        return null;
    }
}
