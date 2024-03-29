package com.example.demo.dto;

import com.example.demo.entity.Corporate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class CorporateDto {
    private Long id;
    private Long mid;
    private String name_kor;
    private String name_eng;
    private String brn;
    private String crn;
    private String corporateName;
    private String ssn;
    private String corporateMobile;
    private String corporatePhone;
    private String corporateEmail;
    private String seal;
    private String address;
    private String detail;
    private String zipcode;
    private String agreement;

    public static CorporateDto createCorporateDto(Corporate corporate) {
        return CorporateDto.builder()
                .id(corporate.getId())
                .mid(corporate.getMark().getId())
                .name_kor(corporate.getName_kor())
                .name_eng(corporate.getName_eng())
                .brn(corporate.getBrn())
                .crn(corporate.getCrn())
                .corporateName(corporate.getCorporateName())
                .ssn(corporate.getSsn())
                .corporateMobile(corporate.getCorporateMobile())
                .corporatePhone(corporate.getCorporatePhone())
                .corporateEmail(corporate.getCorporateEmail())
                .seal(corporate.getSeal())
                .address(corporate.getAddress())
                .detail(corporate.getDetail())
                .zipcode(corporate.getZipcode())
                .agreement(corporate.getAgreement())
                .build();
    }


}
