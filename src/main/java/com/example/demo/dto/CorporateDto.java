package com.example.demo.dto;

import com.example.demo.entity.Corporate;
import com.example.demo.entity.Mark;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CorporateDto {
    private Long id;
    private Long mid;
    private String name_kor;
    private String name_eng;
    private String brn;
    private String crn;
    private String name;
    private String ssn;
    private String mobile;
    private String phone;
    private String email;
    private String seal;
    private String address;
    private String detail;
    private String zipcode;
    private String password;
    private String agreement;

    public static CorporateDto createCorporateDto(Corporate corporate) {
        return new CorporateDto(
                corporate.getId(),
                corporate.getMark().getId(),
                corporate.getName_kor(),
                corporate.getName_eng(),
                corporate.getBrn(),
                corporate.getCrn(),
                corporate.getName(),
                corporate.getSsn(),
                corporate.getMobile(),
                corporate.getPhone(),
                corporate.getEmail(),
                corporate.getSeal(),
                corporate.getAddress(),
                corporate.getDetail(),
                corporate.getZipcode(),
                corporate.getPassword(),
                corporate.getAgreement()
        );
    }

}
