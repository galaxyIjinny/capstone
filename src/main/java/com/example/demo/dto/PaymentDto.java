package com.example.demo.dto;

import com.example.demo.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PaymentDto {
    private Long id;
    private Long mid;
    private String name;
    private String date;
    private String product;
    private String price;
    private String method;

    public static PaymentDto createPaymentDto(Payment payment) {
        return new PaymentDto(
                payment.getId(),
                payment.getMark().getId(),
                payment.getName(),
                payment.getDate(),
                payment.getProduct(),
                payment.getPrice(),
                payment.getMethod()
        );
    }
}
