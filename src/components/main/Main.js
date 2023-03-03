import { ReactComponent as mainImages } from "../../assets/images/메인.jpeg";
import mainBackground from "../../assets/images/메인.jpeg";
import { HiArrowRight } from "react-icons/hi";
import { Link } from "react-router-dom";
import "./Main.css";
const Main = () => {
  return (
    <div className="main" style={{backgroundImage: `url(${mainBackground})`,
    backgroundRepeat: 'no-repeat',
    width:'1920px', height: "1080px" }}>
      <div className="container">
        <div className="title">든든하고 합리적인 상표등록</div>
        <Link to="/domesticmark">
          <button id="domestic">
            국내상표등록
            <span className="arrow">
              <HiArrowRight />
            </span>
          </button>
        </Link>
        <Link to="overseasmark">
          <button id="overseas">
            해외상표등록
            <span className="arrow">
              <HiArrowRight />
            </span>
          </button>
        </Link>
      </div>
      <div>
        <div className="statistics">
          <div className="mark"></div>
          <div className="search"></div>
          <div className="member"></div>
        </div>
      </div>
    </div>
  );
};

export default Main;
