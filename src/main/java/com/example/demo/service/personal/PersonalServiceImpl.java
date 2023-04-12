package com.example.demo.service.personal;

import com.example.demo.dto.PersonalDto;
import com.example.demo.entity.Mark;
import com.example.demo.entity.Personal;
import com.example.demo.repository.MarkRepository;
import com.example.demo.repository.PersonalRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class PersonalServiceImpl implements PersonalService {
    private final PersonalRepository personalRepository;
    private final MarkRepository markRepository;

    @Override
    public List<PersonalDto> personal() {
        return personalRepository.findAll().stream()
                .map(PersonalDto::createPersonalDto)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public PersonalDto create(Long mid, PersonalDto dto) {
        Mark mark = markRepository.findById(mid)
                .orElseThrow(() -> new IllegalArgumentException("error"));
        Personal personal = Personal.createPersonal(dto, mark);
        Personal created = personalRepository.save(personal);
        return PersonalDto.createPersonalDto(created);
    }

    @Transactional
    @Override
    public PersonalDto update(Long id, PersonalDto dto) {
        Personal target = personalRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("error"));
        target.patch(dto);
        Personal updated = personalRepository.save(target);
        return PersonalDto.createPersonalDto(updated);
    }

    @Transactional
    @Override
    public PersonalDto delete(Long id) {
        Personal target = personalRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("error"));
        personalRepository.delete(target);
        return PersonalDto.createPersonalDto(target);
    }
}
