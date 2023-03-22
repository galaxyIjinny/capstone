package com.example.demo.entity;

import com.example.demo.dto.PersonalDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "mid")
    private Mark mark;
    @Column
    @Size(max=64)
    @NotNull
    private String name_kor;
    @Column
    @Size(max=64)
    @NotNull
    private String name_eng;
    @Column
    @Size(max=64)
    @NotNull
    private String ssn;
    @Column
    @Size(max=128)
    @NotNull
    @Email
    private String email;
    @Column
    @Size(max=64)
    @NotNull
    private String mobile;
    @Column
    @Size(max=64)
    private String phone;
    @Column
    @Size(max=128)
    @NotNull
    private String address;
    @Column
    @Size(max=128)
    @NotNull
    private String detail;
    @Column
    @Size(max=64)
    @NotNull
    private String zipcode;
    @Column
    @Size(max=16)
    @NotNull
    private String agreement;

    public static Personal createPersonal(PersonalDto dto, Mark mark) {
        return Personal.builder()
                .id(dto.getId())
                .mark(mark)
                .name_kor(dto.getName_kor())
                .name_eng(dto.getName_eng())
                .ssn(dto.getSsn())
                .email(dto.getEmail())
                .mobile(dto.getMobile())
                .phone(dto.getPhone())
                .address(dto.getAddress())
                .detail(dto.getDetail())
                .zipcode(dto.getZipcode())
                .agreement(dto.getAgreement())
                .build();
    }

    public void patch(Personal personal) {
        if(personal.name_kor != null)
            this.name_kor = personal.getName_kor();
        if(personal.name_eng != null)
            this.name_eng = personal.getName_eng();
        if(personal.ssn != null)
            this.ssn = personal.getSsn();
        if(personal.email != null)
            this.email = personal.getEmail();
        if(personal.mobile != null)
            this.mobile = personal.getMobile();
        if(personal.phone != null)
            this.phone = personal.getPhone();
        if(personal.address != null)
            this.address = personal.getAddress();
        if(personal.detail != null)
            this.detail = personal.getDetail();
        if(personal.zipcode != null)
            this.zipcode = personal.getZipcode();
        if(personal.agreement != null)
            this.agreement = personal.getAgreement();
    }
}
