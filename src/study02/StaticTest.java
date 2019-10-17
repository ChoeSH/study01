package study02;

public class StaticTest {
	static final int a;
	static {		//프리로딩:final로 선언한 a값을 변경
		a=10;
	}
	public static void main(String[] args) {
		System.out.println(StaticTest.a);
	}
}
