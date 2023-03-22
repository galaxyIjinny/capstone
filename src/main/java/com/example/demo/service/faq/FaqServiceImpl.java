package com.example.demo.service.faq;

import com.example.demo.dto.FaqDto;
import com.example.demo.entity.Faq;
import com.example.demo.repository.FaqRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class FaqServiceImpl implements  FaqService {
    @Autowired
    private FaqRepository faqRepository;

    public List<FaqDto> faq() {
        return faqRepository.findAll().stream()
                .map(FaqDto::createFaqDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public FaqDto create(FaqDto dto) {
        Faq faq = Faq.createFaq(dto);
        if(faq.getId() != null)
            return null;
        Faq created = faqRepository.save(faq);
        return FaqDto.createFaqDto(created);
    }

    @Transactional
    public FaqDto update(Long id, FaqDto dto) {
        Faq faq = Faq.createFaq(dto);
        Faq target = faqRepository.findById(id).orElse(null);
        if(target == null || !id.equals(faq.getId())) {
            log.info("error");
            return null;
        }
        target.patch(faq);
        Faq updated = faqRepository.save(target);
        return FaqDto.createFaqDto(updated);
    }

    @Transactional
    public FaqDto delete(Long id) {
        Faq target = faqRepository.findById(id).orElse(null);
        if(target == null) {
            return null;
        }
        faqRepository.delete(target);
        return FaqDto.createFaqDto(target);
    }
}
