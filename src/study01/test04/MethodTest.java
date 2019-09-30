package study01.test04;

public class MethodTest {			//메소드는 ()(괄호)가 있다. ex) for,if,main
	static int num=1;						//클래스 영역 안에는 선언만 가능하고 실행은 불가능하다.
	static int num() {
		return 1;
	}
	
	public static void main(String[] args) {	//main 메소드는 무조건 class 안에 있어야 한다.{}내부에 있어야 함
		System.out.println(num);

	}
}
