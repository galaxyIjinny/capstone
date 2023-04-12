package com.example.demo.dto;

import com.example.demo.entity.Personal;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
public class PersonalDto {
    private Long id;
    private Long mid;
    private String name_kor;
    private String name_eng;
    private String ssn;
    private String email;
    private String mobile;
    private String phone;
    private String address;
    private String detail;
    private String zipcode;
    private String agreement;


    public static PersonalDto createPersonalDto(Personal personal) {
        return PersonalDto.builder()
                .id(personal.getId())
                .mid(personal.getMark().getId())
                .name_kor(personal.getName_kor())
                .name_eng(personal.getName_eng())
                .ssn(personal.getSsn())
                .email(personal.getEmail())
                .mobile(personal.getMobile())
                .phone(personal.getPhone())
                .address(personal.getAddress())
                .detail(personal.getDetail())
                .zipcode(personal.getZipcode())
                .agreement(personal.getAgreement())
                .build();
    }

}
