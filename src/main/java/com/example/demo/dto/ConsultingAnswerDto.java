package com.example.demo.dto;

import com.example.demo.entity.ConsultingAnswer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ConsultingAnswerDto {
    private Long id;
    private Long cid;
    private String title;
    private String answer;
    private LocalDateTime created_at;

    public ConsultingAnswerDto createConsultingAnswerDto(ConsultingAnswer consultingAnswer) {
        return new ConsultingAnswerDto(
                consultingAnswer.getId(),
                consultingAnswer.getConsulting().getId(),
                consultingAnswer.getTitle(),
                consultingAnswer.getAnswer(),
                consultingAnswer.getCreated_at()
        );
    }
}
