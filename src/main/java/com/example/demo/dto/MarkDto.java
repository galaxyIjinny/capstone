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
    private String brand_name;
    private String description;
    private String image;
    private String sector;
    private String type;
    private String poc;
    private String country;
    private String madrid;
    private String direct;
    private String status;


    public static MarkDto createMarkDto(Mark mark) {
        return new MarkDto(
                mark.getId(),
                mark.getBrand_name(),
                mark.getDescription(),
                mark.getImage(),
                mark.getSector(),
                mark.getType(),
                mark.getPoc(),
                mark.getCountry(),
                mark.getMadrid(),
                mark.getDirect(),
                mark.getStatus()
        );
    }
}
