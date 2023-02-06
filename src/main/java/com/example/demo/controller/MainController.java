package com.example.demo.controller;

import com.example.demo.dto.PersonalForm;
import com.example.demo.entity.PersonalApplication;
import com.example.demo.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @Autowired
    private PersonalRepository personalRepository;

    @GetMapping("/main")
    public String markMain() {
        return "/main";
    }

    @GetMapping("/main/markApplication")
    public String markApplication() {
        return "/main/markApplication";
    }
    @PostMapping("main/markApplicatioin/personal")
    public String personalApplication(PersonalForm personalForm) {
        PersonalApplication personalApplication = personalForm.toEntity();

        PersonalApplication saved = personalRepository.save(personalApplication);
        return "";
    }

    @GetMapping("/main/processInfo")
    public String processInfo() {
        return "/main/processInfo";
    }
}
