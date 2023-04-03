import "./App.scss";
import Main from "./pages/main/Main";
import Price from "./pages/price/Price";
import TrademarkRegistration from "./pages/trademarkRegistration/TrademarkRegistration";
import { Route, Routes } from "react-router-dom";
import "./App.scss";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Main />} />
        <Route path="/price" element={<Price />} />
        <Route
          path="/trademarkRegistration"
          element={<TrademarkRegistration />}
        />
      </Routes>
    </div>
  );
}

export default App;
