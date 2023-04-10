import FaqForm from "../../components/faqForm/FaqForm";
import Navbar from "../../components/navbar/Navbar";

function Faq() {
  return (
    <div>
      <Navbar backgroundColor="rgb(255 255 255 / 0.8)" borderBottom={true} />
      <FaqForm />
    </div>
  );
}
export default Faq;
