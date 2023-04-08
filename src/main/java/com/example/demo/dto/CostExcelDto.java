package com.example.demo.dto;

import com.example.demo.entity.CostExcel;
import jakarta.persistence.Column;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CostExcelDto {
    private Long lineNumber;
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



    public static CostExcelDto createCostExcelDto(CostExcel costExcel) {
        return CostExcelDto.builder()
                .build();
    }
}
