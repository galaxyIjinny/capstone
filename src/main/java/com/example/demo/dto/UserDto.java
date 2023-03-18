package com.example.demo.dto;

import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
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
        return new UserDto(
                user.getId(),
                user.getMark().getId(),
                user.getName(),
                user.getEmail(),
                user.getMobile(),
                user.getPhone(),
                user.getAcc_num(),
                user.getCreated_at()
        );
    }
}
