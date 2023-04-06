package com.example.demo.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CostExcelDto {
    private String GeneralCountry;
    private Integer GeneralCost;
    private String MadridCountry;
    private Integer MadridCost;

    private String country;

    private Long directBasicCharge;
    private Long directLocalCharge;
    private Long directBasicAddition;
    private Long directLocalAddition;

    private Long madridBasicCharge;
    private Long madridCHF;
    private Long madridBasicAddition;
    private Long madridCHFAddition;


    private Long basicCharge;
    private Long basicCHF;
    private Float exchangeRate;
}
