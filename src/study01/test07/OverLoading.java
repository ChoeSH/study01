package study01.test07;

public class OverLoading {
	public void test() {			//overloading : 파라미터 안의 매개변수의 값에 따라 같은 이름의 메소드를 사용가능
		System.out.println("test() 메소드 호출");
	}
	public void test(int num, int a, int b) {
		System.out.println("test(num,a,b)메소드 호출");
	}
	public void test(String str) {
		System.out.println("test(str) 메소드 호출");
	}
	public void test(String str,int a, int c) {
		System.out.println("test(str,a,c) 메소드 호출");
	}
	
	public static void main(String[] args) {
		OverLoading ol=new OverLoading();
		ol.test();
		ol.test(1,2,3);
		ol.test("사람");
		ol.test("인간",1,3);
	}
}
