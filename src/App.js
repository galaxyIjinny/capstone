import "./App.scss";
import Main from "./pages/main/Main";
import { Route, Routes } from "react-router-dom";
import Price from "./components/price/Price";
import DomesticMark from "./components/domesticMark/DomesticMark";
import Faq from "./components/faq/Faq";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Main />} />
        <Route path="/price" element={<Price />} />
        <Route path="/domesticmark" element={<DomesticMark />} />
        <Route path="/faq" element={<Faq />} />
      </Routes>
    </div>
  );
}

export default App;
