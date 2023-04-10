import Grid from "@mui/material/Grid";
import { Container, fontSize, margin } from "@mui/system";
import Card from "@mui/material/Card";
import CardContent from "@mui/material/CardContent";
import CardMedia from "@mui/material/CardMedia";
import Typography from "@mui/material/Typography";
import { CardActionArea } from "@mui/material";
import { useState } from "react";
import box_icon from "../../assets/images/icon/box.png";
import markType_data from "./data"; //상표유형 데이터
import "./MarkSelectForm.css";

function MarkAreaCard(props) {
  //상표유형 카드 컴포넌트
  return (
    <Card sx={{ minWidth: 250, minHeight: 380, alignItems: "center" }}>
      <CardActionArea>
        <CardMedia
          component="img"
          image={box_icon}
          alt="package picture"
          sx={{
            width: 100,
            height: 100,
            objectFit: "cover",
            marginLeft: "127px",
            marginTop: "50px",
          }}
        />
        <CardContent sx={{ height: 300 }}>
          <Typography
            gutterBottom
            variant="h5"
            fontWeight={500}
            component="div"
          >
            {props.markData.type}
          </Typography>
          <Typography variant="body2" color="text.secondary">
            <br />
            {props.markData.content}
          </Typography>
          <Typography variant="h4" color="#CBA585" fontWeight={500}>
            <br />₩{props.markData.price}~
          </Typography>
        </CardContent>
      </CardActionArea>
    </Card>
  );
}

function MarkSelectForm() {
  //상표패키지선택 컴포넌트
  let [markData] = useState(markType_data);
  return (
    <div className="markType">
      <Container>
        <div className="littleTitle">01. 상표유형을 선택해주세요.</div>
        <Grid
          container
          spacing={3}
          style={{ textAlign: "center", margin: "30px 0 0 0" }}
        >
          <Grid item xs={4}>
            {" "}
            <MarkAreaCard markData={markData[0]} />{" "}
          </Grid>
          <Grid item xs={4}>
            {" "}
            <MarkAreaCard markData={markData[1]} />{" "}
          </Grid>
          <Grid item xs={4}>
            {" "}
            <MarkAreaCard markData={markData[2]} />{" "}
          </Grid>
        </Grid>
      </Container>
    </div>
  );
}
export default MarkSelectForm;
