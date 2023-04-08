package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.corporate.CorporateServiceImpl;
import com.example.demo.service.excel.ExcelServiceImpl;
import com.example.demo.service.info.InfoServiceImpl;
import com.example.demo.service.mark.MarkServiceImpl;
import com.example.demo.service.personal.PersonalServiceImpl;
import com.example.demo.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/main")
public class MainController {
    @Autowired
    private InfoServiceImpl infoService;
    @Autowired
    private MarkServiceImpl markService;
    @Autowired
    private PersonalServiceImpl personalService;
    @Autowired
    private CorporateServiceImpl corporateService;
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private ExcelServiceImpl excelService;



    @GetMapping("/info")
    public List<InfoDto> showAllInfo() {
        return infoService.info();
    }
    @GetMapping("/mark")
    public List<MarkDto> showMarks() {
        return markService.marks();
    }
    @GetMapping("/personal")
    public List<PersonalDto> showPersonals() {
        return personalService.personal();
    }
    @GetMapping("/corporate")
    public List<CorporateDto> showCorporates() {
        return corporateService.corporate();
    }
    @GetMapping("/user")
    public List<UserDto> showUsers() {
        return userService.user();
    }

    @GetMapping("/excel")
    public List<CostExcelDto> showExcels() {
        return excelService.costExcels();
    }
}
