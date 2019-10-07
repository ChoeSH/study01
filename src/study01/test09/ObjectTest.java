package study01.test09;

public class ObjectTest {
	
	int num1;
	static int num2;
	public static void main(String[] args) {
		ObjectTest ot=new ObjectTest();
		ot.num1=10;
		num2=11;
		System.out.println(ot.num1);
		System.out.println(ObjectTest.num2);	//static int는 new선언 없이 사용할수 있다.하지만 클래스가 다른 경우는 생략이 불가
		
	}		//num2는 14번이 끝나면 사라진다.	
}
