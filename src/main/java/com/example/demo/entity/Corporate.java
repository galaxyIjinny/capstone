package com.example.demo.entity;

import com.example.demo.dto.CorporateDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
@Entity
public class Corporate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
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
    private String brn;
    @Column
    @Size(max=64)
    @NotNull
    private String crn;
    @Column
    @Size(max=64)
    @NotNull
    private String name;
    @Column
    @Size(max=64)
    @NotNull
    private String ssn;
    @Column
    @Size(max=64)
    private String mobile;
    @Column
    @Size(max=64)
    private String phone;
    @Column
    @Size(max=128)
    @NotNull
    @Email
    private String email;
    @Column
    @Size(max=256)
    private String seal;
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


    public static Corporate createCorporate(CorporateDto dto, Mark mark) {
        return Corporate.builder()
                .id(dto.getId())
                .mark(mark)
                .name_kor(dto.getName_kor())
                .name_eng(dto.getName_eng())
                .brn(dto.getBrn())
                .crn(dto.getCrn())
                .name(dto.getName())
                .ssn(dto.getSsn())
                .mobile(dto.getMobile())
                .phone(dto.getPhone())
                .email(dto.getEmail())
                .seal(dto.getSeal())
                .address(dto.getAddress())
                .detail(dto.getDetail())
                .zipcode(dto.getZipcode())
                .agreement(dto.getAgreement())
                .build();
    }


    public void patch(CorporateDto corporate) {
        if(corporate.getName_kor() != null)
            this.name_kor = corporate.getName_kor();
        if(corporate.getName_eng() != null)
            this.name_eng = corporate.getName_eng();
        if(corporate.getBrn() != null)
            this.brn = corporate.getBrn();
        if(corporate.getCrn() != null)
            this.crn = corporate.getCrn();
        if(corporate.getName() != null)
            this.name = corporate.getName();
        if(corporate.getSsn() != null)
            this.ssn = corporate.getSsn();
        if(corporate.getMobile() != null)
            this.mobile = corporate.getMobile();
        if(corporate.getPhone() != null)
            this.phone = corporate.getPhone();
        if(corporate.getEmail() != null)
            this.email = corporate.getEmail();
        if(corporate.getSeal() != null)
            this.seal = corporate.getSeal();
        if(corporate.getAddress() != null)
            this.address = corporate.getAddress();
        if(corporate.getDetail() != null)
            this.detail = corporate.getDetail();
        if(corporate.getZipcode() != null)
            this.zipcode = corporate.getZipcode();
        if(corporate.getAgreement() != null)
            this.agreement = corporate.getAgreement();
    }
}
