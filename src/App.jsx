import "./App.scss";
import Main from "./pages/main/Main";
import Price from "./pages/price/Price";
import DomesticMark from "./pages/domesticMark/DomesticMark";
import Faq from "./pages/faq/Faq";
import { Route, Routes } from "react-router-dom";
import "./App.scss";

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
