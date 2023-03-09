package com.example.demo.entity;

import com.example.demo.dto.PersonalDto;
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
    @Size(min=8, max=64)
    @NotNull
    private String password;
    @Column
    @Size(max=16)
    @NotNull
    private String agreement;

    public static Personal createPersonal(PersonalDto dto, Mark mark) {
        return new Personal(
                dto.getId(), mark, dto.getName_kor(), dto.getName_eng(), dto.getSsn(), dto.getEmail(),
                dto.getMobile(), dto.getPhone(), dto.getAddress(), dto.getDetail(), dto.getZipcode(),
                dto.getPassword(), dto.getAgreement()
        );
    }
}
