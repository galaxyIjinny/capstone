package com.example.demo.entity;

import com.example.demo.dto.MarkDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
    @Size(max=256)
    @NotNull
    private String madrid;
    @Column
    @Size(max=256)
    @NotNull
    private String direct;
    @Column
    @Size(max=64)
    private String status;

    public static Mark createMark(MarkDto dto) {
        return Mark.builder()
                .id(dto.getId())
                .brand_name(dto.getBrand_name())
                .description(dto.getDescription())
                .image(dto.getImage())
                .sector(dto.getSector())
                .type(dto.getType())
                .poc(dto.getPoc())
                .country(dto.getCountry())
                .madrid(dto.getMadrid())
                .direct(dto.getDirect())
                .status(dto.getStatus())
                .build();
    }

    public void patch(Mark mark) {
        if(mark.brand_name != null)
            this.brand_name = mark.getBrand_name();
        if(mark.description != null)
            this.description = mark.getDescription();
        if(mark.image != null)
            this.image = mark.getImage();
        if(mark.sector != null)
            this.sector = mark.getSector();
        if(mark.type != null)
            this.type = mark.getType();
        if(mark.poc != null)
            this.poc = mark.getPoc();
        if(mark.country != null)
            this.country = mark.getCountry();
        if(mark.status != null)
            this.status = mark.getStatus();
    }
}
