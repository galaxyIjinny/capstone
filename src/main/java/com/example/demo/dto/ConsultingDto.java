package com.example.demo.dto;

import com.example.demo.entity.Consulting;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ConsultingDto {
    private Long id;
    private String name;
    private String title;
    private String content;
    private String email;
    private String phone;
    private String document;
    private String password;
    private String status;
    private LocalDateTime created_at;

    public static ConsultingDto createConsultingDto(Consulting consulting) {
        return new ConsultingDto(
                consulting.getId(),
                consulting.getName(),
                consulting.getTitle(),
                consulting.getContent(),
                consulting.getEmail(),
                consulting.getPhone(),
                consulting.getDocument(),
                consulting.getPassword(),
                consulting.getStatus(),
                consulting.getCreated_at()
        );
    }
}
