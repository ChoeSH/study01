package study01.test11;

interface Promise{		//interface는 선언만 가능하다.
	void test();		//interface의 접근제어자는 선언하지 않으면 public이다.
	public void test1();
}
class Father{
	int a;
	void test2() {
		
	}
}
public class InterfaceTest extends Father implements Promise{	//class와 interface는 상속이 아니라 implements를 사용한다.
	int a=1;
	public void test() {		//반드시 인터페이스에 선언된 메소드를 오버라이딩을 해야 한다.
		System.out.println(super.a);
	}
	public void test1() {
		System.out.println(a);
	}
	protected void test2() {
		
	}
	
	public static void main(String[] args) {
		
		InterfaceTest ft=new InterfaceTest();
		ft.test();
		ft.test1();	
		
	}
}
