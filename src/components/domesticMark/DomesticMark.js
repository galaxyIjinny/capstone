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
import './DomesticMark.css';

function MarkAreaCard() { //1.상표유형 카드 
  let [markType] = useState(["국내출원","해외출원","국내+해외출원"])
  return (
    <Card sx={{ minWidth: 260, minHeight:350 }}>
      <CardActionArea>
        <CardMedia
          component="img"
          height="100"
          image={ apple }
          alt="사진준비중"
        />
        <CardContent height="150">
          <Typography gutterBottom variant="h5" fontWeight={500} component="div">
            {markType[0]}
          </Typography>
          <Typography variant="body2" color="text.secondary">
           <br/>도형과 이미지가 없는 문자인경우 선택해주세요.
          </Typography>
          <Typography variant="h4" color="#CBA585" fontWeight={500}>
          <br/>₩200,000 ~ 
          </Typography>
        </CardContent>
      </CardActionArea>
    </Card>
  );
}

function DomesticMark(){
  return(
    <div className="markPage">
      <Navbar />
      <div className="markType">
        <br/><br/><br/>
        <div className="littleTitle">01. 상표유형을 선택해주세요.</div>
        <Container>
        <Grid container spacing={3} style={{textAlign:'center', margin:"30px 0 0 0"}}>        
          <Grid item xs={4}> <MarkAreaCard/> </Grid>
          <Grid item xs={4}> <MarkAreaCard/> </Grid>
          <Grid item xs={4}> <MarkAreaCard/> </Grid> 
        </Grid>                        
        </Container>
          </div>
    </div>
  )
}
export default DomesticMark;
