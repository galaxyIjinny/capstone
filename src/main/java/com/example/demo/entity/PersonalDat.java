package com.example.demo.entity;

import jakarta.persistence.Column;
import org.springframework.data.annotation.Id;

public class PersonalDat {
    @Id
    private Long id;

    private Long application_id; // 외래키 이름 통일 필요

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
