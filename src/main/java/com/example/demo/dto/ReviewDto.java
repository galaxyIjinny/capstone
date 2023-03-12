package com.example.demo.dto;

import com.example.demo.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ReviewDto {
    private Long id;
    private String name;
    private String brand_name;
    private String title;
    private String content;
    private LocalDateTime created_at;

    public static ReviewDto createReviewDto(Review review) {
        return new ReviewDto(
                review.getId(),
                review.getName(),
                review.getBrand_name(),
                review.getTitle(),
                review.getContent(),
                review.getCreated_at()
        );
    }
}
