package com.example.demo.service;

import com.example.demo.repository.PersonalApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalApplicationService {
    @Autowired
    private PersonalApplicationRepository personalApplicationRepository;
}
