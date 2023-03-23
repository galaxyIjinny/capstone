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
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class MarkServiceImpl implements MarkService {
    @Autowired
    private MarkRepository markRepository;
    @Autowired
    private CorporateRepository corporateRepository;
    @Autowired
    private PersonalRepository personalRepository;
    @Autowired
    private UserRepository userRepository;

    public List<MarkDto> marks() {
        return markRepository.findAll().stream()
                .map(MarkDto::createMarkDto)
                .collect(Collectors.toList());
    }

    public MarkDto mark(Long id) {
        Mark mark = markRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("error"));
        return MarkDto.createMarkDto(mark);
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
