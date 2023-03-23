package com.example.demo.service.info;

import com.example.demo.dto.*;
import com.example.demo.service.corporate.CorporateServiceImpl;
import com.example.demo.service.mark.MarkServiceImpl;
import com.example.demo.service.personal.PersonalServiceImpl;
import com.example.demo.service.user.UserServiceImpl;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class InfoServiceImpl implements InfoService{
    @Autowired
    private MarkServiceImpl markService;
    @Autowired
    private PersonalServiceImpl personalService;
    @Autowired
    private CorporateServiceImpl corporateService;
    @Autowired
    private UserServiceImpl userService;

    @Override
    public List<InfoDto> info() {
        List<PersonalDto> personalDtoList = personalService.personal();
        List<CorporateDto> corporateDtoList = corporateService.corporate();
        List<UserDto> userDtoList = userService.user();
        List<InfoDto> infoDtoList = new ArrayList<>();

        for (UserDto userDto : userDtoList) {
            MarkDto mark = markService.mark(userDto.getMid());
            CorporateDto corporate = null;
            PersonalDto personal = null;

            if(mark.getPoc().equals("corporate")) {
                for (CorporateDto corporateDto : corporateDtoList) {
                    if (corporateDto.getMid() == mark.getId()) {
                        corporate = corporateDto;
                        break;
                    }
                }

                InfoDto infoDto = InfoDto.builder()
                        .mark(mark)
                        .corporate(corporate)
                        .user(userDto)
                        .build();

                infoDtoList.add(infoDto);
            }

            else if(mark.getPoc().equals("personal")) {
                for (PersonalDto personalDto : personalDtoList) {
                    if (personalDto.getMid() == mark.getId()) {
                        personal = personalDto;
                        break;
                    }
                }

                InfoDto infoDto = InfoDto.builder()
                        .mark(mark)
                        .personal(personal)
                        .user(userDto)
                        .build();

                infoDtoList.add(infoDto);
            }
        }

        return infoDtoList;
    }

    @Transactional
    @Override
    public InfoDto createCorp(InfoDto dto) {
        MarkDto mark = markService.create(dto.getMark());
        CorporateDto corporate = corporateService.create(mark.getId(), dto.getCorporate());
        UserDto user = userService.create(mark.getId(), dto.getUser());

        InfoDto registerDto = InfoDto.builder()
                .mark(mark)
                .corporate(corporate)
                .user(user)
                .build();

        return registerDto;
    }

    @Transactional
    @Override
    public InfoDto createPer(InfoDto dto) {
        MarkDto mark = markService.create(dto.getMark());
        PersonalDto personal = personalService.create(mark.getId(), dto.getPersonal());
        UserDto user = userService.create(mark.getId(), dto.getUser());

        InfoDto registerDto = InfoDto.builder()
                .mark(mark)
                .personal(personal)
                .user(user)
                .build();

        return registerDto;
    }

    @Transactional
    @Override
    public InfoDto update(InfoDto dto) {
        MarkDto markDto = dto.getMark();
        markDto = markService.update(markDto.getId(), markDto);

        UserDto userDto = dto.getUser();
        userDto = userService.update(userDto.getId(), userDto);

        if(dto.getMark().getPoc().equals("corporate")) {
            CorporateDto corporateDto = dto.getCorporate();
            corporateDto = corporateService.update(corporateDto.getId(), corporateDto);

            InfoDto updateDto = InfoDto.builder()
                    .mark(markDto)
                    .corporate(corporateDto)
                    .user(userDto)
                    .build();

            return updateDto;
        }

        else if(dto.getMark().getPoc().equals("personal")) {
            PersonalDto personalDto = dto.getPersonal();
            personalDto = personalService.update(personalDto.getId(), personalDto);

            InfoDto updateDto = InfoDto.builder()
                    .mark(markDto)
                    .personal(personalDto)
                    .user(userDto)
                    .build();

            return updateDto;
        }

        return null;
    }
}
