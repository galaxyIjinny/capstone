package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @Size(max=64)
    @NotNull
    private String name;
    @Column
    @Size(max=64)
    @NotNull
    private String email;
    @Column
    @Size(max=64)
    @NotNull
    private String phone;
    @Column
    @Size(max=64)
    @NotNull
    private String brandname;
    @Column
    @Size(max=64)
    @NotNull
    private String type;
    @Column
    @Size(max=64)
    @NotNull
    private String category;
    @Column
    @Size(max=64)
    @NotNull
    private String classification;
    @Column
    @Size(max=100)
    private String document;
    @Column
    @Size(min=6, max=20)
    @NotNull
    private String password;
    @Column
    @Size(max=500)
    @NotNull
    private String content;
    @Column
    @Size(max=1)
    @NotNull
    private String status;
    @Column
    @NotNull
    private String created_at;
}
