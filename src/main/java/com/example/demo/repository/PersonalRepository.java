package com.example.demo.repository;

import com.example.demo.entity.Mark;
import com.example.demo.entity.Personal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalRepository extends JpaRepository<Personal, Long> {
    Personal findByMark(Mark target);
}
