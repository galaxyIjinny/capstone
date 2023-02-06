import Grid from '@mui/material/Grid';
import { Container } from '@mui/system';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Avatar } from '@mui/material';
import Button from '@mui/material/Button';

function DomesticMark(){
  return(
    <div>
      <div className="markType">
        <br/><br/><br/>
        <Container>
          <div>
            <Grid container spacing={2} style={{textAlign:'left'}}>
                  <Grid item xs={12}> <h3>1. 상표유형</h3> </Grid>
                  <Grid item xs={3}> <Button variant="outlined">문자 상표</Button> </Grid>
                  <Grid item xs={3}> <Button variant="outlined">도형 상표</Button> </Grid>
                  <Grid item xs={3}> <Button variant="outlined">복합 상표</Button> </Grid>
                  <Grid item xs={3}> <Button variant="outlined">기타 & 모르겠음</Button> </Grid>              
              <br/><br/><br/><br/><br/>
              <Grid item xs={12}> <h3>2. 상표명</h3> </Grid> 
              <Grid item xs={12}><TextField id="info-markName"
              fullWidth label="상표명을 입력하세요." variant="outlined"/></Grid> 
              <br/><br/><br/><br/><br/>
              <Grid item xs={12}> <h3>3. 참고용 설문 *고객님의 사업을 이해하고자 하는 추가 질문입니다.</h3> </Grid>
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
