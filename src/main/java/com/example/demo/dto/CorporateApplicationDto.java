package com.example.demo.dto;

import com.example.demo.entity.CorporateApplication;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CorporateApplicationDto {
    private Long id;
    private String product_type;
    private String email;
    private String crn;
    private String brn;
    private String name_kor;
    private String name_eng;
    private String phone;
    private String brandname;
    private String type;
    private String document;
    private String description;
    private String category;
    private String classification;
    private String password;
    private String domestic_status;
    private String foreign_status;
    private String answer_status;
    private String created_at;
    private String approval;


    public static CorporateApplicationDto createCorporateApplicationDto(CorporateApplication corporateApplication) {
        return new CorporateApplicationDto(
                corporateApplication.getId(),
                corporateApplication.getProduct_type(),
                corporateApplication.getEmail(),
                corporateApplication.getCrn(),
                corporateApplication.getBrn(),
                corporateApplication.getName_kor(),
                corporateApplication.getName_eng(),
                corporateApplication.getPhone(),
                corporateApplication.getBrandname(),
                corporateApplication.getType(),
                corporateApplication.getDocument(),
                corporateApplication.getDescription(),
                corporateApplication.getCategory(),
                corporateApplication.getClassification(),
                corporateApplication.getPassword(),
                corporateApplication.getDomestic_status(),
                corporateApplication.getForeign_status(),
                corporateApplication.getAnswer_status(),
                corporateApplication.getCreated_at(),
                corporateApplication.getApproval()
        );
    }

}
