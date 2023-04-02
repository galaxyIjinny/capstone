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

export const CustomToggleButton = styled(ToggleButton)(
  ({ theme, selected }) => ({
    fontFamily: "Pretendard",
    fontWeight: "600",
    fontSize: "20px",
    border: "1px solid black",
    width: "235px",
    height: "65px",
    color: "black",
    borderRadius: "30px",
    backgroundColor: selected ? "red" : "white",
  })
);
