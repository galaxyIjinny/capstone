package com.example.demo.dto;

import com.example.demo.entity.Answer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AnswerDto {
    private Long id;
    private Long uid;
    private String document;
    private String title;
    private String answer;
    private LocalDateTime created_at;

    public static AnswerDto createAnswerDto(Answer answer) {
        return new AnswerDto(
                answer.getId(),
                answer.getUser().getId(),
                answer.getDocument(),
                answer.getTitle(),
                answer.getAnswer(),
                answer.getCreated_at()
        );
    }
}
