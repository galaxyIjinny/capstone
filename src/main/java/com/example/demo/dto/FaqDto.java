package com.example.demo.dto;

import com.example.demo.entity.Faq;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
public class FaqDto {
    private Long id;
    private String title;
    private String content;

    public static FaqDto createFaqDto(Faq faq) {
        return FaqDto.builder()
                .id(faq.getId())
                .title(faq.getTitle())
                .content(faq.getContent())
                .build();
    }
}
