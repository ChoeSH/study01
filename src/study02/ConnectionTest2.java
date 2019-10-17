package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConnectionTest2 {
	public static final String URL;
	public static final String ID;
	public static final String PWD;
	public static final String DRIVER;
	
	static {		//프리로딩
		DRIVER ="oracle.jdbc.driver.OracleDriver";
		URL="jdbc:oracle:thin:@localhost:1521:xe";
		ID="bdi";
		PWD="12345678";
	}
	
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, ID, PWD);	//DB 접속
			String sql = "select* from user_info";
			Statement stmt = con.createStatement();		//쿼리 편집기 생성및 호출
			ResultSet rs = stmt.executeQuery(sql);		//쿼리 편집기에서 query 실행
						
			List<Map<String,String>> userList=new ArrayList<Map<String,String>>();
			while(rs.next()) {
				Map<String, String> map= new HashMap<String,String>();
				map.put("id", rs.getString("id"));
				map.put("pwd", rs.getString("pwd"));
				map.put("name", rs.getString("name"));
				map.put("age", rs.getString("age"));
				userList.add(map);
			}
			System.out.println(userList); 
		}catch (SQLException e) {
			System.out.println("연결 실패");
		}
		catch (ClassNotFoundException e) {
			System.out.println("접속 실패");
		}
	}
}
