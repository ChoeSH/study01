package study01.test03;

public class Compare {

	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1<num2);
		System.out.println(num1>num2);
		System.out.println(num1<=num2);
		System.out.println(num1>=num2);
		System.out.println(num1==5+5);	//int 데이터타입의 num과 int 데이터타입의 숫자5는 연산식으로 표현가능
		boolean inSame = num1==num2;
		
	}
}
