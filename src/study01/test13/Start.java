package study01.test13;

interface Test2{
	static void print() {
		System.out.println("난 인터페이스 print()");	//interface에서 메소드에 static을 붙이면 메소드를 정의할 수 있다.
	}
}

class End{
	final void test() {
		System.out.println("난 End의 test메소드");
	}
}

public class Start extends End{
	static final String fStr="asdf";	//final로 선언된 fstr은 값을 변경할수 없다.
	
	/*void test(){
		System.out.println("난 Start의 test메소드");
	}		 final void로 선언된 test()메소드는 상속되어도 오버라이딩이 성립하지 않는다.	*/
	
	public static void main(String[] args) {
		Test2.print();
	}
}
