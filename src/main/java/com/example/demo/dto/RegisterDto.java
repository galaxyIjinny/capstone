package com.example.demo.dto;

import com.example.demo.entity.Corporate;
import com.example.demo.entity.Mark;
import com.example.demo.entity.Personal;
import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegisterDto {
    private MarkDto mark;
    private PersonalDto personal;
    private CorporateDto corporate;
    private UserDto user;
}
