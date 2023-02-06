package com.example.demo.controller;

import com.example.demo.dto.CorporateApplicationDto;
import com.example.demo.dto.PersonalApplicationDto;
import com.example.demo.entity.PersonalApplication;
import com.example.demo.service.CorporateApplicationService;
import com.example.demo.service.PersonalApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private PersonalApplicationService personalApplicationService;
    @Autowired
    private CorporateApplicationService corporateApplicationService;

    @GetMapping("/main")
    public String markMain() {
        return "/main";
    }

    @GetMapping("/main/application")
    public String markApplication() {
        return "/main/markApplication";
    }
    @PostMapping("main/application/personal")
    public ResponseEntity<PersonalApplicationDto> createPersonalApplication(@RequestBody PersonalApplicationDto dto) {
        PersonalApplicationDto createdDto = personalApplicationService.create(dto);
        return ResponseEntity.status(HttpStatus.OK).body(createdDto);
    }

    @PostMapping("main/application/corporate")
    public ResponseEntity<CorporateApplicationDto> createCorporateApplication(@RequestBody CorporateApplicationDto dto) {
        CorporateApplicationDto createdDto = corporateApplicationService.create(dto);
        return ResponseEntity.status(HttpStatus.OK).body(createdDto);
    }

    @GetMapping("/main/processInfo")
    public String processInfo() {
        return "/main/processInfo";
    }
}
