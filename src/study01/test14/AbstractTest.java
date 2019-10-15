package study01.test14;

class Son extends AbstractTest{
	public void test() {
		System.out.println("test");
	}
}

public abstract class AbstractTest {	//추상 클래스: 인터페이스의 기능과 class의 기능을 함께 사용가능
	
	public abstract void test();
	
	public static void main(String[] args) {
		AbstractTest at=new Son();
		at.test();
	}
}
