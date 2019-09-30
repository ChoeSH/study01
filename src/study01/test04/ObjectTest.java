package study01.test04;

import java.util.Random;

public class ObjectTest {
	int age;		//멤버변수인 age는 자바에서 자동으로 0으로 초기화 된다.
	String name;
	
	String getStr() {
		return null;	//null로 리턴한다.
	}
	//Random r;
	
	//public 위치에 아무것도 안써있을때는 default 이다.		protected에서 상속을 한다.(자식 클래스만 사용 가능)
	public static void main(String[] args) {			//public <-> private(내 클래스에서만 사용가능)
		ObjectTest ot= new ObjectTest();	//이 부분에서 age가 0으로 초기화된다, name은 null로 초기화 된다.
		ot.age=10;
		System.out.println(ot.age);
		System.out.println(ot.name);
		
		//System.out.println(ot.r.nextInt());	//Runtime exception 문법적인 오류는 없지만 실행중 에러 발생
		
	}
}
//정해지지 않은 데이터타입(맨앞이 대문자)의 초기화값은 NULL이다.	ex)String,Scanner,Random
//정해져있지 않은 데이터타입을 초기화할때는 new를 사용한다.
//compile exception(컴파일 중 에러)	, runtime exception(실행 중 에러)