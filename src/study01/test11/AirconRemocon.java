package study01.test11;

public class AirconRemocon implements Remote{

	@Override
	public void on() {
		System.out.println("에어컨을 킨다.");
	}

	@Override
	public void off() {
		System.out.println("에어컨을 끈다.");
	}

}
