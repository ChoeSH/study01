package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class DoubleList {

	public static void main(String[] args) {
		
		ArrayList<String> strl= new ArrayList<String>();
		ArrayList<Double> dbl= new ArrayList<Double>();
		
		Random r1=new Random();
		for(int i=0; i<10; i++){
			strl.add(r1.nextInt(100)+"."+r1.nextInt(10));
			dbl.add(Double.parseDouble(strl.get(i)));
		}
		
		for(int i=0; i<dbl.size(); i++) {
			for(int j=i+1; j<dbl.size(); j++) {
				
				if(dbl.get(i)>dbl.get(j)){
				double temp;
				temp=dbl.get(i);
				dbl.set(i,dbl.get(j));		//dbl.set(i(int타입),j(double타입))i번째 방의 값을 j로 변경
				dbl.set(j, temp);
				}
			}
		}
		System.out.println(dbl);
		//출력
		for(int i=0; i<dbl.size(); i++) {
			System.out.println(dbl.get(i));		//strl.get()을 통해 strl() 값을 넣는다.
			}
		
		System.out.println(dbl.get(0)+dbl.get(1));
	}
}	/* for문을 i=0부터 사용하여 size까지 반복 if(dbl.get(0)>dbl.get(i))문을 사용해서 i++; else dbl.get(i);
	for문을 한번 더 i=1부터 사용하여 db.get(i)와 db.get(i+1)을 비교하여 크면 */
