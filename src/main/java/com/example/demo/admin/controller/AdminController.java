package com.example.demo.admin.controller;

import com.example.demo.admin.dto.AdminDto;
import com.example.demo.admin.service.AdminDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    AdminDetailsService adminDetailsService;
    @PostMapping("/join")
    public String join(@RequestBody AdminDto dto) {
        adminDetailsService.joinAdmin(dto);
        return "redirect:/login";
    }
}
