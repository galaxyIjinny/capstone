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
import { CheckBox, Padding } from '@mui/icons-material';
import './Price.css';
import { ReactComponent as CheckIcon } from "../../assets/images/icon/iconCheck.svg";


function Price() {
  let [title] = useState(["국내출원", "해외출원", "국내+해외출원"]);
  return (
    <div className="priceInfo">
      <div className="priceTitle">비용안내</div>
      <Container>
        <Grid container spacing={3}>
          <Grid item xs={4}>
            <Card sx={{ minWidth: 200, minHeight: 500, maxHeight: 700 }} elevation={5} >
              <CardContent>
                <Typography fontSize={24} fontWeight={600} gutterBottom variant="h5" component="div" textAlign="left">
                  {title[0]}
                </Typography>
                <Typography variant="h3" fontWeight={600} color={"#CBA585"} marginTop={5} textAlign="left" >
                  ₩ 000,000~
                </Typography>
                <Typography font-fontSize={18} fontWeight={400} marginTop={10} textAlign="left">
                  <CheckIcon /> 30일 이내 출원심사 완료<br /><br /><br />
                  <CheckIcon /> 상표출원 불가판정 시, 심사비 환불<br /><br /><br />
                  <CheckIcon /> 무료 문의<br /><br /><br />
                </Typography>
                <br /><br /><br />
                <Button id='applicationButton' variant="contained">상표등록 신청하기</Button>
              </CardContent>
            </Card>
          </Grid>

          <Grid item xs={4}>
            <Card sx={{ minWidth: 200, minHeight: 500, maxHeight: 700 }} elevation={5} >
              <CardContent>
                <Typography fontSize={24} fontWeight={600} gutterBottom variant="h5" component="div" textAlign="left">
                  {title[1]}
                </Typography>
                <Typography variant="h3" fontWeight={600} color={"#CBA585"} marginTop={5} textAlign="left" >
                  ₩ 000,000~
                </Typography>
                <Typography font-fontSize={18} fontWeight={400} marginTop={10} textAlign="left">
                  <CheckIcon /> 30일 이내 출원심사 완료<br /><br /><br />
                  <CheckIcon /> 상표출원 불가판정 시, 심사비 환불<br /><br /><br />
                  <CheckIcon /> 무료 문의<br /><br /><br />
                </Typography>
                <br /><br /><br />
                <Button id='applicationButton' variant="contained">상표등록 신청하기</Button>
              </CardContent>
            </Card>
          </Grid>

          <Grid item xs={4}>
            <Card sx={{ minWidth: 200, minHeight: 500, maxHeight: 700 }} elevation={5} >
              <CardContent>
                <Typography fontSize={24} fontWeight={600} gutterBottom variant="h5" component="div" textAlign="left">
                  {title[2]}
                </Typography>
                <Typography variant="h3" fontWeight={600} color={"#CBA585"} marginTop={5} textAlign="left" >
                  ₩ 000,000~
                </Typography>
                <Typography font-fontSize={18} fontWeight={400} marginTop={10} textAlign="left">
                  <CheckIcon /> 30일 이내 출원심사 완료<br /><br /><br />
                  <CheckIcon /> 상표출원 불가판정 시, 심사비 환불<br /><br /><br />
                  <CheckIcon /> 무료 문의<br /><br /><br />
                </Typography>
                <br /><br /><br />
                <Button id='applicationButton' variant="contained">상표등록 신청하기</Button>
              </CardContent>
            </Card>
          </Grid>
        </Grid>
      </Container>
    </div>
  )
}
export default Price;
