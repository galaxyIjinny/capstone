package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Consulting {
    @Id
    private Long id;

    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String brandname;
    @Column
    private String type;
    @Column
    private String category;
    @Column
    private String classification;
    @Column
    private String document;
    @Column
    private String password;
    @Column
    private String content;
    @Column
    private String status;
    @Column
    private String created_at;
}
