package com.example.demo.service.corporate;
import com.example.demo.dto.CorporateDto;
import com.example.demo.entity.Corporate;
import com.example.demo.entity.Mark;
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
public class CorporateServiceImpl implements CorporateService {
    @Autowired
    private CorporateRepository corporateRepository;
    @Autowired
    private MarkRepository markRepository;
    @Override
    public List<CorporateDto> corporate() {
        return corporateRepository.findAll().stream()
                .map(CorporateDto::createCorporateDto)
                .collect(Collectors.toList());
    }
    @Override
    @Transactional
    public CorporateDto create(Long mid, CorporateDto dto) {
        Mark mark = markRepository.findById(mid)
                .orElseThrow(() -> new IllegalArgumentException("error"));
        Corporate corporate = Corporate.createCorporate(dto, mark);
        Corporate created = corporateRepository.save(corporate);
        return CorporateDto.createCorporateDto(created);
    }

    @Override
    public CorporateDto update(Long id, CorporateDto dto) {
        Corporate target = corporateRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("error"));
        target.patch(dto);
        Corporate updated = corporateRepository.save(target);
        return CorporateDto.createCorporateDto(updated);
    }

    @Override
    public CorporateDto delete(Long id) {
        Corporate target = corporateRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("error"));
        corporateRepository.delete(target);
        return CorporateDto.createCorporateDto(target);
    }
}