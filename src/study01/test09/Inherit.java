package study01.test09;

import study01.test08.Atom;

public class Inherit extends Atom{
	
	public String toString() {
		return "나는 메모리 주소 안찍는다";
	}
	public void protectedTest(){	//다른 패키지에 있는 protectedTest메소드에  오버라이딩 되어 18번에서 이 메소드가 호출된다
		System.out.println("나는 test09 메소드");
	}
	
	static void test(Object i) {
		
	}

	public static void main(String[] args) {
		
		Inherit i=new Inherit();
		i.protectedTest();
		System.out.println(new Inherit());		//자바에서 사용되는 모든 데이터타입은 Object에 포함되기 때문에 가능하다.
		
		Object obj=1;
		obj ="1";
		obj=new Atom();
		
	}

}
