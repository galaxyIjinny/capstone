import { Link } from "react-router-dom";
import { FiSearch } from "react-icons/fi";
import "./Nav.css";
const Nav = () => {
  return (
    <div className="navbar">
      <div className="navbar_logo">
        <Link to="/">Brandnew</Link>
      </div>
      <ul className="navbar_menu">
        <li>
          <Link to="domesticmark">국내상표등록</Link>
        </li>
        <li>
          <Link to="overseasmark">해외상표등록</Link>
        </li>
        <li>
          <Link to="search">상표검색</Link>
        </li>
        <li>
          <Link to="price">비용안내</Link>
        </li>
        <li>
          <Link to="step">절차안내</Link>
        </li>
        <li>
          <Link to="introduce">회사소개</Link>
        </li>
        <li>
          <Link to="qna">Q&A</Link>
        </li>
      </ul>
      <ul className="navbar_search">
        <li>
          <input type="text" placeholder="검색할 상표를 입력해주세요&nbsp;" />
        </li>
        <li>
          <Link to="/search">
            <FiSearch style={{ fontSize: "1.2rem" }} />
          </Link>
        </li>
      </ul>
    </div>
  );
};

export default Nav;
