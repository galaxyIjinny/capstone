package com.example.demo.entity;

import com.example.demo.dto.PersonalApplicationDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class PersonalApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Size(max=1)
    @NotNull
    private String product_type;
    @Column
    @Size(max=64)
    @NotNull
    private String email;
    @Column
    @Size(max=64)
    @NotNull
    private String ssn;
    @Column
    @Size(max=64)
    @NotNull
    private String name_kor;
    @Column
    @Size(max=64)
    @NotNull
    private String name_eng;
    @Column
    @Size(max=64)
    @NotNull
    private String phone;
    @Column
    @Size(max=64)
    @NotNull
    private String brandname;
    @Column
    @Size(max=64)
    @NotNull
    private String type;
    @Column
    @Size(max=100)
    private String document;
    @Column
    @Size(max=500)
    @NotNull
    private String description;
    @Column
    @Size(max=64)
    @NotNull
    private String category;
    @Column
    @Size(max=64)
    @NotNull
    private String classification;
    @Column
    @Size(min=6, max=20)
    @NotNull
    private String password;
    @Column
    @Size(max=1)
    @NotNull
    private String domestic_status;
    @Column
    @Size(max=1)
    @NotNull
    private String foreign_status;
    @Column
    @Size(max=1)
    @NotNull
    private String answer_status;
    @Column
    @NotNull
    private String created_at;
    @Column
    @Size(max=1)
    @NotNull
    private String approval;

    public static PersonalApplication createPersonalApplication(PersonalApplicationDto dto) {
        return new PersonalApplication(
                dto.getId(),dto.getProduct_type(),dto.getEmail(),dto.getSsn(),dto.getName_kor(),
                dto.getName_eng(),dto.getPhone(),dto.getBrandname(),dto.getType(),dto.getDocument(),
                dto.getDescription(),dto.getCategory(),dto.getClassification(),dto.getPassword(),
                dto.getDomestic_status(),dto.getForeign_status(),dto.getDomestic_status(),dto.getCreated_at(),
                dto.getApproval()
        );
    }
}
