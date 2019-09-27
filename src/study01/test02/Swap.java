package study01.test02;

public class Swap {

	public static void main(String[] args) {
		int a=3;
		int b=4;
		int c=a;
			a=b;
			b=c;
		System.out.println(a+","+b);
		
		int nums[]=new int[3];
		nums[0]=1;
		nums[1]=3;
		nums[2]=5;
		
		int[] tmpNums=nums;		//카멜 케이스: 변수의 첫번째 단어의 첫자는 소문자, 두번째 단어의 첫자는 대문자
		System.out.println(tmpNums[2]);
		nums = new int[4];
		nums[0]=tmpNums[0];
		nums[1]=tmpNums[1];
		nums[2]=tmpNums[2];
		nums[3]=7;
		System.out.println("{"+nums[0]+","+nums[1]+","+nums[2]+","+nums[3]+"}");
	}
}
