import Grid from '@mui/material/Grid';
import { Container, fontSize } from '@mui/system';
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
import { CheckBox } from '@mui/icons-material';

function MarkAreaCard() { //1.상표유형 카드
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

function CategoryList(){ //4.카테고리 버튼
  let [category, setCategory] = useState(0);
  return(
    <div>
      <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2} }>{category}</Button></Grid>
    </div>

  )
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

              <Grid item xs={12}> <b className='littleTitle'>2. 상표명</b>
               <small> *<u>복합상표 또는 도형상표, 기타 항목을 선택했을 경우, 이미지 첨부를 부탁드립니다.</u></small>  </Grid> 
              <Grid item xs={12}><TextField id="info-markName"
              fullWidth label="상표명을 입력하세요." variant="outlined"/></Grid> 
              <br/><br/><br/><br/><br/>
              <Grid item xs={12}>
              <b className='littleTitle'>3. 참고용 설문 <small> *<u>고객님의 사업을 이해하고자 하는 추가 질문입니다. 사업이나 상표에 관한 추가 정보를 작성해주세요.</u></small></b></Grid>
              <Grid item xs={12}><TextField id="info-markIntroduce"
              fullWidth label="예시)와인을 판매하는 주류점입니다, 전자기기 기업의 스마트폰 브랜드입니다." 
              multiline
              rows={4}
              variant="outlined"/></Grid>
              </Grid>
            </div>             
            <br/><br/> 

          <div>
          <Grid container spacing={4} style={{textAlign:'left'}}>
                <Grid item xs={12}> <b className='littleTitle'>4. 카테고리 선택</b> </Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2} }>요식업/식음료</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>의류/패션/쇼핑몰</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>뷰티/미용/화장품</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>의료/제약/복지</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>여행/스포츠/취미</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>교육/유뷰브/엔터테이먼트</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>생활/편의서비스</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}> 생활용품/가구/가전제품</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>출산/유아</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>애완용품</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>차량/바이크</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>인테리어/건축/부동산</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>과학/환경/볍률</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>IT/플랫폼/APP</Button></Grid>
                <Grid item xs={3}> <Button variant="outlined" sx={{width:200, margin:2}}>기타</Button></Grid>

                <Grid item xs={12}> <b className='littleTitle'>5.분류선택</b> 
                <small>* <u>상표를 사용할 분류를 선택하세요.(복수선택가능)</u></small></Grid>
                  <Grid item xs={6}><Button className='listing' variant="outlined" sx={{width:500, margin:2}}>
                    43류| 음식점, 카페, 베이커리, 주점 상호명으로 사용 </Button></Grid>
                    <Grid item xs={6}><Button variant="outlined" sx={{width:500, margin:2}}>
                    43류| 음식점, 카페, 베이커리, 주점 상호명으로 사용 </Button></Grid>
                    <Grid item xs={6}><Button variant="outlined" sx={{width:500, margin:2}}>
                    43류| 음식점, 카페, 베이커리, 주점 상호명으로 사용 </Button></Grid>
                    <Grid item xs={6}><Button variant="outlined" sx={{width:500, margin:2}}>
                    43류| 음식점, 카페, 베이커리, 주점 상호명으로 사용 </Button></Grid>
                    <Grid item xs={6}><Button variant="outlined" sx={{width:500, margin:2}}>
                    43류| 음식점, 카페, 베이커리, 주점 상호명으로 사용 </Button></Grid>
                    <Grid item xs={6}><Button variant="outlined" sx={{width:500, margin:2}}>
                    43류| 음식점, 카페, 베이커리, 주점 상호명으로 사용 </Button></Grid>
                    <Grid item xs={6}><Button variant="outlined" sx={{width:500, margin:2}}>
                    43류| 음식점, 카페, 베이커리, 주점 상호명으로 사용 </Button></Grid>
                    <Grid item xs={6}><Button variant="outlined" sx={{width:500, margin:2}}>
                    43류| 음식점, 카페, 베이커리, 주점 상호명으로 사용<CheckBox/> </Button></Grid>
                
            </Grid>
          </div>
          <br/><br/><br/><br/> 
          
          <div>
            <Grid item xs={12}> <b className='littleTitle'>주문확인</b> </Grid>
          </div>
          

          </Container>
      </div>
    </div>
  )
}
export default DomesticMark;
