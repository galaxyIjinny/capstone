import React from "react";
import Navbar from "../../components/navbar/Navbar";
import TrademarkForm from "../../components/trademarkForm/TrademarkForm";
import ClassificationForm from "../../components/classificationForm/ClassificationForm";
import ManagerForm from "../../components/managerForm/ManagerForm";
import ApplicantForm from "../../components/applicantForm/ApplicantForm";

const TrademarkRegistration = () => {
  return (
    <div className="trademarkRegisteration">
      <Navbar backgroundColor="white" borderBottom="1px solid #eee" />
      <TrademarkForm />
      <ClassificationForm />
      <ManagerForm />
      <ApplicantForm />
    </div>
  );
};

export default TrademarkRegistration;
