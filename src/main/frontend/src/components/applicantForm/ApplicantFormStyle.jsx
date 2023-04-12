import { styled } from "@mui/system";
import { Typography, Radio } from "@mui/material";

export const CustomTypo = styled(Typography)({
  fontFamily: "Pretendard",
  fontWeight: "600",
  fontSize: "46px",
});

export const FormContainer = styled("div")(({ theme }) => ({
  margin: "100px 0px",
}));

export const Wrapper = styled("div")(({ theme }) => ({
  paddingLeft: "230px",
  paddingRight: "230px",
  backgroundColor: "#3E3E3F",
  color: "white",
  height: "180px",
  display: "flex",
  alignItems: "center",
  justifyContent: "space-between",
}));

export const Label = styled("label")({
  fontFamily: "Pretendard",
  fontWeight: "600",
  fontSize: "25px",
});

export const ApplicantWrapper = styled("div")(({ theme }) => ({
  padding: "0 230px",
}));

export const CustomRadio = styled(Radio)({
  color: "white",
  "&.Mui-checked": {
    color: "#CBA585",
  },
});
