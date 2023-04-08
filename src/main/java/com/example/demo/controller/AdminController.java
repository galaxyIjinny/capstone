package com.example.demo.controller;

import com.example.demo.dto.CostExcelDto;
import com.example.demo.entity.CostExcel;
import com.example.demo.service.excel.ExcelServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequestMapping("/admin")
@RestController
public class AdminController {
    @Autowired
    private ExcelServiceImpl excelService;

    @PatchMapping("/{id}/excel/upload")
    public ResponseEntity<CostExcelDto> update(HttpServletRequest request, HttpServletResponse response, MultipartFile file) {
        return ResponseEntity.ok().body(excelService.update(file));
        if (file != null)
            return ResponseEntity.status(HttpStatus.OK).build()
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @PostMapping("/selectedData")
    public List<CostExcel> getSelectedUsers(@RequestBody List<Long> selected) {
        return excelService.read(selected);
    }

    @PatchMapping("/{id}/excel")
    public ResponseEntity<Cost> update(MultipartFile file) {

        String contentType = file.getContentType();

        CostDto costDto = costService.update();
        if(costDto != null)
            return ResponseEntity.status(HttpStatus.OK).body(costDto);
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
