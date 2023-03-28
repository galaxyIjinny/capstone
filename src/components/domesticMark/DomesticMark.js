import Grid from '@mui/material/Grid';
import { Container, fontSize, margin } from '@mui/system';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Avatar } from '@mui/material'; 
import Button from '@mui/material/Button';
import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Typography from '@mui/material/Typography';
import { CardActionArea } from '@mui/material';
import { useState } from 'react';
import { ReactComponent as apple } from "../../assets/images/apple.svg"; //상표이미지
import Navbar from '../navbar/Navbar';
import data from "./data";
import './DomesticMark.css';


function MarkAreaCard(props) { //1.상표유형 카드 
  return (
    <Card sx={{ minWidth: 250, minHeight:380 }}>
      <CardActionArea>
        <CardMedia
          component="img"
          height="50"
          image={ apple }
          alt="사진준비중"
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




function DomesticMark(){
  let [markData] = useState(data)


  return(
    <div className="markPage">
      <Navbar />

      <div className="markType">
        <br/><br/><br/>
        <Container>
        <div className="littleTitle">01. 상표유형을 선택해주세요.</div>
        <Grid container spacing={3} style={{textAlign:'center', margin:"30px 0 0 0"}}>        
          <Grid item xs={4}> <MarkAreaCard markData={markData[0]}/> </Grid>
          <Grid item xs={4}> <MarkAreaCard markData={markData[1]}/> </Grid>
          <Grid item xs={4}> <MarkAreaCard markData={markData[2]}/> </Grid> 
        </Grid>                        
        </Container>
      </div>

        <div className="nationSelect">
        <br/><br/><br/>
        <Container>
        <div className="littleTitle" style={{color:"black"}}>04. 출원할 국가를 선택해주세요.</div>
        <div className="littleInfo">다중선택이 가능합니다.</div>
        <TextField id="standard-basic" label="국가명" variant="standard" sx={{width:"400px", maxWidth: '100%'}} />
        <Button className="nationButton" variant="outlined">검색</Button>
        <Button className="nationButton" variant="outlined">국가선택</Button>
        </Container>
        </div>
    </div>
  )
}
export default DomesticMark;
