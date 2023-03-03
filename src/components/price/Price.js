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
import { CheckBox } from '@mui/icons-material';
import './Price.css';

function PriceCard() { //1.가격안내 카드
  return (
    <Card sx={{ maxWidth: 460, Height: 700}}>
      <CardActionArea>
        <CardContent>
          <Typography gutterBottom variant="h5" component="div">
            *title
          </Typography>
          <Typography variant="body2" color="text.secondary">
           *price
          </Typography>
        </CardContent>
      </CardActionArea>
    </Card>
  );
}

function Price(){
  return(
      <div className="priceInfo">
        <div className="priceTitle">비용안내</div>
        <Container>         
            <Grid container spacing={3} style={{textAlign:'left'}}>
                  <Grid item xs={4}> <PriceCard/> </Grid>
                  <Grid item xs={4}> <PriceCard/> </Grid>
                  <Grid item xs={4}> <PriceCard/> </Grid> 
                  </Grid>                
                  </Container>
          </div>
  )}                 
export default Price;
