package com.example.demo.dto;

import com.example.demo.entity.PersonalApplication;
import com.example.demo.service.PersonalApplicationService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PersonalApplicationDto {
    private Long id;
    private String product_type;
    private String email;
    private String ssn;
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


    public static PersonalApplicationDto createPersonalApplicationDto(PersonalApplication personalApplication) {
        return new PersonalApplicationDto(
                personalApplication.getId(),
                personalApplication.getProduct_type(),
                personalApplication.getEmail(),
                personalApplication.getSsn(),
                personalApplication.getName_kor(),
                personalApplication.getName_eng(),
                personalApplication.getPhone(),
                personalApplication.getBrandname(),
                personalApplication.getType(),
                personalApplication.getDocument(),
                personalApplication.getDescription(),
                personalApplication.getCategory(),
                personalApplication.getClassification(),
                personalApplication.getPassword(),
                personalApplication.getDomestic_status(),
                personalApplication.getForeign_status(),
                personalApplication.getAnswer_status(),
                personalApplication.getCreated_at(),
                personalApplication.getApproval()
        );
    }
}
