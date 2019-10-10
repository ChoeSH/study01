package study01.test11;

import java.util.ArrayList;

public class WhileTest {
	public static void main(String[] args) {
		for(int i=1; i<=10;i++) {
			if(i%2==0)continue;		//조건문이 만족하지 않으면 for문의 증감부로 이동한다.
			System.out.println(i);
		}
		int i=1;
		while(i<=10) {		//동작은 하지만 가독성이 떨어져서 사용하지 않는다.
			System.out.println(i);
			i++;
		}
		ArrayList<String> strList=new ArrayList<String>();
		while(strList.size()<7) {
			strList.add("아무거나");
			System.out.println(strList);
		}
		
		do {
			strList.add("잉");
			System.out.println(strList);
		}while(strList.size()<7);		//while의 조건이 만족하지 않을때까지 반복하여 do를 실행
	}
}
