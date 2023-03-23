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
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private MarkService markService;
    @Autowired
    private PersonalService personalService;
    @Autowired
    private CorporateService corporateService;
    @Autowired
    private UserService userService;

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

    /*@PostMapping("/register/complete")
    public ResponseEntity<RegisterDto> createComplete(@RequestBody RegisterDto dto, @RequestParam("applicantType") String applicantType) {
        MarkDto mark = markService.create(dto.getMark());
        UserDto user = userService.create(mark.getId(), dto.getUser());
        RegisterDto registerDto = new RegisterDto();

        if (applicantType.equals("personal")) {
            PersonalDto personal = personalService.create(mark.getId(), dto.getPersonal());
            registerDto = RegisterDto.builder()
                    .mark(mark)
                    .personal(personal)
                    .user(user)
                    .build();
        } else if (applicantType.equals("corporate")) {
            CorporateDto corporate = corporateService.create(mark.getId(), dto.getCorporate());
            registerDto = RegisterDto.builder()
                    .mark(mark)
                    .corporate(corporate)
                    .user(user)
                    .build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(registerDto);
    }*/
}
