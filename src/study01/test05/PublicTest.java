package study01.test05;

import study01.test04.PrivateTest;

//import java.util.Random;		//java패키지 안의 util패키지안의 Random 클래스 파일
								//(접근 제어자) defalut class는 같은 패키지 내에서만 호출이 가능하다.
								//Private int는 같은 클래스 내에서만 호출이 가능하다.
public class PublicTest {
	public int num;
	
	public static void main(String[] args) {
		PublicTest pt= new PublicTest();
		System.out.println(pt.num);
		PrivateTest pt2=new PrivateTest();
		System.out.println(pt2.num);		//PrivateTest클래스의 int인 num은 패키지가 다르면 사용이 불가능하다.
		}									//PrivateTest클래스의 num을 public int로 선언 할 경우 사용 가능하다.
}

//Public > protected > default > private 접근제어자 크기