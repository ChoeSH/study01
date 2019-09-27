package study01.test03;

public class Increment {

	public static void main(String[] args) {
		int num =1;
		num=num+1;
		num++;	//num에 +1을 대입
		num+=1;	//num에 +1을 한 값을 num에 대입
		
		System.out.println(num);	//4출력
		System.out.println(num++);	//후순위 연산자(마지막에 출력 ++연산) , 4를 출력한 후에 num값에 ++연산
		System.out.println(++num);	//먼저 ++연산하고 출력	, ++연산된 num에 ++연산을 한 값을 출력
		
		System.out.println(num--);	//후순위 연산자(마지막에 출력 --연산)
		System.out.println(num);
		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}
}
