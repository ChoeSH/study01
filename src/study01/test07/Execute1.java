package study01.test07;

class Cal1{
	int num1;
	int num2;
	
	public void add() {		//return 할 필요가 없는 메소드는 void로 선언한다.
		System.out.println(num1+num2);
	}
	public void minus() {
		System.out.println(num1-num2);
	}
	public void multiple() {
		System.out.println(num1*num2);
	}
	public void division() {
		System.out.println(num1/num2);
	}
}
public class Execute1{
	
	public static void main(String[] args) {
		Cal1 calc=new Cal1();
		calc.num1=10;
		calc.num2=5;
		
		calc.add();
		calc.minus();
		calc.multiple();
		calc.division();
		}
	}
