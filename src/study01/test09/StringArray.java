package study01.test09;
import java.util.ArrayList;
import java.util.Random;

public class StringArray {

	public static void main(String[] args) {
		String[] strs=new String[10];
		Random ran=new Random();
		
		for(int i=0; i<strs.length; i++) {
			int rNum=ran.nextInt(20)+1;
			strs[i]=rNum+"";
		}

		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);			//배열의 단점 배열의크기를 수정하기 위해서는 새로 방을 만들어야 하는데
		}											//설정 되었던 값들이 null로 초기화 된다. 
		
		ArrayList<String> strList = new ArrayList<String>();	//크기가 유동적으로 조정됨
		
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.remove(1);			//1번방의 값과 방을 제거한다.
		System.out.println(strList.size());			//배열의 단점을 극복하기 위해 arraylist를 자주 사용한다.
		System.out.println(strList);
		
		System.out.println("c는 "+strList.indexOf("c")+"번째에 있다");	//"c"가 있는 방의 번호를 찾는다.
		
		
		ArrayList<Integer> numList=new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		System.out.println(numList);
	}
}	//wrapper class : 정해져있는 데이터타입(byte,int,double)등을 정해져있지 않은 데이터타입(Byte,Integer,Double)로 매핑하는것
