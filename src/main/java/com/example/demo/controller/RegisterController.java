package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.CorporateService;
import com.example.demo.service.MarkService;
import com.example.demo.service.PersonalService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private MarkService markService;
    @Autowired
    private PersonalService personalService;
    @Autowired
    private CorporateService corporateService;
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<RegisterDto> create(@RequestBody RegisterDto dto) {
        MarkDto mark = markService.create(dto.getMark());
        PersonalDto personal = personalService.create(mark.getId(), dto.getPersonal());
        CorporateDto corporate = corporateService.create(mark.getId(), dto.getCorporate());
        UserDto user = userService.create(mark.getId(), dto.getUser());
        RegisterDto registerDto = new RegisterDto(mark, personal, corporate, user);
        return ResponseEntity.status(HttpStatus.OK).body(registerDto);
    }
}
