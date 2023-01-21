import { ReactComponent as WorkTime } from "../../assets/images/WorkTime.svg";
import { HiArrowRight } from "react-icons/hi";
import { Link } from "react-router-dom";
import "./Main.css";
const Main = () => {
  return (
    <div className="main">
      <WorkTime width={1000} height={850} />
      <div className="container">
        <div className="title">든든하고 합리적인 상표등록</div>
        <Link to="/domesticmark">
          <button id="domestic">
            국내상표등록
            <HiArrowRight style={{ fontSize: "1.3rem" }} />
          </button>
        </Link>
        <Link to="overseasmark">
          <button id="overseas">
            해외상표등록
            <HiArrowRight style={{ fontSize: "1.3rem" }} />
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
