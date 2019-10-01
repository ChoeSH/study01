package study01.test06;

public class MethodTest2 {
	int num;
	static int num2;
	
	int getNum(){
		System.out.println(num);//메소드는 클래스 바로 밑에만 존재할수 있다.
		int num=3;
		System.out.println(num);	//바로 위의 num이 출력된다.
		System.out.println(this.num);	//this.num은 class내에서 선언한 num을 출력한다.
		return 1;
	}
	public static void main(String[] args) {		
		MethodTest2 mt2 = new MethodTest2();	//num의 값이 자바에서 0으로 자동으로 초기화 된다.
		mt2.getNum();		
		System.out.println(num2);		//static(고정된)은 static이 있는 클래스에서 사용 가능
	}
	
}	//같은 변수명으로는 데이터타입이 같아도 선언이 불가능하다.
