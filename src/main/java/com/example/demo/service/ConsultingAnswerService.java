package com.example.demo.service;

import com.example.demo.repository.ConsultingAnswerRepository;
import com.example.demo.repository.ConsultingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultingAnswerService {
    @Autowired
    private ConsultingAnswerRepository consultingAnswerRepository;
    @Autowired
    private ConsultingRepository consultingRepository;
}
