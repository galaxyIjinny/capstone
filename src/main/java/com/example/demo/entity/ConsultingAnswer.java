package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @Size(max=100)
    private String document;
    @Column
    @Size(max=100)
    @NotNull
    private String title;
    @Column
    @Size(max=500)
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
