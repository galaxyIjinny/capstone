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
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "mid")
    private Mark mark;
    @Column
    @Size(max=64)
    @NotNull
    private String name;
    @Column
    @Size(max=64)
    @NotNull
    private String date;
    @Column
    @Size(max=64)
    @NotNull
    private String product;
    @Column
    @Size(max=64)
    @NotNull
    private String price;
    @Column
    @Size(max=64)
    @NotNull
    private String method;
}
