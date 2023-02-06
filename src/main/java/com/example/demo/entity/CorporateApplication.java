package com.example.demo.entity;

import jakarta.persistence.*;
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
    private String product_type;
    @Column
    private String email;
    @Column
    private String crn;
    @Column
    private String brn;
    @Column
    private String name_kor;
    @Column
    private String name_eng;
    @Column
    private String phone;
    @Column
    private String brandname;
    @Column
    private String type;
    @Column
    private String document;
    @Column
    private String description;
    @Column
    private String category;
    @Column
    private String classification;
    @Column
    private String password;
    @Column
    private String domestic_status;
    @Column
    private String foreign_status;
    @Column
    private String answer_status;
    @Column
    private String created_at;
    @Column
    private String approval;
}
