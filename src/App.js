import { Route, Routes } from "react-router-dom";
import Nav from "./components/nav/Nav";
import Notfound from "./components/notfound/Notfound";
import Main from "./components/main/Main";
import DomesticMark from "./components/domesticMark/DomesticMark";
import OverseasMark from "./components/overseasMark/OverseasMark";
import Step from "./components/step/Step";
import Price from "./components/price/Price";
import QnA from "./components/qna/QnA.js";
import Footer from "./components/footer/Footer";
import Introduce from "./components/introduce/introduce";
import '@fontsource/roboto/300.css';
import '@fontsource/roboto/400.css';
import '@fontsource/roboto/500.css';
import '@fontsource/roboto/700.css';
import "./App.css";

const App = () => {
  return (
    <div className="App">
      <Nav />
      <Routes>
        <Route path="/" element={<Main />} />
        <Route path="/domesticmark" element={<DomesticMark />} />
        <Route path="/step" element={<Step />} />
        <Route path="/price" element={<Price />} />
        <Route path="/introduce" element={<Introduce />} />
        <Route path="/qna" element={<QnA />} />
        <Route path="*" element={<Notfound />} />
      </Routes>
      <Footer />
    </div>
  );
};

export default App;
