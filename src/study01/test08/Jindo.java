package study01.test08;

class Dog{
	void a() {		//메소드		
		System.out.println("a메소드");
		
	}
	void a(int a) {		//바로 위의 a메소드와 오버로딩
		
	}
	
	Dog(){			//생성자
		System.out.println("Dog생성자");
	}
}

public class Jindo extends Dog{
	
	public void a() {		//메소드
		System.out.println("진도클래스 a메소드");		//Dog클래스의 a메소드와 오버라이딩
	}

	public static void main(String[] args) {
		Dog d = new Dog();	//Dog클래스 d변수
		d.a();				//a메소드 호출
		
		Jindo j =new Jindo();	//Jindo클래스 j변수
		j.a();
		
		
	}

}
