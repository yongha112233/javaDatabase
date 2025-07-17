package t1_database.t1_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class T2_ConnectionDAO {
	Connection conn = null;

	public T2_ConnectionDAO() {
		
		String ur1 = "jdbc:mysql://localhost:3306/springgroup";
		String user = "atom";
		String password = "1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver 검색 성공!!");
			
			conn = DriverManager.getConnection(ur1, user, password);
			System.out.println("Database 연결 성공!!!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver 검색 실패~~");
		} catch (SQLException e) {
			System.out.println("Database 연결 실패");
		} finally {
//			try {
//				if(conn != null) conn.close();
//			} catch (SQLException e) {}
			System.out.println("작업끝...");
		}		
		
	}
	// conn객체 close
	public void connClose() {
		try {
			if(conn != null) {
				conn.close();
				System.out.println("데이터베이스 연결 끊기 성공");
			}
		} catch (SQLException e) {}
	}
}
