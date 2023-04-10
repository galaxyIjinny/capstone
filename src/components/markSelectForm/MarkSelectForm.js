import React, { useEffect } from "react";
import Grid from '@mui/material/Grid';
import { Container, fontSize, margin } from '@mui/system';
import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Typography from '@mui/material/Typography';
import { CardActionArea } from '@mui/material';
import { useState } from 'react';
import box_icon from "../../assets/images/icon/box.png";
import markType_data from "./data"; //상표유형 데이터
import "./MarkSelectForm.css";


function MarkAreaCard(props) { //상표유형 카드 컴포넌트
  const [isSelected, setIsSelected] = useState(false); //카드가 선택됐는지 판단하는 state

  const handleClick = () => { //카드의 패키지를 상태를 전달;
    props.onClick(props.markData.type);
    console.log(props.markData.type);
    setIsSelected(!isSelected);
  };

  useEffect(() => {
    if (props.selectedMark !== props.markData.type) {
      setIsSelected(false); // 선택된 카드가 아닐 때 상태 초기화
    }
  }, [props.selectedMark]);

  return (
    <Card sx={{ minWidth: 250, minHeight:380, alignItems: "center", 
    backgroundColor: isSelected ? "gray" : "white",}} >
      <CardActionArea onClick={handleClick}>
        <CardMedia
          component="img"
          image={ box_icon }
          alt="package picture"
          sx={{ 
          width: 100, height: 100, 
          objectFit: "cover", 
          marginLeft: "127px", marginTop: "50px"
         }}
        />
        <CardContent sx={{height:300}}>
          <Typography gutterBottom variant="h5" fontWeight={500} component="div">
            {props.markData.type}
          </Typography>
          <Typography variant="body2" color="text.secondary">
           <br/>{props.markData.content}
          </Typography>
          <Typography variant="h4" color="#CBA585" fontWeight={500}>
          <br/>₩{props.markData.price}~
          </Typography>
        </CardContent>
      </CardActionArea>
    </Card>
  );
}

function MarkSelectForm(){ //상표패키지선택 컴포넌트

const [selectedMark, setSelectedMark] = useState("국내출원");

const handleMarkClick = (type) => { //패키지 타입,인덱스 상태 저장
    setSelectedMark(type);
  };

let [markData] = useState(markType_data) //상표패키지 데이터

return(
  <div className="markType">
  <br/><br/><br/>
  <Container>
  <div className="littleTitle01">01. 상표유형을 선택해주세요.</div>
  <Grid container spacing={3} style={{textAlign:'center', margin:"30px 0 0 0"}}>        
    <Grid item xs={4}> <MarkAreaCard markData={markData[0]} onClick={handleMarkClick} selectedMark={selectedMark}/> </Grid>
    <Grid item xs={4}> <MarkAreaCard markData={markData[1]} onClick={handleMarkClick} selectedMark={selectedMark}/> </Grid>
    <Grid item xs={4}> <MarkAreaCard markData={markData[2]} onClick={handleMarkClick} selectedMark={selectedMark}/> </Grid> 
  </Grid>                        
  </Container>

  {selectedMark === "국내출원" ? <div>국내랜더링</div> : <div>해외랜더링</div>}

</div>
);
}
export default MarkSelectForm;
