package com.example.demo.controller;

import com.example.demo.dto.InfoDto;
import com.example.demo.dto.MarkDto;
import com.example.demo.service.corporate.CorporateServiceImpl;
import com.example.demo.service.info.InfoServiceImpl;
import com.example.demo.service.mark.MarkServiceImpl;
import com.example.demo.service.personal.PersonalServiceImpl;
import com.example.demo.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/edit")
@RestController
public class EditController {
    @Autowired
    private InfoServiceImpl infoService;
    @Autowired
    private MarkServiceImpl markService;
    /*@Autowired
    private CorporateServiceImpl corporateService;
    @Autowired
    private PersonalServiceImpl personalService;
    @Autowired
    private UserServiceImpl userService;*/

    @PatchMapping("/mark/{id}")
    public ResponseEntity<MarkDto> updateMark(@PathVariable Long id, @RequestBody MarkDto dto) {
        MarkDto markDto = markService.update(id, dto);
        if(markDto != null)
            return ResponseEntity.status(HttpStatus.OK).body(markDto);
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @PatchMapping("/info")
    public ResponseEntity<InfoDto> update(@RequestBody InfoDto dto) {
        InfoDto infoDto = infoService.update(dto);
        if(infoDto != null)
            return ResponseEntity.status(HttpStatus.OK).body(infoDto);
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
