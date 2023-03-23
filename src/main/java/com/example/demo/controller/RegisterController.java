package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.info.InfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class RegisterController {
    @Autowired
    private InfoServiceImpl infoService;

    @PostMapping("/personal")
    public ResponseEntity<InfoDto> createPersonal(@RequestBody InfoDto dto) {
        InfoDto infoDto = infoService.createPer(dto);
        return ResponseEntity.status(HttpStatus.OK).body(infoDto);
    }

    @PostMapping("/corporate")
    public ResponseEntity<InfoDto> createCorporate(@RequestBody InfoDto dto) {
        InfoDto infoDto = infoService.createCorp(dto);
        return ResponseEntity.status(HttpStatus.OK).body(infoDto);
    }
}
