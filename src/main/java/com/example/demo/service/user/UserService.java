package com.example.demo.service.user;

import com.example.demo.dto.UserDto;
import java.util.List;

public interface UserService {
    List<UserDto> user();
    UserDto create(Long mid, UserDto dto);
}
