package com.example.demo.entity;

import jakarta.persistence.*;
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
    private String title;
    @Column
    private String answer;
    @OneToOne
    @JoinColumn(name = "consulting_id")
    private Consulting consulting;
    @Column
    private String created_at;
    @Column
    private String updated_at;
}
