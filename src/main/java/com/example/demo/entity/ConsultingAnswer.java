package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class ConsultingAnswer {
    @Id
    private Long consulting_id;

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
