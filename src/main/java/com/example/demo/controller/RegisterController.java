package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.corporate.CorporateService;
import com.example.demo.service.corporate.CorporateServiceImpl;
import com.example.demo.service.mark.MarkService;
import com.example.demo.service.mark.MarkServiceImpl;
import com.example.demo.service.personal.PersonalService;
import com.example.demo.service.personal.PersonalServiceImpl;
import com.example.demo.service.user.UserService;
import com.example.demo.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class RegisterController {
    @Autowired
    private MarkServiceImpl markService;
    @Autowired
    private PersonalServiceImpl personalService;
    @Autowired
    private CorporateServiceImpl corporateService;
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/personal")
    public ResponseEntity<RegisterDto> createPersonal(@RequestBody RegisterDto dto) {
        MarkDto mark = markService.create(dto.getMark());
        PersonalDto personal = personalService.create(mark.getId(), dto.getPersonal());
        UserDto user = userService.create(mark.getId(), dto.getUser());

        RegisterDto registerDto = RegisterDto.builder()
                .mark(mark)
                .personal(personal)
                .user(user)
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(registerDto);
    }

    @PostMapping("/corporate")
    public ResponseEntity<RegisterDto> createCorporate(@RequestBody RegisterDto dto) {
        MarkDto mark = markService.create(dto.getMark());
        CorporateDto corporate = corporateService.create(mark.getId(), dto.getCorporate());
        UserDto user = userService.create(mark.getId(), dto.getUser());

        RegisterDto registerDto = RegisterDto.builder()
                .mark(mark)
                .corporate(corporate)
                .user(user)
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(registerDto);
    }
}
