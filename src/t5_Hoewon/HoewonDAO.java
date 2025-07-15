package t5_Hoewon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HoewonDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/springgroup";
	private String user = "atom";
	private String password = "1234";
	
	private HoewonVO vo = null;
	private String sql = "";
	
	public HoewonDAO() {
	  try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패~~~");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패~~");
		}
	}
	
	// connection객체 닫기
	public void connClose() {
		try {
			if(conn != null) conn.close();
		} catch (Exception e) {}
	}
	
	// stmt객체 닫기
	public void pstmtClose() {
		if(pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException e) {}
	}
	
	// rs객체 닫기
	public void rsClose() {
		if(rs != null)
			try {
				rs.close();
				pstmtClose();
			} catch (SQLException e) {}
	}

	// 개별 회원 조회
	public HoewonVO getNameSearch(int idx) {
		vo = new HoewonVO();
		try {
			sql = "select * from hoewon where idx=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				vo.setAddress(rs.getString("address"));
			}
			else vo = null;
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		}	finally {
			rsClose();
		}
		return vo;
	}

	// 회원 가입처리(insert)
	public int setHoewonInput(HoewonVO vo) {
		int res = 0;
		try {
			sql = "insert into hoewon values (default,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getAge());
			pstmt.setString(3, vo.getGender());
			pstmt.setString(4, vo.getAddress());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			pstmtClose();
		}
		return res;
	}

	// 회원자료 삭제처리
	public int setHoewonDelete(int idx) {
		int res = 0;
		try {
			String sql = "delete from hoewon where idx = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		}	finally {
			pstmtClose();
		}
		return res;
	}

	// 회원 전체 리스트
	public ArrayList<HoewonVO> getHoewonList() {
		ArrayList<HoewonVO> vos = new ArrayList<HoewonVO>();
		try {
			sql = "select * from hoewon order by name";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new HoewonVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				vo.setAddress(rs.getString("address"));
				vos.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		}	finally {
			rsClose();
		}
		return vos;
	}

	// 회원정보 수정처리
	public int setHoewonUpdate(int idx, int choice, String content) {
		int res = 0;
		try {
			if(choice == 1) {
				sql = "UPDATE hoewon SET name = ? WHERE idx = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, content);
			}
			else if(choice == 2) {
				sql = "UPDATE hoewon SET age = ? WHERE idx = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(content));
			}
			else if(choice == 3) {
				sql = "UPDATE hoewon SET gender = ? WHERE idx = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, content);
			}
			else if(choice == 4) {
				sql = "UPDATE hoewon SET address = ? WHERE idx = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, content);
			}
			pstmt.setInt(2, idx);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		}	finally {
			pstmtClose();
		}
		return res;
	}
	//동명 2인 체크
	public HoewonVO getNameCheck(String name) {
		vo = new HoewonVO();
		try {
			sql = "select * from hoewon where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			System.out.println("name : " + name);
			if(rs.next()) {
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				vo.setAddress(rs.getString("address"));
				System.out.println("vo : " + vo);
			}
			else vo = null;
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		}	finally {
			pstmtClose();
		}
		return vo;
	}

}
