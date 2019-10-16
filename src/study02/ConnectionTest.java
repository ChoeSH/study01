package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "bdi";
		String password = "12345678";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, password);	//DB 접속
			String sql = "select* from user_info";
			Statement stmt = con.createStatement();		//쿼리 편집기 생성및 호출
			ResultSet rs = stmt.executeQuery(sql);		//쿼리 편집기에서 query 실행
			while(rs.next()) {
			System.out.println(rs.getString("id"));
			
			}
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver 로딩 실패");
		} catch (SQLException e) {
			System.out.println("오라클 연결 실패");
		}
	}
}
