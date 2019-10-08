package study01.test10;

public class OverloadingTest {

	void test() {
		System.out.println("난 매개변수 없음");
	}
	
	void test(int a) {
		System.out.println("난 int타입 a 매개변수");
	}
	
	void test(int a,String s) {
		System.out.println("난 int타입 a와 String타입 s 매개변수");
	}
	
	public static void main(String[] args) {
		OverloadingTest olt = new OverloadingTest();
		
		olt.test();
		olt.test(1);
		olt.test(2,"사람");
	}

}
