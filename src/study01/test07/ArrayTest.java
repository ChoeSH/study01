package study01.test07;

public class ArrayTest {

	public static void main(String[] args) {
		String st= new String();
		System.out.println(st);		//String을 초기화 하지 않고 생성하면 자바에서 자동으로 빈 문자열로 초기화한다.
		
		String[] strs=new String[5];	//String을 저장할 수 있는 공간을 5개 만든다.
		System.out.println(strs[0]);	//String배열은 자바에서 자동으로 null로 초기화한다.
		
		int[] nums=new int[5];
		for(int i=0;i<nums.length; i++) {
		nums[i]=(i+1)*10;
		strs[i]= nums[i]+"";		//숫자+문자= 문자 
		}
		
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
