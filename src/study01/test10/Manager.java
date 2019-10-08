package study01.test10;

class Employee{
	public void a() {
		System.out.println("직원 호출");
	}
}

public class Manager extends Employee {
	public void a() {
		System.out.println("관리자 호출");
	}
	
	public static void main(String[] args) {
		Manager m =new Manager();
		m.a();
	}
}
