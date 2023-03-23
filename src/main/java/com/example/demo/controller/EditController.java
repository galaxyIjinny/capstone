package com.example.demo.controller;

import com.example.demo.dto.MarkDto;
import com.example.demo.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/edit")
@RestController
public class EditController {
    @Autowired
    private MarkService markService;

    @PatchMapping("/mark/{id}")
    public ResponseEntity<MarkDto> update(@PathVariable Long id, @RequestBody MarkDto dto) {
        MarkDto markDto = markService.update(id, dto);
        if(markDto != null)
            return ResponseEntity.status(HttpStatus.OK).body(markDto);
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    @DeleteMapping("/mark/{id}")
    public ResponseEntity<MarkDto> delete(@PathVariable Long id) {
        MarkDto markDto = markService.delete(id);
        if(markDto != null)
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }


}
