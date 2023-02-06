package com.example.demo.repository;

import com.example.demo.entity.PersonalApplication;
import org.springframework.data.repository.CrudRepository;

public interface PersonalRepository extends CrudRepository<PersonalApplication, Long> {
    
}
