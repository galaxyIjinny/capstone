import { styled } from "@mui/system";
import { Typography } from "@mui/material";

export const CustomTypo = styled(Typography)({
  fontFamily: "Pretendard",
  fontWeight: "600",
  fontSize: "46px",
});

export const FormContainer = styled("div")(({ theme }) => ({
  margin: "100px 230px",
}));

export const Wrapper = styled("div")(({ theme }) => ({
  paddingLeft: "230px",
  paddingRight: "230px",
  backgroundColor: "#eee",
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
