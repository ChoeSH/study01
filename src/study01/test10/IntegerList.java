package study01.test10;

import java.util.ArrayList;

public class IntegerList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));		//i번째 방 값을 출력 al.get()
			
		}
	}
}
