package com.example.demo.entity;

import com.example.demo.dto.CorporateApplicationDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class CorporateApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String product_type;
    @Column
    @NotNull
    private String email;
    @Column
    @NotNull
    private String crn;
    @Column
    @NotNull
    private String brn;
    @Column
    @NotNull
    private String name_kor;
    @Column
    @NotNull
    private String name_eng;
    @Column
    @NotNull
    private String phone;
    @Column
    @NotNull
    private String brandname;
    @Column
    @NotNull
    private String type;
    @Column
    private String document;
    @Column
    @NotNull
    private String description;
    @Column
    @NotNull
    private String category;
    @Column
    @NotNull
    private String classification;
    @Column
    @NotNull
    private String password;
    @Column
    @NotNull
    private String domestic_status;
    @Column
    @NotNull
    private String foreign_status;
    @Column
    @NotNull
    private String answer_status;
    @Column
    @NotNull
    private String created_at;
    @Column
    @NotNull
    private String approval;

    public static CorporateApplication createCorporateApplication(CorporateApplicationDto dto) {
        return new CorporateApplication(
                dto.getId(),dto.getProduct_type(),dto.getEmail(),dto.getCrn(),dto.getBrn(),dto.getName_kor(),
                dto.getName_eng(),dto.getPhone(),dto.getBrandname(),dto.getType(),dto.getDocument(),
                dto.getDescription(),dto.getCategory(),dto.getClassification(),dto.getPassword(),dto.getDomestic_status(),
                dto.getForeign_status(),dto.getAnswer_status(),dto.getCreated_at(),dto.getApproval()
        );
    }
}
