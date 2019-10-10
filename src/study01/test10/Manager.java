package study01.test10;

class Employee{		//슈퍼클래스
	public void a() {
		System.out.println("직원 호출");
	}
}

public class Manager extends Employee {		//서브클래스
	public void a() {
		System.out.println("관리자 호출");		//오버라이딩
	}
	
	public static void main(String[] args) {
		Manager m =new Manager();
		m.a();
	}
}
