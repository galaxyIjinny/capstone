package com.example.demo.dto;

import com.example.demo.entity.Faq;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FaqDto {
    private Long id;
    private String title;
    private String content;

    public static FaqDto createFaqDto(Faq faq) {
        return new FaqDto(
                faq.getId(),
                faq.getTitle(),
                faq.getContent()
        );
    }
}
