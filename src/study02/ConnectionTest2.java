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

public class ConnectionTest2 {
	public static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String ID="bdi";
	public static final String PWD="12345678";
	public static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			Class.forName(DRIVER);
			con=DriverManager.getConnection(URL,ID,PWD);
			String sql="select* from user_info";
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery(sql);
			
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
