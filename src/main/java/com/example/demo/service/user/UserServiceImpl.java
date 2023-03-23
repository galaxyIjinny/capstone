package com.example.demo.service.user;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.Mark;
import com.example.demo.entity.User;
import com.example.demo.repository.MarkRepository;
import com.example.demo.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MarkRepository markRepository;

    public List<UserDto> user() {
        return userRepository.findAll().stream()
                .map(UserDto::createUserDto)
                .collect(Collectors.toList());
    }
    @Transactional
    public UserDto create(Long mid, UserDto dto) {
        Mark mark = markRepository.findById(mid)
                .orElseThrow(() -> new IllegalArgumentException("error"));
        User user = User.createUser(dto, mark);
        User created = userRepository.save(user);
        return UserDto.createUserDto(created);
    }
}
