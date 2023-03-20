package com.example.demo.dto;

import com.example.demo.entity.Corporate;
import com.example.demo.entity.Mark;
import com.example.demo.entity.Personal;
import com.example.demo.entity.User;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RegisterDto {
    private MarkDto mark;
    private PersonalDto personal;
    private CorporateDto corporate;
    private UserDto user;
}
