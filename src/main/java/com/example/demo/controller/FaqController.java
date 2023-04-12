package com.example.demo.controller;

import com.example.demo.dto.FaqDto;
import com.example.demo.service.faq.FaqServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/faq")
public class FaqController {
    private final FaqServiceImpl faqService;

    @GetMapping
    public List<FaqDto> showFaqs() {
        return faqService.faq();
    }
    @PostMapping
    public FaqDto create(@RequestBody FaqDto dto) {
        return faqService.create(dto);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<FaqDto> update(@PathVariable Long id, @RequestBody FaqDto dto) {
        FaqDto faqDto = faqService.update(id, dto);
        if(faqDto != null)
            return ResponseEntity.status(HttpStatus.OK).body(faqDto);
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<FaqDto> delete(@PathVariable Long id) {
        FaqDto faqDto = faqService.delete(id);
        if(faqDto != null)
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
