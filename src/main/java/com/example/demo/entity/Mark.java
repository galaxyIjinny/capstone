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
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @Size(max=64)
    @NotNull
    private String mark_type;
    @Column
    @Size(max=64)
    @NotNull
    private String brand_name;
    @Column
    @Size(max=512)
    @NotNull
    private String description;
    @Column
    @Size(max=256)
    private String image;
    @Column
    @Size(max=256)
    @NotNull
    private String sector;
    @Column
    @Size(max=64)
    @NotNull
    private String type;
    @Column
    @Size(max=16)
    @NotNull
    private String poc;
    @Column
    @Size(max=256)
    @NotNull
    private String country;
    @Column
    @Size(max=64)
    @NotNull
    private String status;
}
