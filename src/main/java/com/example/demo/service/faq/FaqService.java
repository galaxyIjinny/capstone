package com.example.demo.service.faq;

import com.example.demo.dto.FaqDto;
import java.util.List;

public interface FaqService {
    List<FaqDto> faq();
    FaqDto create(FaqDto dto);
    FaqDto update(Long id, FaqDto dto);
    FaqDto delete(Long id);
}
