package com.example.demo.service;

import com.example.demo.dto.MarkDto;
import com.example.demo.dto.PersonalDto;
import com.example.demo.entity.Mark;
import com.example.demo.repository.MarkRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Slf4j
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

    @Transactional
    public MarkDto update(Long id, MarkDto dto) {
        Mark mark = Mark.createMark(dto);
        Mark target = markRepository.findById(id).orElse(null);
        if(target == null || !id.equals(mark.getId())) {
            log.info("error");
            return null;
        }
        target.patch(mark);
        Mark updated = markRepository.save(target);
        return MarkDto.createMarkDto(updated);
    }

    @Transactional
    public MarkDto delete(Long id) {
        Mark target = markRepository.findById(id).orElse(null);
        if(target == null) {
            return null;
        }
        markRepository.delete(target);
        return MarkDto.createMarkDto(target);
    }
}
