import {
  Box,
  Container,
  Drawer,
  List,
  ListItem,
  ListItemText,
} from "@mui/material";
import MenuIcon from "@mui/icons-material/Menu";
import { styled } from "@mui/system";
import { Link } from "react-router-dom";
import { useState } from "react";
import "./Navbar.scss";
import logoImg from "../../assets/images/logo/복합.svg";
const Navbar = () => {
  const [open, setOpen] = useState(false);

  const toggleDrawer = (open) => (event) => {
    if (
      event.type === "keydown" &&
      (event.key === "Tab" || event.key === "Shift")
    ) {
      return;
    }

    setOpen(open);
  };
  const list = () => (
    <Box
      sx={{ width: "600px" }}
      onClick={toggleDrawer(false)}
      onKeyDown={toggleDrawer(false)}
    >
      <ul className="nav">
        {[
          "신 청 내 역",
          "비 용 안 내",
          "절 차 안 내",
          "회 사 소 개",
          "등 록 후 기",
          "고 객 문 의",
        ].map((text) => (
          <li>{text}</li>
        ))}
      </ul>
      <ul className="company">
        <li>계좌</li>
        <li>고객문의</li>
      </ul>
    </Box>
  );

  const NavLink = styled(Link)(({ theme }) => ({
    fontSize: "16px",
    color: "#CBA585",
    fontWeight: "400",
    fontFamily: "Pretendard",
    cursor: "pointer",
    textDecoration: "none",
    transition: "0.5s",
    "&:hover": {
      color: "white",
    },
  }));

  const NavbarLinksBox = styled(Box)(({ theme }) => ({
    display: "flex",
    alignItems: "center",
    justifyContent: "center",
    gap: theme.spacing(5),
    [theme.breakpoints.down("md")]: {
      display: "none",
    },
  }));

  const CustomMenuIcon = styled(MenuIcon)(({ theme }) => ({
    cursor: "pointer",
    color: "#CBA585",
    fontSize: "2.5rem",
    [theme.breakpoints.down("sm")]: {
      fontSize: "1.8rem",
    },
  }));

  const NavbarContainer = styled(Container)(({ theme }) => ({
    position: "fixed",
    background: "transparent",
    top: "0",
    left: "0",
    right: "0",
    display: "flex",
    alignItems: "center",
    justifyContent: "space-between",
    padding: theme.spacing(2),
    [theme.breakpoints.down("md")]: {
      padding: theme.spacing(2),
    },
  }));

  const NavbarLogo = styled("img")(({ theme }) => ({
    cursor: "pointer",
    height: "90px",
    width: "90px",
    marginRight: theme.spacing(5),
  }));

  const ButtonLink = styled(Link)(({ theme }) => ({
    fontSize: "16px",
    color: "#CBA585",
    fontWeight: "400",
    fontFamily: "Pretendard",
    cursor: "pointer",
    textDecoration: "none",
    marginRight: "1rem",
    borderRadius: "3px",
    border: "2px solid #CBA585",
    padding: "13px 15px",
    transition: "0.2s",

    "&:hover": {
      color: "white",
      backgroundColor: "#CBA585",
    },
  }));

  return (
    <NavbarContainer>
      <Box
        sx={{
          display: "flex",
          alignItems: "center",
          justifyContent: "center",
          gap: "1rem",
        }}
      >
        <Box sx={{ display: "flex", alignItems: "center" }}>
          <NavbarLogo src={logoImg} alt="빠른상표" href="/" />{" "}
          <NavbarLinksBox>
            <NavLink to="/">신청내역</NavLink>
            <NavLink to="/price">비용안내</NavLink>
            <NavLink>절차안내</NavLink>
            <NavLink>회사소개</NavLink>
            <NavLink to="/review">등록후기</NavLink>
            <NavLink>고객문의</NavLink>
          </NavbarLinksBox>
        </Box>
      </Box>
      <Box
        sx={{
          display: "flex",
          alignItems: "center",
          justifyContent: "center",
          gaps: "1rem",
        }}
      >
        <ButtonLink>상표등록 신청하기</ButtonLink>
        <CustomMenuIcon onClick={toggleDrawer(true)} />
        <Drawer anchor="right" open={open} onClose={toggleDrawer(false)}>
          {list("right")}
        </Drawer>
      </Box>
    </NavbarContainer>
  );
};

export default Navbar;
