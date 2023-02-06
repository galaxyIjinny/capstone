package com.example.demo.repository;

import com.example.demo.entity.CorporateApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateApplicationRepository extends JpaRepository<CorporateApplication, Long> {
}
