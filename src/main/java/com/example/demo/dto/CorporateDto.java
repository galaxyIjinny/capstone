package com.example.demo.dto;

import com.example.demo.entity.Corporate;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
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
    private String name;
    private String ssn;
    private String mobile;
    private String phone;
    private String email;
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
                .name(corporate.getName())
                .ssn(corporate.getSsn())
                .mobile(corporate.getMobile())
                .phone(corporate.getPhone())
                .email(corporate.getEmail())
                .seal(corporate.getSeal())
                .address(corporate.getAddress())
                .detail(corporate.getDetail())
                .zipcode(corporate.getZipcode())
                .agreement(corporate.getAgreement())
                .build();
    }


}
