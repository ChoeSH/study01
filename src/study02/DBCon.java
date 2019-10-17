package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String URL;
	private static final String ID;
	private static final String PWD;
	private static final String DRIVER;
	
	static {		//프리로딩
		DRIVER ="oracle.jdbc.driver.OracleDriver";
		URL="jdbc:oracle:thin:@localhost:1521:xe";
		ID="bdi";
		PWD="12345678";

	try {
		Class.forName(DRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();		
		}
	}
	private static Connection con;
	
	public static Connection getCon(){
		if(con==null) {
			try {
			con=DriverManager.getConnection(URL,ID,PWD);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
		return con;
	}
	public static void main(String[] args){
		
	}
}
