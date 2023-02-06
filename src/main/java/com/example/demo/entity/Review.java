package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Review {
    @Id
    private Long id;

    @Column
    private String name;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private String created_at;
    @Column
    private String updated_at;
}
