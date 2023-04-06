package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
public class CostExcel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lineNumber;

    @Column
    private String country;

    // 개별국
    @Column
    private Long directBasicCharge;
    @Column
    private Long directLocalCharge;
    @Column
    private Long directBasicAddition;
    @Column
    private Long directLocalAddition;


    // 마드리드
    @Column
    private Long madridBasicCharge;
    @Column
    private Long madridCHF;
    @Column
    private Long madridBasicAddition;
    @Column
    private Long madridCHFAddition;


    @Column
    private Long basicCharge;
    @Column
    private Long basicCHF;
    @Column
    private Float exchangeRate;
}