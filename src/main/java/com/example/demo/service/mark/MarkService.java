package com.example.demo.service.mark;

import com.example.demo.dto.MarkDto;
import java.util.List;

public interface MarkService {
    List<MarkDto> marks();
    MarkDto mark(Long id);
    MarkDto create(MarkDto dto);
    MarkDto update(Long id, MarkDto dto);
    MarkDto delete(Long id);
}
