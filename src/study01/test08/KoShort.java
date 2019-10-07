package study01.test08;

class Cat{
	public void sleep() {
		System.out.println("고양이가 잡니다.");
	}
}
public class KoShort extends Cat{
	public void sleep() {
		super.sleep();		//Cat 클래스의 sleep메소드를 호출
		System.out.println("코숏이 잡니다.");		//상속 받는 KoShort클래스는 Cat클래스의 메소드를 사용할수 있으므로 더 크다
	}
	public static void main(String[] args) {
		Cat ks = new KoShort();
		ks.sleep();
		
		Cat[] cats = new Cat[4];
		cats[0]=new Cat();
		cats[1]=new KoShort();
		cats[0].sleep();
		cats[1].sleep();
	}

}
