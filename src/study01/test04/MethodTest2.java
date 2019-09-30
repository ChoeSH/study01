package study01.test04;

public class MethodTest2 {
	static void test() {		//void 테이터 타입은 return을 하지 않고, 변수를 선언할 수 없다.
		System.out.println(1);	//test 메소드 선언부
	}
	
	static char get() {
		return 'c';			//선언한 char타입의 get()메소드에 char데이터 타입의 'c'를 리턴한다.
	}
	
	static int getNum() {
		return 0;			//선언한 int타입의 getNum()메소드에 int데이터 타입의 0을 리턴한다.
	}
	
	public static void main(String[] args) {
		test();		//test메소드를 호출하기 위해서는 test()를 사용한다.		test 메소드 호출부
		int a = getNum();
		System.out.println(a);
		//getNum()=10;	->>	불가능하다. getNum()은 정의가 아닌 호출이기 때문에 될 수 없다.
	}
}
