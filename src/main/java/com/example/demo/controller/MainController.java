package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.entity.Mark;
import com.example.demo.repository.MarkRepository;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController {
    @Autowired
    private MarkService markService;
    @Autowired
    private PersonalService personalService;
    @Autowired
    private CorporateService corporateService;
    @Autowired
    private UserService userService;
    @Autowired
    private RegisterService registerService;

    @GetMapping("/register")
    public List<MarkDto> showMarks() {
        return markService.mark();
    }

/*    @GetMapping("/personal")
    public List<PersonalDto> showPersonals() {
        return personalService.personal();
    }

    @GetMapping("/corporate")
    public List<CorporateDto> showCorporates() {
        return corporateService.corporate();
    }*/

    /*@GetMapping("/register")
    public List<RegisterDto> showRegister() {
        return registerService.register();
    }*/

    @GetMapping("/user")
    public List<UserDto> showUsers() {
        return userService.user();
    }


/*    @GetMapping("/main") // 메인 페이지
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
