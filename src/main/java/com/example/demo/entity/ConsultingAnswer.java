package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class ConsultingAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String document;
    @Column
    @NotNull
    private String title;
    @Column
    @NotNull
    private String answer;
    @OneToOne
    @JoinColumn(name = "consulting_id")
    private Consulting consulting;
    @Column
    @NotNull
    private String created_at;
    @Column
    @NotNull
    private String updated_at;
}
