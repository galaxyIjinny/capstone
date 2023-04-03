import Grid from '@mui/material/Grid';
import Modal from '@mui/material/Modal';
import {Table, TableBody, TableCell, TableContainer, TableRow} from '@mui/material';
import { Container, fontSize, margin } from '@mui/system';
import Box from '@mui/material/Box';
import IconButton from '@mui/material/IconButton';
import CloseIcon from '@mui/icons-material/Close';
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
import Navbar from '../../components/navbar/Navbar';
import markType_data from "./data"; //상표유형 데이터
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
let [markData] = useState(markType_data)
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
  const [searchValue, setSearchValue] = useState(''); // 입력어를 state로 관리
  const [boxes, setBoxes] = useState([]);

  const handleOpen = () => { //모달창 오픈
    setOpen(true);
  };

  const handleClose = () => { //모달창 닫기
    setOpen(false);
  };

  const handleSearch = () => { // 검색 버튼 클릭 시 검색어에 해당하는 박스 추가 로직
    const newBox = 
    <Box className="nationBox_selected"> {searchValue} 
    <IconButton onClick={handleClose}><CloseIcon /></IconButton>
    </Box>;
    setBoxes([...boxes, newBox]);
    console.log(searchValue);
  };

  const handleInput = (event) => {
    // TextField에 입력된 값을 검색어 state에 저장
    setSearchValue(event.target.value);
  };

  const handleSelectCountry = () => { //국가선택팝업창에서 국가 버튼을 눌렀을 때 
    
  }
  return (
    <div>
      <br/><br/><br/>
      <Container>
        <div className="littleTitle" style={{color:"black"}}>04. 출원할 국가를 선택해주세요.</div>
        <div className="littleInfo">다중선택이 가능합니다.</div>
        <TextField id="standard-basic" label="국가명" variant="standard" style={{width:'400px', maxWidth: '100%'}}
         value={searchValue} onChange={(e) => setSearchValue(e.target.value)}/>
        <Button className="nationButton" variant="outlined" onClick={handleSearch}>검색</Button>
        <Button className="nationButton" variant="outlined" onClick={handleOpen}>
        국가선택
      </Button>
      <div>{boxes}</div>
      <Modal
        open={open}
        onClose={handleClose}
        aria-labelledby="국가선택창"
        aria-describedby="다중선택이 가능합니다. 스크롤해서 선택해주세요."
      >
        <Box sx={{
          position: 'absolute',
          top: '50%',
          left: '50%',
          transform: 'translate(-50%, -50%)',
          bgcolor: 'white',
          border: '1px solid #000',
          boxShadow: 18,
          p: 8,
          overflow: 'auto',
          maxHeight: '80vh',   
        }}>
          <Box sx={{
            position: 'absolute',
            top: '5px',
            right: '5px',
          }}>
          <IconButton onClick={handleClose}>
            <CloseIcon />
          </IconButton>
          </Box>
          <h2 id="modal-title">국가 선택</h2>
          <p id="modal-description">다중선택이 가능하며 스크롤해서 선택해주세요.</p>
          <TableContainer style={{ width: '800px', height: '800px' }}> 
            <Table style={{ width: '100%', height: '100%' }}>
              <TableBody>
                {[...Array(20)].map((_, i) => (
                  <TableRow key={i}>
                {i === 0 && (
                  <TableCell className="contentName_row" rowSpan={2} style={{color:"white"}}> 주요국가 </TableCell>
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
                    {[...Array(5)].map((_, j) => (                      
                      <TableCell key={`${i}-${j}`}>
                        <Button className='nationButton_table' variant="outlined" color="primary" onClick={() => handleSelectCountry(i, j)}>선택</Button>
                      </TableCell>
                    ))}
                  </TableRow>
                ))}
              </TableBody>
            </Table>
          </TableContainer>
          <div style={{ display: 'flex', justifyContent: 'center', alignItems: 'center', marginTop: '25px' }}>
          <Button className='confireButton_table' variant="outlined" onClick={handleClose} style={{marginRight:'30px', backgroundColor:'#CBA585', color:'white'}}>확인</Button>
          <Button className='confireButton_table' variant="outlined" onClick={handleClose} style={{marginLeft:'30px'}}>취소</Button>
          </div>
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
