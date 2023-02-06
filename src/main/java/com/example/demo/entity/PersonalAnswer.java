package com.example.demo.entity;

import jakarta.persistence.Column;
import org.springframework.data.annotation.Id;

public class PersonalAnswer {
    @Id
    private Long application_id; // 답변번호 대신 접수번호로 하면?

    @Column
    private String document;
    @Column
    private String title;
    @Column
    private String answer;
    @Column
    private String created_at;
    @Column
    private String updated_at;
}
