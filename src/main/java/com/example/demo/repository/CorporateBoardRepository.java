package com.example.demo.repository;

import com.example.demo.entity.CorporateBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateBoardRepository extends JpaRepository<CorporateBoard, Long> {
}
