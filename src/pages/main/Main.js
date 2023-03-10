import "./Main.scss";
import { Box, Typography, Container, Button, Collapse } from "@mui/material";
import { Link } from "react-router-dom";
import mainImg from "../../assets/images/메인.jpeg";
import React from "react";
import Navbar from "../../components/navbar/Navbar";
import { styled } from "@mui/system";
const Main = () => {
  const CustomBox = styled(Box)(({ theme }) => ({
    display: "flex",
    gap: theme.spacing(5),
  }));

  const Title = styled(Typography)(({ theme }) => ({
    fontFamily: "Pretendard",
    fontSize: "80px",
    fontWeight: "600",
    color: "#fff",
    margin: theme.spacing(24, 0, 0, 0),
    // theme.transitions.create
  }));

  const BackgroundBox = styled(Box)(({ theme }) => ({
    backgroundColor: "rgba(0, 0, 0, 0.6)",
    backgroundBlendMode: "multiply",
    backgroundImage: `url(${mainImg})`,
    backgroundRepeat: "no-repeat",
    backgroundSize: "cover",
    height: "100vh",
    width: "100vw",
    [theme.breakpoints.down("md")]: {
      backgroundPosition: "center",
    },
  }));

  const ButtonLink = styled(Link)(({ theme }) => ({
    backgroundImage: "linear-gradient(to right, #CBA585 0%, #9F6A5B 30%)",
    margin: "3px",
    padding: "16px 24px",
    textAlign: "center",
    justifyContent: "center",
    transition: "0.5s",
    backgroundSize: "200% auto",
    borderRadius: "3px",
    fontSize: "18px",
    color: "white",
    fontWeight: "600",
    fontFamily: "Pretendard",
    cursor: "pointer",
    textDecoration: "none",
    "&:hover": {
      backgroundPosition: "right center",
    },
  }));

  return (
    <BackgroundBox>
      <Container>
        <Navbar />

        <CustomBox>
          <Box>
            <Title variant="h1">
              신속하고 합리적인
              <br />
              <Box component="span" sx={{ color: "#CBA585" }}>
                상표등록
              </Box>
            </Title>
            <Typography
              sx={{
                fontFamily: "Pretendard",
                fontSize: "20px",
                color: "white",
                fontWeight: "500",
                margin: "0 0 40px 5px",
              }}
            >
              고민하지 말고 신청하세요!
            </Typography>
            <ButtonLink>상표등록 신청하기</ButtonLink>
          </Box>
        </CustomBox>
      </Container>
    </BackgroundBox>
  );
};

export default Main;
