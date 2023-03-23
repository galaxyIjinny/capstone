package com.example.demo.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class InfoDto {
    private MarkDto mark;
    private PersonalDto personal;
    private CorporateDto corporate;
    private UserDto user;
}
