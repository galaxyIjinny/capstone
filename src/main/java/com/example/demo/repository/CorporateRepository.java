package com.example.demo.repository;

import com.example.demo.entity.Corporate;
import com.example.demo.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateRepository extends JpaRepository<Corporate, Long> {
    Corporate findByMark(Mark target);
}
