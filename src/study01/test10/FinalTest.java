package study01.test10;

public class FinalTest {
	static final int num=1;	//final int로 선언된 경우 자바에서 초기화되지 않으므로 직접 초기화 해야한다. 접근제어자는 public 사용
	
	public static void main(String[] args) {
		final int a=3;
		//a=5;		a값은 final int로 선언되어 변경이 불가능하다.
		String s="235";
		double db=0;
		
		int dnum=(int)db+1;		//정해진 데이터타입을 다른 데이터 타입으로 변환 ()사용(*사용 할때마다 ()붙여줘야 한다.)
		int snum=Integer.parseInt(s);	//String 타입의 데이터로 다른 데이터 타입으로 변환
		
		String str="넘은 3이 맞습니다";
		str = (a==3)?"맞다":"아니다";
		System.out.println(str);
	}
}
