package study01.test05;

class Father{
	void work() {
		System.out.println("아버지가 일을 하십니다.");
	}
}		//extends를 사용하여 상속관계(확장)을 맺어준다.
public class Son extends Father{
	void work() {
		System.out.println("나도 일을 한다.");
	}		//overriding : Father의 work는 그대로 두고 그 위에 Son클래스의 work를 덧붙여 올린다.
	public static void main(String[] args) {
	Son s = new Son();
	s.work();
	}
}
