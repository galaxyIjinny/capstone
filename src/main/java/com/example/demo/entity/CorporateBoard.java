package com.example.demo.entity;

import jakarta.persistence.*;
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
    private String document;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private String created_at;
    @Column
    private String updated_at;
}
