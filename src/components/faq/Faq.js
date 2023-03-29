import React, { useState } from "react";
import { Accordion, AccordionSummary, AccordionDetails, Typography } from "@material-ui/core";
import ExpandMoreIcon from "@material-ui/icons/ExpandMore";
import Navbar from "../../components/navbar/Navbar";

const faqData = [
  {
    question: "Question1",
    answer: "Answer1"
  },
  {
    question: "Question2",
    answer: "Answer2"
  },
  {
    question: "Question3",
    answer: "Answer3"
  },
  {
    question: "Question4",
    answer: "Answer4"
  },
  {
    question: "Question5",
    answer: "Answer5"
  },
  {
    question: "Question6",
    answer: "Answer6"
  }
];

const Faq = () => {
  const [expanded, setExpanded] = useState(false);

  const handleChange = (panel) => (event, isExpanded) => {
    setExpanded(isExpanded ? panel : false);
  };

  return (
    <div>
    <Navbar />
    <br/><br/><br/>    
    <br/><br/><br/>
      {faqData.map((faq, index) => (
        <Accordion key={index} expanded={expanded === `panel${index}`} onChange={handleChange(`panel${index}`)}>
          <AccordionSummary expandIcon={<ExpandMoreIcon />}>
            <Typography variant="h6">{faq.question}</Typography>
          </AccordionSummary>
          <AccordionDetails>
            <Typography variant="body1">{faq.answer}</Typography>
          </AccordionDetails>
        </Accordion>
      ))}
    </div>
  );
};

export default Faq;
