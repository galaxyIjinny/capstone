package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class CorporateDat {
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
