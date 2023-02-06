package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Consulting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
