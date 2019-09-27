package study01.test02;

public class Arraytest {

	public static void main(String[] args) {
		String[] hname= {"가","나","다"};
		System.out.println(hname[0]);	//collection framework
		
		int money1=0;
		int money2=50;
		int money3=100;
		int money4=1000;
		
		int a[] = new int[4];	//4개의 int 데이터타입으로 이루어진 배열을 만든다
		a[0]=0;
		a[1]=50;
		a[2]=100;
		a[3]=1000;
		System.out.println(a.length);	//a배열의 방개수
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		double[] dbs = new double[5];	//사용하기 전에 반드시 배열개수를 정해줘야 한다.
	}
}