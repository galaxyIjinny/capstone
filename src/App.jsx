import "./App.scss";
import Main from "./pages/main/Main";
import Price from "./pages/price/Price";
import { Route, Routes } from "react-router-dom";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Main />} />
        <Route path="/price" element={<Price />} />
      </Routes>
    </div>
  );
}

export default App;
