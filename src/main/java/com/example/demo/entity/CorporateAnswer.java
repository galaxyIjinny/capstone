package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class CorporateAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 답변번호 대신 접수번호로 하면?

    @Column
    private String document;
    @Column
    @NotNull
    private String title;
    @Column
    @NotNull
    private String answer;
    @OneToOne
    @JoinColumn(name = "application_id")
    private CorporateApplication corporateApplication;
    @Column
    @NotNull
    private String created_at;
    @Column
    @NotNull
    private String updated_at;
}
