package com.example.demo.service;

import com.example.demo.dto.CorporateApplicationDto;
import com.example.demo.entity.CorporateApplication;
import com.example.demo.repository.CorporateApplicationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CorporateApplicationService {
    @Autowired
    private CorporateApplicationRepository corporateApplicationRepository;

    public List<CorporateApplicationDto> corporateApplications() {
        return corporateApplicationRepository.findAll().stream()
                .map(CorporateApplicationDto::createCorporateApplicationDto)
                .collect(Collectors.toList());
    }
    @Transactional
    public CorporateApplicationDto create(CorporateApplicationDto dto) {
        CorporateApplication corporateApplication = CorporateApplication.createCorporateApplication(dto);
        CorporateApplication created = corporateApplicationRepository.save(corporateApplication);
        return CorporateApplicationDto.createCorporateApplicationDto(created);
    }
}
