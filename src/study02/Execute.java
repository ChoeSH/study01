package study02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute {
	Connection con =DBCon.getCon();
	Scanner scan = new Scanner(System.in);
	
	void insert(){
		System.out.println("id를 입력해주세요");
		String id ="'" +scan.nextLine()+"'";
		System.out.println("pwd를 입력해주세요");
		String pwd ="'"+ scan.nextLine()+"'";
		System.out.println("name를 입력해주세요");
		String name ="'"+ scan.nextLine()+"'";
		System.out.println("age를 입력해주세요");
		String age ="'"+ scan.nextLine()+"'";
		System.out.println("etc를 입력해주세요");
		String etc ="'"+ scan.nextLine()+"'";
		
		try{
		String sql="insert into user_info(id,pwd,name,age,etc)";
		sql+= "values(" +id+","+pwd+","+name+","+age+","+etc+")";	
		Statement stmt = con.createStatement();		
		int result = stmt.executeUpdate(sql);
		System.out.println(result+ "개 입력완료");
		}catch(SQLException e) {
			e.printStackTrace();		
		}
	}
	void update() {
		System.out.println("pwd를 변경할 id를 입력해주세요");
		String id ="'" +scan.nextLine()+"'";
		System.out.println("변경전 pwd를 입력해주세요");
		String ppwd ="'"+ scan.nextLine()+"'";
		System.out.println("변경할 pwd를 입력해주세요");
		String pwd ="'"+ scan.nextLine()+"'";

		try {
			String sql="update user_info set pwd="+pwd+"where id="+id+"and "+"pwd="+ppwd;
			Statement stmt=con.createStatement();	
			int result = stmt.executeUpdate(sql);
			System.out.println(result+ "개 변경완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void delete() {
		try {
			System.out.println("삭제할 아이디를 작성해 주세요");
			String id= scan.nextLine();
			String sql="delete from user_info where id='"+id+"'";
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("삭제된 개수 : " +result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void select() {
		try {
			String sql = "select* from user_info";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("pwd"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("age"));
				System.out.println(rs.getString("etc"));
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		void initResponse() {
			String res="";
			while(!res.equals("q")) {
			System.out.println("원하는 서비스 번호를 입력 :");
			System.out.println("1. 유저 생성");
			System.out.println("2. 유저 삭제");
			System.out.println("3. 유저 수정");
			System.out.println("4. 유저 조회");
			System.out.println("q.종료");
			res=scan.nextLine();
			if(res.equals("q")) {
				System.out.println("종료");
			}else {
				if(res.equals("1")) {insert();
				}
				if(res.equals("2")) {delete();
				}
				if(res.equals("3")) {update();
				}
				if(res.equals("4")) {select();
				}
			}
		}
	}
		
	public static void main(String[] args) {
		Execute ex=new Execute();
		ex.initResponse();
		}
}
