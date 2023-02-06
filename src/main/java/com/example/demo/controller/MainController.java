package com.example.demo.controller;

import com.example.demo.dto.PersonalApplicationDto;
import com.example.demo.entity.PersonalApplication;
import com.example.demo.service.PersonalApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private PersonalApplicationService personalApplicationService;

    @GetMapping("/main")
    public String markMain() {
        return "/main";
    }

    @GetMapping("/main/markApplication")
    public String markApplication() {
        return "/main/markApplication";
    }
    @PostMapping("main/markApplicatioin/personal")
    public String personalApplication(PersonalApplicationDto personalForm) {
        PersonalApplication personalApplication = personalForm.toEntity();

        PersonalApplication saved = personalRepository.save(personalApplication);
        return "";
    }

    @GetMapping("/main/processInfo")
    public String processInfo() {
        return "/main/processInfo";
    }
}
