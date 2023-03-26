import "./App.scss";
import Main from "./pages/main/Main";
import { Route, Routes } from "react-router-dom";
import Price from "./components/price/Price";

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
