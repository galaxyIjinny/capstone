import Navbar from "../../components/navbar/Navbar";
import MarkSelectForm from "../../components/markSelectForm/MarkSelectForm";
import NationSelectForm from "../../components/nationSelectForm/NationSelectForm";
import TrademarkForm from "../../components/trademarkForm/TrademarkForm";
import ClassificationForm from "../../components/classificationForm/ClassificationForm";
import ApplicantForm from "../../components/applicantForm/ApplicantForm";
import "./DomesticMark.css";
import PersonalForm from "../../components/applicantForm/personalForm/PersonalForm";
import ManagerForm from "../../components/managerForm/ManagerForm";

function DomesticMark() {
  return (
    <div className="markPage">
      <Navbar backgroundColor="rgb(255 255 255 / 0.8)" borderBottom={true} />
      <MarkSelectForm />
      <TrademarkForm />
      <ClassificationForm />
      <NationSelectForm />
      <ApplicantForm />
      <ManagerForm />
    </div>
  );
}
export default DomesticMark;
