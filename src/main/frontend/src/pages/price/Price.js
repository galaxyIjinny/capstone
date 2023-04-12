import Navbar from "../../components/navbar/Navbar";
import PriceForm from "../../components/priceForm/PriceForm";

function Price() {
  return (
    <div>
      <Navbar backgroundColor="rgb(255 255 255 / 0.8)" borderBottom={true} />
      <PriceForm />
    </div>
  );
}
export default Price;
