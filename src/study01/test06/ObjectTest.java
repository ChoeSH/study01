package study01.test06;

public class ObjectTest {
	int num1;
	int num2;
	String str= new String("");
	
	public static void main(String[] args) {
		ObjectTest obt= new ObjectTest();
		obt.num1=3;
		obt.num2=10;
		System.out.println(obt.num1);
		System.out.println(obt.num2);
		
		obt= new ObjectTest();
		System.out.println(obt.num1);	//num1과 num2는 0으로 초기화 된다.
		System.out.println(obt.num2);	//정해져 있는 데이터 타입은 값을 비교하면 된다.
			
		ObjectTest ot= new ObjectTest();		//새로운 ot와 ot2 변수를 생성
		ObjectTest ot2= new ObjectTest();
				
		System.out.println(ot.str==ot2.str);	//new String으로 생성한 str은 자바가 생성한 str과 생성된 주소가 다르다
		
	}
}
//접근 제어자 크기 순서 public protected default private
//자바는 class기반 language