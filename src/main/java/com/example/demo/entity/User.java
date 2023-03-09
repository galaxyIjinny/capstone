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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "mid")
    private Mark mark;
    @Column
    @Size(max=64)
    @NotNull
    private String name;
    @Column
    @Size(max=128)
    @NotNull
    private String email;
    @Column
    @Size(max=64)
    @NotNull
    private String mobile;
    @Column
    @Size(max=64)
    private String phone;
    @Column
    @Size(max=16)
    @NotNull
    private String status;
    @Column
    @Size(max=16)
    @NotNull
    private String approval;
    @Column
    @NotNull
    private LocalDateTime created_at;
}
