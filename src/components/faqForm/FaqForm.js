import React, { useState } from "react";
import { Accordion, AccordionSummary, AccordionDetails, Typography } from "@material-ui/core";
import ExpandMoreIcon from "@material-ui/icons/ExpandMore";
import Navbar from "../../components/navbar/Navbar";
import { makeStyles } from '@material-ui/core/styles';
import './FaqForm.css';
import Footer from "../../components/footer/Footer";

const faqData = [
  {
    question: "아이디를 까먹었어요",
    answer: "Answer1"
  },
  {
    question: "비밀번호를 까먹었어요",
    answer: "Answer2"
  },
  {
    question: "나이제한 있나요",
    answer: "Answer3"
  },
  {
    question: "얼마에요",
    answer: "Answer4"
  },
  {
    question: "해외출원은 어떻게해요",
    answer: "Answer5"
  },
  {
    question: "마드리드가 뭐에요",
    answer: "Answer6"
  },
  {
    question: "환불 해주세요",
    answer: "Answer7"
  }
];

const useStyles = makeStyles((theme) => ({
  root: {
    width: '70%',
    margin: '0 auto',
    marginBottom: theme.spacing(15),
  },
  accordion: {
    '&:not(:last-child)': {
      borderBottom: 0,
    },
    '&:before': {
      display: 'none',
    },
    '&$expanded': {
      margin: 'auto',
    },
  },
  expanded: {},
  accordionSummary: {
    backgroundColor: '#F5F5F5',
    marginBottom: theme.spacing(2),
    minHeight: 64,
    '&$expanded': {
      minHeight: 64,
    },
  },
  expandIcon: {
    color: '#000',
    fontSize: '1.5rem',
    marginRight: theme.spacing(1),
    transition: 'transform 0.3s ease-in-out',
    '&$expanded': {
      transform: 'rotate(180deg)',
    },
  },
  accordionDetails: {
    backgroundColor: '#F5F5F5',
    padding: theme.spacing(2),
  },
  question: {
    fontWeight: "bold",
    fontSize: "1.2rem",
    fontFamily: "Arial",
  },
  answer: {
    fontSize: "1rem",
    fontFamily: "Arial",
  }
}));

const FaqForm = () => {
  const classes = useStyles();
  const [expanded, setExpanded] = useState(false);

  const handleChange = (panel) => (event, isExpanded) => {
    setExpanded(isExpanded ? panel : false);
  };

  return (
    <div className="faq">
      <div className={classes.root}>
    <Navbar />
    <br/><br/><br/><br/><br/>      
    <div className="faqTitle">FAQ</div>
      {faqData.map((faq, index) => (
        <Accordion key={index}
        className={classes.accordion}
        classes={{
          expanded: classes.expanded,
        }}
        expanded={expanded === `panel${index}`}
        onChange={handleChange(`panel${index}`)}>
          <AccordionSummary  className={classes.accordionSummary}
            classes={{
              expandIcon: classes.expandIcon,
              expanded: classes.expanded,
            }}
            expandIcon={<ExpandMoreIcon />}
            aria-controls={`panel${index}-content`}
            id={`panel${index}-header`}>
            <Typography variant="h6" className={classes.question}>Q. {faq.question}</Typography>
          </AccordionSummary>
          <AccordionDetails >
            <Typography className={classes.answer}>&nbsp;&nbsp;&nbsp;{faq.answer}</Typography>
          </AccordionDetails>
        </Accordion>
      ))}
      </div>
      <Footer />
    </div>
  );
};
export default FaqForm;
