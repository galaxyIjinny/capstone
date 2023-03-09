package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
    @Size(max=128)
    @NotNull
    private String title;
    @Column
    @Size(max=512)
    @NotNull
    private String content;
    @Column
    @Size(max=128)
    @NotNull
    private String email;
    @Column
    @Size(max=64)
    @NotNull
    private String phone;
    @Column
    @Size(max=256)
    private String document;
    @Column
    @Size(min=8, max=64)
    @NotNull
    private String password;
    @Column
    @Size(max=16)
    @NotNull
    private String status;
    @Column
    @NotNull
    private LocalDateTime created_at;
}
