package study01.test02;

public class Loop {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		for(int i=0;i<10;i++) {
			a++;
			b=a+b;
			System.out.println(a+"->"+b);
		}	//for(초기값; 조건부; 증감부;)
		

	}
}
