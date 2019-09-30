package study01.test04;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		int[] nums=new int[6];
		long l =12345678912l;
		
		double db=1.1;
		float fl = 1.1f;	//기본 데이터타입이 double이므로 float를 알려주기 위해 f를 붙인다.
		
		Random r = new Random();
		for(int i=0; i<nums.length; i++) {
			nums[i] = r.nextInt(10)+1;
			for(int j=i-1;j>=0; j--) {
				if(nums[i]==nums[j]){
					i--;
					break;
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}

//1byte=8bit -128 ~ +127까지	2의7승(양수는 0이 존재하기 때문에 127까지)
//byte < short < int < long
//if(i==10){break;}		>>i가 10일때 바로 위의 명령을 나간다.
//함수,function,메소드