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
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "uid")
    private User user;
    @Column
    @Size(max=256)
    private String document;
    @Column
    @Size(max=128)
    @NotNull
    private String title;
    @Column
    @Size(max=512)
    @NotNull
    private String answer;
    @Column
    @NotNull
    private LocalDateTime created_at;
}
