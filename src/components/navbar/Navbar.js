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
  const [menu, setMenu] = useState({
    right: false,
  });

  const toggleDrawer = (anchor, open) => (event) => {
    if (
      event.type === "keydown" &&
      (event.key === "Tab" || event.key === "Shift")
    ) {
      return;
    }

    setMenu({ [anchor]: open });
  };

  const CustomListItemText = styled(ListItemText)(({ theme }) => ({
    fontSize: "40px",
  }));
  const list = (anchor) => (
    <Box
      sx={{ width: anchor === "top" || anchor === "bottom" ? "auto" : 600 }}
      role="presentation"
      onClick={toggleDrawer(anchor, false)}
      onKeyDown={toggleDrawer(anchor, false)}
    >
      <List sx={{ cursor: "pointer" }}>
        {[
          "신청내역",
          "비용안내",
          "절차안내",
          "회사소개",
          "등록후기",
          "고객문의",
        ].map((text) => (
          <ListItem key={text}>
            <CustomListItemText primary={text} />
          </ListItem>
        ))}
      </List>
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
    marginRight: "2rem",
    borderRadius: "3px",
    border: "2px solid #CBA585",
    padding: "13px 15px",
    transition: "0.2s",
    [theme.breakpoints.down("sm")]: {
      fontSize: "14px",
      marginRight: "1rem",
    },
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
            <NavLink href="/">신청내역</NavLink>
            <NavLink>비용안내</NavLink>
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
        <CustomMenuIcon onClick={toggleDrawer("right", true)} />
        <Drawer
          anchor="right"
          open={menu["right"]}
          onClose={toggleDrawer("right", false)}
        >
          {list("right")}
        </Drawer>
      </Box>
    </NavbarContainer>
  );
};

export default Navbar;
