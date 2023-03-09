package com.example.demo.dto;

import com.example.demo.entity.Mark;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MarkDto {
    private Long id;
    private String mark_type;
    private String brand_name;
    private String description;
    private String image;
    private String sector;
    private String type;
    private String poc;
    private String country;
    private String status;


    public static MarkDto createMarkDto(Mark mark) {
        return new MarkDto(
                mark.getId(),
                mark.getMark_type(),
                mark.getBrand_name(),
                mark.getDescription(),
                mark.getImage(),
                mark.getSector(),
                mark.getType(),
                mark.getPoc(),
                mark.getCountry(),
                mark.getStatus()
        );
    }
}
