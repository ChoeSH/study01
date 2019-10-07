package study01.test08;

class Father{
	int a=1;
	Father(){
		System.out.println("난 아빠 클래스의 생성자");
	}
}

public class Constructor extends Father{		//자바가 자동으로 생성하는 기본 생성자
	Constructor(){
		System.out.println(a);
		System.out.println("난 생성자 클래스의 생성자");
	}
	
	public static void main(String[]args) {
		Constructor c=new Constructor();		//생성자 클래스의 생성자를 만들면서 상속하는 아빠클래스부터 읽는다.
	}											//생성자는 클래스의 이름과 무조건 동일해야 한다.
												//따라서 생성자는 오버로딩은 불가능하다.
}		
