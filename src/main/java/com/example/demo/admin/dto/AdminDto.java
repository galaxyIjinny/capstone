package com.example.demo.admin.dto;

import com.example.demo.dto.FaqDto;
import com.example.demo.entity.Faq;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class AdminDto {
    private Long id;
    private String username;
    private String password;
    private String role;
    private LocalDateTime created_at;


}
