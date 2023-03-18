package com.example.demo.dto;

import com.example.demo.entity.Personal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
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
        return new PersonalDto(
                personal.getId(),
                personal.getMark().getId(),
                personal.getName_kor(),
                personal.getName_eng(),
                personal.getSsn(),
                personal.getEmail(),
                personal.getMobile(),
                personal.getPhone(),
                personal.getAddress(),
                personal.getDetail(),
                personal.getZipcode(),
                personal.getAgreement()
        );
    }
}
