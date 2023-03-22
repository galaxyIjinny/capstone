package com.example.demo.service.corporate;

import com.example.demo.dto.CorporateDto;
import java.util.List;

public interface CorporateService {
    List<CorporateDto> corporate();
    CorporateDto create(Long mid, CorporateDto dto);
}
