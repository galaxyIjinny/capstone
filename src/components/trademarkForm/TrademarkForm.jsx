import { TextField, Grid } from "@mui/material";
import React from "react";
import {
  CustomTypo,
  FormContainer,
  Wrapper,
  Label,
} from "./TrademarkFormStyle";
import { useState } from "react";
const TrademarkForm = () => {
  const [trademarkName, setTrademarkName] = useState("");
  const [trademarkDescription, setTrademarkDescription] = useState("");
  const [trademarkImage, setTrademarkImage] = useState(null);

  const handleTrademarkNameChange = (event) => {
    setTrademarkName(event.target.value);
  };

  const handleTrademarkDescriptionChange = (event) => {
    setTrademarkDescription(event.target.value);
  };

  const handleTrademarkImageChange = (event) => {
    setTrademarkImage(event.target.files[0]);
  };

  return (
    <>
      <FormContainer>
        <Grid container spacing={2}>
          <Grid item xs={12}>
            <CustomTypo sx={{ mb: "3rem" }}>
              02. 상표명과 설명을 적어주세요
            </CustomTypo>
          </Grid>
          <Grid item xs={6}>
            <TextField
              fullWidth
              required
              id="trademarkName"
              label="상표명"
              variant="standard"
              sx={{ mb: "3rem" }}
              value={trademarkName}
              onChange={handleTrademarkNameChange}
            />
          </Grid>
          <Grid item xs={12}>
            <TextField
              fullWidth
              required
              id="trademarkDescription"
              label="상표에 대한 설명을 간단하게 작성해주세요"
              variant="standard"
              value={trademarkDescription}
              onChange={handleTrademarkDescriptionChange}
            />
          </Grid>
        </Grid>
      </FormContainer>
      <Wrapper>
        <Label htmlFor="trademarkImage">
          상표이미지가 있다면 파일을 첨부해주세요
        </Label>
        <input
          accept="image/*"
          id="trademarkImage"
          type="file"
          onChange={handleTrademarkImageChange}
        />
      </Wrapper>
    </>
  );
};
export default TrademarkForm;
