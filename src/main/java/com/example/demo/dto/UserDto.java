package com.example.demo.dto;

import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class UserDto {
    private Long id;
    private Long mid;
    private String name;
    private String email;
    private String mobile;
    private String phone;
    private String acc_num;
    private LocalDateTime created_at;

    public static UserDto createUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .mid(user.getMark().getId())
                .name(user.getName())
                .email(user.getEmail())
                .mobile(user.getMobile())
                .phone(user.getPhone())
                .acc_num(user.getAcc_num())
                .created_at(user.getCreated_at())
                .build();
    }

}
