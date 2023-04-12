import { FormControl, FormControlLabel, RadioGroup } from "@mui/material";
import {
  CustomTypo,
  FormContainer,
  Wrapper,
  Label,
  ApplicantWrapper,
  CustomRadio,
} from "./ApplicantFormStyle";
import React from "react";
import { useState } from "react";
import PersonalForm from "./personalForm/PersonalForm";
import CorporateForm from "./corporateForm/CorporateForm";

const ApplicantForm = () => {
  const [applicantType, setApplicantType] = useState("personal");

  const handleChange = (event) => {
    setApplicantType(event.target.value);
  };

  return (
    <FormContainer>
      <FormControl component="fieldset">
        <Wrapper>
          <Label>출원인 유형을 선택해주세요</Label>
          <RadioGroup
            name="applicant-type"
            value={applicantType}
            onChange={handleChange}
            sx={{ display: "flex", flexDirection: "row" }}
          >
            <FormControlLabel
              value="personal"
              control={<CustomRadio />}
              label="개인"
              sx={{
                "& .MuiFormControlLabel-label": {
                  fontFamily: "Pretendard",
                  fontWeight: "500",
                  fontSize: "20px",
                },
                mr: "30rem",
              }}
            />
            <FormControlLabel
              value="corporate"
              control={<CustomRadio />}
              label="법인"
              sx={{
                "& .MuiFormControlLabel-label": {
                  fontFamily: "Pretendard",
                  fontWeight: "500",
                  fontSize: "20px",
                },
              }}
            />
          </RadioGroup>
        </Wrapper>
        <ApplicantWrapper>
          <CustomTypo sx={{ margin: "100px 0" }}>
            05. 출원인 정보를 입력해주세요
          </CustomTypo>
        </ApplicantWrapper>
        {applicantType === "personal" ? <PersonalForm /> : <CorporateForm />}
      </FormControl>
    </FormContainer>
  );
};

export default ApplicantForm;
