package com.example.demo.repository;

import com.example.demo.entity.Corporate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateRepository extends JpaRepository<Corporate, Long> {
}
