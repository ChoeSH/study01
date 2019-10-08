package study01.test10;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random ran=new Random();
		int fNum=ran.nextInt(100);
		int sNum=ran.nextInt(10);
		System.out.println(fNum);
		System.out.println(sNum);
		
		String str = fNum+"."+sNum;
		System.out.println(str+1);		//String 데이터타입으로 str과 1값이 같이 나온다
		
		double db= Double.parseDouble(str);
		System.out.println(db+1);		//double로 변환되어 +1값이 나온다.
		
	}
}
