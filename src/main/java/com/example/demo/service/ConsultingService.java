package com.example.demo.service;

import com.example.demo.repository.ConsultingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultingService {
    @Autowired
    private ConsultingRepository consultingRepository;
}
