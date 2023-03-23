package com.example.demo.service.personal;

import com.example.demo.dto.PersonalDto;
import com.example.demo.entity.Mark;
import com.example.demo.entity.Personal;
import com.example.demo.repository.MarkRepository;
import com.example.demo.repository.PersonalRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class PersonalServiceImpl implements PersonalService {
    @Autowired
    private PersonalRepository personalRepository;
    @Autowired
    private MarkRepository markRepository;

    public List<PersonalDto> personal() {
        return personalRepository.findAll().stream()
                .map(PersonalDto::createPersonalDto)
                .collect(Collectors.toList());
    }
    @Transactional
    public PersonalDto create(Long mid, PersonalDto dto) {
        Mark mark = markRepository.findById(mid)
                .orElseThrow(() -> new IllegalArgumentException("error"));
        Personal personal = Personal.createPersonal(dto, mark);
        Personal created = personalRepository.save(personal);
        return PersonalDto.createPersonalDto(created);
    }
}
