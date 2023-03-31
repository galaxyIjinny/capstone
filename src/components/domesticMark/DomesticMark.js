import Grid from '@mui/material/Grid';
import Modal from '@mui/material/Modal';
import {Table, TableBody, TableCell, TableContainer, TableRow} from '@mui/material';
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
import box_icon from "../../assets/images/icon/box.png";
import Navbar from '../navbar/Navbar';
import data from "./data";
import "./DomesticMark.css";

function MarkAreaCard(props) { //상표유형 카드 컴포넌트
  return (
    <Card sx={{ minWidth: 250, minHeight:380, alignItems: "center" }}>
      <CardActionArea >
        <CardMedia
          component="img"
          image={ box_icon }
          alt="package picture"
          sx={{ width: 100, height: 100, objectFit: "cover", marginLeft: "127px", marginTop: "50px" }}
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

function MarkSelect(){ //상표패키지선택 컴포넌트
let [markData] = useState(data)
return(
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
)
}

function NationSelectedBox({ country }){ //국가선택창 또는 검색 버튼에서 국가 선택시 밑에 추가됨.
return(
  <Box className="nationBox_selected">
    {country} <span style={{color:"#2F2E41", marginLeft:"3px"}}>&times;</span>
    </Box>
)
}

function NationSelect() { //국가선택 컴포넌트
  const [open, setOpen] = useState(false);

  const handleOpen = () => {
    setOpen(true);
  };

  const handleClose = () => {
    setOpen(false);
  };

  const handleSelectCountry = () => {
    
  }
  return (
    <div>
      <br/><br/><br/>
      <Container>
        <div className="littleTitle" style={{color:"black"}}>04. 출원할 국가를 선택해주세요.</div>
        <div className="littleInfo">다중선택이 가능합니다.</div>
        <TextField id="standard-basic" label="국가명" variant="standard" sx={{width:"400px", maxWidth: '100%'}} />
        <Button className="nationButton" variant="outlined">검색</Button>
        <Button className="nationButton" variant="outlined" onClick={handleOpen}>
        국가선택
      </Button>
      <Modal
        open={open}
        onClose={handleClose}
        aria-labelledby="modal-title"
        aria-describedby="modal-description"
      >
        <Box sx={{
          position: 'absolute',
          top: '50%',
          left: '50%',
          transform: 'translate(-50%, -50%)',
          bgcolor: 'background.paper',
          border: '2px solid #000',
          boxShadow: 24,
          p: 8,
          overflow: 'scroll',  // 스크롤을 추가할 수 있도록 `overflow` 속성을 설정
          maxHeight: '80vh',   // 모달 창 내부의 높이가 충분하도록 `maxHeight` 속성을 설정
        }}>
          <h2 id="modal-title">국가 선택</h2>
          <p id="modal-description">다중선택이 가능합니다.</p>
          <TableContainer style={{ width: '800px', height: '800px' }}> 
            <Table style={{ width: '100%', height: '100%' }}>
              <TableBody>
                {[...Array(20)].map((_, i) => (
                  <TableRow key={i}>
                {i === 0 && (
                  <TableCell className="contentName_row" rowSpan={2} sx={{color:"white"}}> 주요국가 </TableCell>
                )}
                {i === 2 && (
                  <TableCell className="contentName_row" rowSpan={5}> 아시아 </TableCell>
                )}
                 {i === 7 && (
                  <TableCell className="contentName_row" rowSpan={1}> 북미 </TableCell>
                )}
                 {i === 8 && (
                  <TableCell className="contentName_row" rowSpan={4}> 남미 </TableCell>
                )}
                 {i === 12 && (
                  <TableCell className="contentName_row" rowSpan={4}> 유럽 </TableCell>
                )} 
                {i === 16 && (
                  <TableCell className="contentName_row" rowSpan={4}> 아프리카 </TableCell>
                )}
                    {[...Array(6)].map((_, j) => (                      
                      <TableCell key={`${i}-${j}`}>
                        <Button variant="outlined" color="primary" onClick={() => handleSelectCountry(i, j)}>선택</Button>
                      </TableCell>
                    ))}
                  </TableRow>
                ))}
              </TableBody>
            </Table>
          </TableContainer>
          <Button onClick={handleClose}>닫기</Button>
        </Box>
      </Modal>
      </Container>
    </div>
  );
}

function DomesticMark(){
  return(
    <div className="markPage">
      <Navbar />
      <MarkSelect />
      <NationSelect />
    </div>
  )
}
export default DomesticMark;
