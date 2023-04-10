import { TextField, Grid, Button } from "@mui/material";
import { Wrapper, Label, CustomTypo } from "./CorporateFormStyle";
import React from "react";
import { useState } from "react";

const CorporateForm = () => {
  const [corporateKoreanName, setCorporateKoreanName] = useState("");
  const [corporateEnglishName, setCorporateEnglishName] = useState("");
  const [companyRegistrationNumber, setCompanyRegistrationNumber] =
    useState("");
  const [corporateRegistrationNumber, setCorporateRegistrationNumber] =
    useState("");
  const [representativeName, setRepresentativeName] = useState("");
  const [
    representativeResidentRegistrationNumber,
    setRepresentativeResidentRegistrationNumber,
  ] = useState("");
  const [corporateRepresentativePhone, SetCorporateRepresentativePhone] =
    useState("");
  const [corporateRepresentativeLandline, SetCorporateRepresentativeLandline] =
    useState("");
  const [corporateRepresentativeEmail, SetCorporateRepresentativeEmail] =
    useState("");
  const [sealImage, setSealImage] = useState(null);

  const handleCorporateKoreanName = (event) => {
    setCorporateKoreanName(event.target.value);
  };

  const handleCorporateEnglishName = (event) => {
    setCorporateEnglishName(event.target.value);
  };

  const handleCompanyRegistrationNumber = (event) => {
    setCompanyRegistrationNumber(event.target.value);
  };

  const handleCorporateRegistrationNumber = (event) => {
    setCorporateRegistrationNumber(event.target.value);
  };

  const handleRepresentativeName = (event) => {
    setRepresentativeName(event.target.value);
  };

  const handleRepresentativeResidentRegistrationNumber = (event) => {
    setRepresentativeResidentRegistrationNumber(event.target.value);
  };

  const handleCorporateRepresentativePhone = (event) => {
    SetCorporateRepresentativePhone(event.target.value);
  };

  const handleCorporateRepresentativeLandline = (event) => {
    SetCorporateRepresentativeLandline(event.target.value);
  };

  const handleCorporateRepresentativeEmail = (event) => {
    SetCorporateRepresentativeEmail(event.target.value);
  };

  const handleSealImageChange = (event) => {
    const file = event.target.files[0];
    setSealImage(file);
  };

  return (
    <form>
      <Grid container spacing={2} sx={{ mb: "3rem", padding: "0 230px" }}>
        <Grid item xs={6}>
          <TextField
            required
            fullWidth
            sx={{ mb: "3rem" }}
            id="corporateKoreanName"
            label="법인명(한글)"
            variant="standard"
            value={corporateKoreanName}
            onChange={handleCorporateKoreanName}
          />
        </Grid>
        <Grid item xs={6}>
          <TextField
            required
            fullWidth
            sx={{ mb: "3rem" }}
            id="corporateEnglishName"
            label="법인명(영어)"
            variant="standard"
            value={corporateEnglishName}
            onChange={handleCorporateEnglishName}
          />
        </Grid>
        <Grid item xs={6}>
          <TextField
            required
            fullWidth
            sx={{ mb: "3rem" }}
            id="companyRegistrationNumber"
            label="사업자 등록번호"
            variant="standard"
            value={companyRegistrationNumber}
            onChange={handleCompanyRegistrationNumber}
          />
        </Grid>
        <Grid item xs={6}>
          <TextField
            required
            fullWidth
            sx={{ mb: "3rem" }}
            id="corporateRegistrationNumber"
            label="법인 등록번호"
            variant="standard"
            value={corporateRegistrationNumber}
            onChange={handleCorporateRegistrationNumber}
          />
        </Grid>
        <Grid item xs={6}>
          <TextField
            required
            fullWidth
            sx={{ mb: "3rem" }}
            id="representativeName"
            label="대표자 성명"
            variant="standard"
            value={representativeName}
            onChange={handleRepresentativeName}
          />
        </Grid>
        <Grid item xs={6}>
          <TextField
            required
            fullWidth
            sx={{ mb: "3rem" }}
            id="representativeResidentRegistrationNumber"
            label="대표자 주민등록번호"
            variant="standard"
            value={representativeResidentRegistrationNumber}
            onChange={handleRepresentativeResidentRegistrationNumber}
          />
        </Grid>
        <Grid item xs={6}>
          <TextField
            required
            fullWidth
            sx={{ mb: "3rem" }}
            id="corporateRepresentativePhone"
            label="법인 대표 휴대전화"
            variant="standard"
            value={corporateRepresentativePhone}
            onChange={handleCorporateRepresentativePhone}
          />
        </Grid>
        <Grid item xs={6}>
          <TextField
            id="corporateRepresentativePhone"
            label="법인 대표 유선전화"
            variant="standard"
            fullWidth
            sx={{ mb: "3rem" }}
            value={corporateRepresentativeLandline}
            onChange={handleCorporateRepresentativeLandline}
          />
        </Grid>
        <Grid item xs={6}>
          <TextField
            required
            fullWidth
            sx={{ mb: "3rem" }}
            id="corporateRepresentativeEmail"
            label="법인 대표 이메일"
            variant="standard"
            value={corporateRepresentativeEmail}
            onChange={handleCorporateRepresentativeEmail}
          />
        </Grid>
      </Grid>
      <Wrapper>
        <Label htmlFor="fileUpload">
          사용중인 법인 인감 파일이 있다면 파일을 첨부해주세요
        </Label>
        <input
          accept="image/*"
          id="fileUpload"
          type="file"
          onChange={handleSealImageChange}
        />
        <label className="fileLabel" htmlFor="fileUpload">
          파일 첨부
        </label>
      </Wrapper>
      <Grid container spacing={1} sx={{ padding: "100px 230px" }}>
        <CustomTypo sx={{ mb: "3rem" }}>
          06. 법인 등본상 주소를 입력해주세요
        </CustomTypo>
        <Grid item xs={8}>
          <TextField
            required
            fullWidth
            sx={{ mb: "3rem" }}
            id="corporateAddress"
            label="주소"
            variant="standard"
            // value={}
            // onChange={}
          />
        </Grid>
        <Grid item xs={4}>
          <Button>주소검색</Button>
        </Grid>
        <Grid item xs={8}>
          <TextField
            required
            fullWidth
            sx={{ mb: "3rem" }}
            id="corporateAddress"
            label="상세주소"
            variant="standard"
            // value={}
            // onChange={}
          />
        </Grid>
      </Grid>
    </form>
  );
};
export default CorporateForm;
