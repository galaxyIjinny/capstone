package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class PersonalAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 답변번호 대신 접수번호로 하면?

    @Column
    private String document;
    @Column
    private String title;
    @Column
    private String answer;
    @OneToOne
    @JoinColumn(name = "application_id")
    private PersonalApplication personalApplication;
    @Column
    private String created_at;
    @Column
    private String updated_at;
}
