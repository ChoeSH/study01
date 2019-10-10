package study01.test10;

class Father{
	
}
public class Son extends Father{

	public void Test() {
		System.out.println("난 테스트 ");
	}
	public void sonsTest() {
		System.out.println("난 아들 테스트");
	}
		
	public static void main(String[] args) {
		Father s = new Son();
		
		Son s2=(Son)s;
		s2.sonsTest();
		
		Father f=new Father();
		if(f instanceof Son) {	
		//주로 조건문에 사용되며, instanceof의 왼쪽에는 참조변수를 오른쪽에는 타입(클래스명)이 피연산자로 위치합니다. 
		//그리고 연산의 결과로 boolean값인 true, false 중의 하나를 반환 합니다.
			s2=(Son)f;
			s2.sonsTest();
		}
	}

}
