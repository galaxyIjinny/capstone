package com.example.demo.service;

import com.example.demo.dto.PersonalApplicationDto;
import com.example.demo.entity.PersonalApplication;
import com.example.demo.repository.PersonalApplicationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonalApplicationService {
    @Autowired
    private PersonalApplicationRepository personalApplicationRepository;

    public List<PersonalApplicationDto> personalApplications() {
       return personalApplicationRepository.findAll().stream()
               .map(PersonalApplicationDto::createPersonalApplicationDto)
               .collect(Collectors.toList());
    }
    @Transactional
    public PersonalApplicationDto create(PersonalApplicationDto dto) {
        PersonalApplication personalApplication = PersonalApplication.createPersonalApplication(dto);
        PersonalApplication created = personalApplicationRepository.save(personalApplication);
        return PersonalApplicationDto.createPersonalApplicationDto(created);
    }
}
