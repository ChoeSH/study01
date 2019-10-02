package study01.test07;

class Mother{
	public void cook() {
		System.out.println("반찬 없으니까 밥말아 먹어라");
	}
}
public class Son extends Mother{
	
	public void cook(int a){			
		super.cook();					//Mother클래스의 cook()메소드를 호출하기 위해서는 super.메소드 이름을 사용한다.
		System.out.println("물밥 지겹다. 라면을 먹겠다.");		//10~12라인의 cook() 메소드가 생성된 후에는 s.cook()에서 실행됨
	}													//Mother클래스의 cook() 메소드가 삭제 되는것은 아님
	
	public static void main(String[] args) {
		Son s = new Son();
		s.cook();
		s.cook(0);					//오버로딩이 일어나 Son클래스의 cook(int a)가 호출된다.

	}
}
