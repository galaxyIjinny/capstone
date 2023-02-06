package com.example.demo.repository;

import com.example.demo.entity.PersonalBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalBoardRepository extends JpaRepository<PersonalBoard, Long> {
}
