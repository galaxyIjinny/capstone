import { styled } from "@mui/system";
import { Typography, ToggleButton } from "@mui/material";

export const CustomTypo = styled(Typography)({
  fontFamily: "Pretendard",
  fontWeight: "600",
  fontSize: "46px",
});

export const FormContainer = styled("div")(({ theme }) => ({
  margin: "100px 230px",
}));
