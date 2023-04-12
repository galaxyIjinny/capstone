package com.example.demo.service.mark;

import com.example.demo.dto.MarkDto;
import com.example.demo.entity.Corporate;
import com.example.demo.entity.Mark;
import com.example.demo.entity.Personal;
import com.example.demo.entity.User;
import com.example.demo.repository.CorporateRepository;
import com.example.demo.repository.MarkRepository;
import com.example.demo.repository.PersonalRepository;
import com.example.demo.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class MarkServiceImpl implements MarkService {
    private final MarkRepository markRepository;
    private final CorporateRepository corporateRepository;
    private final PersonalRepository personalRepository;
    private final UserRepository userRepository;

    @Override
    public List<MarkDto> marks() {
        return markRepository.findAll().stream()
                .map(MarkDto::createMarkDto)
                .collect(Collectors.toList());
    }

    @Override
    public MarkDto mark(Long id) {
        Mark mark = markRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("error"));
        return MarkDto.createMarkDto(mark);
    }

    @Override
    @Transactional
    public MarkDto create(MarkDto dto) {
        Mark mark = Mark.createMark(dto);
        if(mark.getId() != null)
            return null;
        Mark created = markRepository.save(mark);
        return MarkDto.createMarkDto(created);
    }

    @Override
    @Transactional
    public MarkDto update(Long id, MarkDto dto) {
        Mark target = markRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("error"));
        target.patch(dto);
        Mark updated = markRepository.save(target);
        return MarkDto.createMarkDto(updated);
    }

    @Override
    @Transactional
    public MarkDto delete(Long id) {
        Mark target = markRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("error"));

        if(target.getPoc().equals("corporate")) {
            Corporate corporate = corporateRepository.findByMark(target);
            corporateRepository.delete(corporate);
        }

        else if(target.getPoc().equals("personal")) {
            Personal personal = personalRepository.findByMark(target);
            personalRepository.delete(personal);
        }

        User user = userRepository.findByMark(target);
        userRepository.delete(user);

        markRepository.delete(target);
        return MarkDto.createMarkDto(target);
    }
}
