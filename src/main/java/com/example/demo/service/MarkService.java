package com.example.demo.service;

import com.example.demo.dto.MarkDto;
import com.example.demo.dto.PersonalDto;
import com.example.demo.entity.Mark;
import com.example.demo.repository.MarkRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class MarkService {
    @Autowired
    private MarkRepository markRepository;

    public List<MarkDto> mark() {
        return markRepository.findAll().stream()
                .map(MarkDto::createMarkDto)
                .collect(Collectors.toList());
    }
    @Transactional
    public MarkDto create(MarkDto dto) {
        Mark mark = Mark.createMark(dto);
        if(mark.getId() != null)
            return null;
        Mark created = markRepository.save(mark);
        return MarkDto.createMarkDto(created);
    }
}
