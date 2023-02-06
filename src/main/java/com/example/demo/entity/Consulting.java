package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Consulting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String name;
    @Column
    @NotNull
    private String email;
    @Column
    @NotNull
    private String phone;
    @Column
    @NotNull
    private String brandname;
    @Column
    @NotNull
    private String type;
    @Column
    @NotNull
    private String category;
    @Column
    @NotNull
    private String classification;
    @Column
    private String document;
    @Column
    @NotNull
    private String password;
    @Column
    @NotNull
    private String content;
    @Column
    @NotNull
    private String status;
    @Column
    @NotNull
    private String created_at;
}
