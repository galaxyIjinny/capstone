package com.example.demo.entity;

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
public class CorporateBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "application_id")
    private CorporateApplication corporateApplication; // 외래키 이름 통일 필요
    @Column
    @Size(max=100)
    private String document;
    @Column
    @Size(max=100)
    @NotNull
    private String title;
    @Column
    @Size(max=500)
    @NotNull
    private String content;
    @Column
    @NotNull
    private String created_at;
    @Column
    @NotNull
    private String updated_at;
}
