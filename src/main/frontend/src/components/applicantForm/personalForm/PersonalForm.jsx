import { TextField, Grid } from "@mui/material";
import React from "react";
import { useState } from "react";
const PersonalForm = () => {
  const [applicantKoreanName, setApplicantKoreanName] = useState("");
  const [applicantEnglishName, setApplicantEnglishName] = useState("");
  const [
    applicantResidentRegistrationNumber,
    setApplicantResidentRegistrationNumber,
  ] = useState("");
  const [applicantEMail, setApplicantEMail] = useState("");
  const [applicantPhone, setApplicantPhone] = useState("");
  const [applicantLandlinePhone, setApplicantLandlinePhone] = useState("");

  const handleApplicantKoreanName = (event) => {
    setApplicantKoreanName(event.target.value);
  };

  const handleApplicantEnglishName = (event) => {
    setApplicantEnglishName(event.target.value);
  };

  const handleApplicantResidentRegistrationNumber = (event) => {
    setApplicantResidentRegistrationNumber(event.target.value);
  };

  const handleApplicantEMail = (event) => {
    setApplicantEMail(event.target.value);
  };

  const handleApplicantPhone = (event) => {
    setApplicantPhone(event.target.value);
  };

  const handleApplicantLandlinePhone = (event) => {
    setApplicantLandlinePhone(event.target.value);
  };

  return (
    <Grid container spacing={2} sx={{ mb: "3rem", padding: "0 230px" }}>
      <Grid item xs={6}>
        <TextField
          required
          fullWidth
          id="applicantKoreanName"
          label="성명(한글)"
          variant="standard"
          sx={{ mb: "3rem" }}
          value={applicantKoreanName}
          onChange={handleApplicantKoreanName}
        />
      </Grid>
      <Grid item xs={6}>
        <TextField
          required
          fullWidth
          id="applicantEnglishName"
          label="성명(영어)"
          variant="standard"
          sx={{ mb: "3rem" }}
          value={applicantEnglishName}
          onChange={handleApplicantEnglishName}
        />
      </Grid>
      <Grid item xs={6}>
        <TextField
          required
          fullWidth
          id="applicantResidentRegistrationNumber"
          label="주민번호"
          variant="standard"
          sx={{ mb: "3rem" }}
          value={applicantResidentRegistrationNumber}
          onChange={handleApplicantResidentRegistrationNumber}
        />
      </Grid>
      <Grid item xs={6}>
        <TextField
          required
          fullWidth
          id="applicantEMail"
          label="이메일"
          variant="standard"
          sx={{ mb: "3rem" }}
          value={applicantEMail}
          onChange={handleApplicantEMail}
        />
      </Grid>
      <Grid item xs={6}>
        <TextField
          required
          fullWidth
          id="applicantPhone"
          label="휴대전화"
          variant="standard"
          sx={{ mb: "3rem" }}
          value={applicantPhone}
          onChange={handleApplicantPhone}
        />
      </Grid>
      <Grid item xs={6}>
        <TextField
          fullWidth
          id="applicantLandlinePhone"
          label="유선전화"
          variant="standard"
          sx={{ mb: "3rem" }}
          value={applicantLandlinePhone}
          onChange={handleApplicantLandlinePhone}
        />
      </Grid>
    </Grid>
  );
};
export default PersonalForm;
