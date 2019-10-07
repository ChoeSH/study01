package study01.test08;

public class Inherit extends Atom{
	Inherit(){
		System.out.println("이건 Inherit 생성자");
	}
	
	public static void main(String[] args) {
	Inherit in = new Inherit();
	in.defaultTest();
	in.protectedTest();
	in.publicTest();
	
	
}
}
