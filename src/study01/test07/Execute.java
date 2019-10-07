package study01.test07;

class Calc{
	int num1;
	int num2;	
	
	public void add() {
		System.out.println(num1+num2);
	}
	public void minus(){
		System.out.println(num1-num2);
	}
	public void multiple(){
		System.out.println(num1*num2);
	}
	public void division(){
		System.out.println(num1/num2);
	}
}

public class Execute {

	public static void main(String[] args) {
	Calc calc= new Calc();
	calc.num1=5;
	calc.num2=3;
	calc.add();
	calc.minus();
	calc.multiple();
	calc.division();
	
	Calc[] calcs= new Calc[3];	//방3개를 만드는 배열과는 다르다. 실행 하기 위해서는 배열마다 new를 사용해줘야 사용 가능하다.
	calcs[0]=new Calc();		//calcs[]의 첫번째 방을 초기화 해야한다.
	calcs[0].add();
	
	Calc calc2=new Calc();
	calc2.add();
	calc2.add();
	
}	//이 라인 이후에는 calc의 변수 num1,num2는 사용할 수 없다.(삭제된다.)
}