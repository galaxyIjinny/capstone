package com.example.demo.service.personal;

import com.example.demo.dto.PersonalDto;
import java.util.List;

public interface PersonalService {
    List<PersonalDto> personal();
    PersonalDto create(Long mid, PersonalDto dto);
}
