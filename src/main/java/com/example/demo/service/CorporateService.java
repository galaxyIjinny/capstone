package com.example.demo.service;

import com.example.demo.dto.CorporateDto;
import com.example.demo.entity.Corporate;
import com.example.demo.entity.Mark;
import com.example.demo.entity.Personal;
import com.example.demo.repository.CorporateRepository;
import com.example.demo.repository.MarkRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CorporateService {
    @Autowired
    private CorporateRepository corporateRepository;
    @Autowired
    private MarkRepository markRepository;

    public List<CorporateDto> corporate() {
        return corporateRepository.findAll().stream()
                .map(CorporateDto::createCorporateDto)
                .collect(Collectors.toList());
    }
    @Transactional
    public CorporateDto create(Long mid, CorporateDto dto) {
        Mark mark = markRepository.findById(mid).orElseThrow(() -> new IllegalArgumentException("error"));
        Corporate corporate = Corporate.createCorporate(dto, mark);
        Corporate created = corporateRepository.save(corporate);
        return CorporateDto.createCorporateDto(created);
    }

    @Transactional
    public Corporate createCorporate(Corporate corporate) {
        return corporateRepository.save(corporate);
    }
}
