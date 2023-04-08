package com.example.demo.service.excel;

import com.example.demo.dto.CostExcelDto;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ExcelService {
    public List<CostExcelDto> costExcels();
    CostExcelDto create(CostExcelDto dto);
    CostExcelDto read(MultipartFile file, Long id, String country, CostExcelDto dto);
    CostExcelDto update(MultipartFile file);
    //CostExcelDto delete(Long id);

    Long getCellValue(XSSFCell cell);
}
