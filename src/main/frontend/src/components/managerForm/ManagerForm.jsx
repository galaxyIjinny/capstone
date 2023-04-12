import { TextField, Grid } from "@mui/material";
import { useState } from "react";
import { CustomTypo, FormContainer } from "./ManagerFormStyle";

const ManagerForm = () => {
  const [managerName, setManagerName] = useState("");
  const [managerEMail, setManagerEMail] = useState("");
  const [managerPhone, setManagerPhone] = useState("");
  const [managerLandlinePhone, setManagerLandlinePhone] = useState("");

  const handleManagerNameChange = (event) => {
    setManagerName(event.target.value);
  };

  const handleManagerEMailChange = (event) => {
    setManagerEMail(event.target.value);
  };

  const handleManagerPhoneChange = (event) => {
    setManagerPhone(event.target.value);
  };

  const handleManagerLandlinePhoneChange = (event) => {
    setManagerLandlinePhone(event.target.value);
  };

  return (
    <FormContainer>
      <CustomTypo sx={{ mb: "3rem" }}>
        03. 담당자 정보를 입력해주세요
      </CustomTypo>
      <Grid container spacing={2}>
        <Grid item xs={6}>
          <TextField
            fullWidth
            required
            id="managerName"
            label="성명"
            variant="standard"
            sx={{ mb: "3rem" }}
            value={managerName}
            onChange={handleManagerNameChange}
          />
        </Grid>
        <Grid item xs={6}>
          <TextField
            fullWidth
            required
            id="managerEMail"
            label="이메일"
            variant="standard"
            sx={{ mb: "3rem" }}
            value={managerEMail}
            onChange={handleManagerEMailChange}
          />
        </Grid>
        <Grid item xs={6}>
          <TextField
            fullWidth
            required
            id="managerPhone"
            label="휴대전화"
            variant="standard"
            sx={{ mb: "3rem" }}
            value={managerPhone}
            onChange={handleManagerPhoneChange}
          />
        </Grid>
        <Grid item xs={6}>
          <TextField
            id="managerLandlinePhone"
            fullWidth
            label="유선전화"
            variant="standard"
            sx={{ mb: "3rem" }}
            value={managerLandlinePhone}
            onChange={handleManagerLandlinePhoneChange}
          />
        </Grid>
      </Grid>
    </FormContainer>
  );
};
export default ManagerForm;
