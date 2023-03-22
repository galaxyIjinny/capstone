package com.example.demo.controller;

import com.example.demo.dto.CorporateDto;
import com.example.demo.dto.MarkDto;
import com.example.demo.dto.PersonalDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.corporate.CorporateService;
import com.example.demo.service.corporate.CorporateServiceImpl;
import com.example.demo.service.mark.MarkService;
import com.example.demo.service.mark.MarkServiceImpl;
import com.example.demo.service.personal.PersonalService;
import com.example.demo.service.personal.PersonalServiceImpl;
import com.example.demo.service.user.UserService;
import com.example.demo.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/main")
public class MainController {
    @Autowired
    private MarkServiceImpl markService;
    @Autowired
    private PersonalServiceImpl personalService;
    @Autowired
    private CorporateServiceImpl corporateService;
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/mark")
    public List<MarkDto> showMarks() {
        return markService.mark();
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







    /*@GetMapping("/main") // 메인 페이지
    public String markMain() {
        return "/main";
    }
    @GetMapping("/main/application") // 상표 등록 신청
    public String markApplication() {
        return "/main/markApplication";
    }
    @PostMapping("main/application")
    public String typeApplication(@RequestParam("applicantType") String applicantType) { // 라디오 버튼 이용
        if (applicantType.equals("personal")) {  // 방식 고민
            return "/main/personalApplication";
        } else if (applicantType.equals("corporate")) {
            return "/main/corporateApplication";
        } else
            return "/main/markApplication";
    }

    @GetMapping("/main/processInfo") // 절차안내
    public String processInfo() {
        return "/main/processInfo";
    }

    @GetMapping("/main/costInfo") // 비용안내
    public String costInfo() {
        return "/main/costInfo";
    }

    @GetMapping("/main/corporateInfo") // 회사소개
    public String corporateInfo() {
        return "/main/corporateInfo";
    }

    @GetMapping("/main/faq") // FAQ
    public String faq() {
        return "/main/processInfo";
    }*/
}
