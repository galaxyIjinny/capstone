import Grid from '@mui/material/Grid';
import { Container } from '@mui/system';
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
import { ReactComponent as starbucks } from "../../assets/images/starbucks.svg"; //복합상표
import { ReactComponent as apple } from "../../assets/images/apple.svg"; //도형상표
import { ReactComponent as uahanbrothers } from "../../assets/images/uahanbrothers.svg"; //문자상표

function MarkAreaCard() {
  return (
    <Card sx={{ maxWidth: 345 }}>
      <CardActionArea>
        <CardMedia
          component="img"
          height="140"
          image={ apple }
          alt="상표"
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="div">
            복합상표
          </Typography>
          <Typography variant="body2" color="text.secondary">
           상표유형
          </Typography>
        </CardContent>
      </CardActionArea>
    </Card>
  );
}

function DomesticMark(){
  return(
    <div>
      <div className="markType">
        <br/><br/><br/>
        <Container>
          <div>
            <Grid container spacing={4} style={{textAlign:'left'}}>
                  <Grid item xs={12}> <b className='littleTitle'>1. 상표유형</b></Grid>
                  <Grid item xs={3}> <MarkAreaCard/> </Grid>
                  <Grid item xs={3}> <MarkAreaCard/> </Grid>
                  <Grid item xs={3}> <MarkAreaCard/> </Grid>
                  <Grid item xs={3}> <MarkAreaCard/> </Grid>                         
              <br/><br/><br/><br/><br/>

              <Grid item xs={12}> <b className='littleTitle'>2. 상표명</b>  </Grid> 
              <Grid item xs={12}><TextField id="info-markName"
              fullWidth label="상표명을 입력하세요." variant="outlined"/></Grid> 
              <br/><br/><br/><br/><br/>
              <Grid item xs={12}>
              <b className='littleTitle'>3. 참고용 설문 <small><u> *고객님의 사업을 이해하고자 하는 추가 질문입니다.</u></small></b></Grid>
              <Grid item xs={12}><TextField id="info-markIntroduce"
              fullWidth label="예시)와인을 판매하는 주류점입니다, 전자기기 기업의 스마트폰 브랜드입니다." 
              variant="outlined"/></Grid>
              </Grid>
            </div>             
            <br/><br/> 

          <div>
            <Grid container spacing={8}>      
                <Grid item xs={12}> <h3>4.카테고리 선택</h3> </Grid>
                <Grid item xs={12}> <h3>5.분류선택</h3> </Grid>
            </Grid>
          </div>
        
          <div>
            <Grid item xs={12}> <h3 style={{textAlign:'left'}}>주문확인</h3> </Grid>
          </div>
          
          </Container>
      </div>
    </div>
  )
}
export default DomesticMark;
