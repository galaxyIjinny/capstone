package com.example.demo.dto;

import com.example.demo.entity.Personal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class PersonalDto {
    private Long id;
    private Long mid;
    private String name_kor;
    private String name_eng;
    private String ssn;
    private String personalEmail;
    private String personalMobile;
    private String personalPhone;
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
                .personalEmail(personal.getPersonalEmail())
                .personalMobile(personal.getPersonalMobile())
                .personalPhone(personal.getPersonalPhone())
                .address(personal.getAddress())
                .detail(personal.getDetail())
                .zipcode(personal.getZipcode())
                .agreement(personal.getAgreement())
                .build();
    }

}
