package study01.test08;

class Mother{
	public void a() {
		System.out.println("엄마 클래스 메소드");
	}
}

public class Overriding extends Mother{		//오버라이딩이 일어나 a()은 Overriding클래스의 a()가 출력된다.
	
	public void a() {
		super.a();			//Mother 클래스의 a()메소드 호출
		System.out.println("오버라이딩 클래스 메소드");
	}
	
	public static void main(String[] args) {
		Overriding or = new Overriding();
		or.a();
		
		Mother m =new Mother();
		m.a();
		
	}
}
