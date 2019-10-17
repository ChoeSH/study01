package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {
	
	public static void main(String[] args) {
		Connection con= null;
		try {
			con=DriverManager.getConnection(ConnectionTest2.URL,ConnectionTest2.ID,ConnectionTest2.PWD);
			String sql="insert into user_info(id, pwd, name, age, etc)";
			Scanner scan=new Scanner(System.in);
			System.out.println("당신의 정보를 입력해주세요.");
			String info = scan.nextLine();
			String[] infos=info.split(",");
			sql +="values( ";
			for(int i=0; i<infos.length; i++) {
				sql+="'"+infos[i]+"',";
			}
			sql=sql.substring(0,sql.length()-1);
			sql +=")";
			System.out.println(sql);
			
			Statement stmt = con.createStatement();		//쿼리 편집기 생성및 호출
			int result = stmt.executeUpdate(sql);
			System.out.println("인서트된 갯수 : "+result);
			
	}catch (SQLException e) {
		System.out.println("연결 실패");
	}
	}
}
