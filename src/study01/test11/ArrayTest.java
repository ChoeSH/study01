package study01.test11;

public class ArrayTest {
	static int a=3;		//클래스변수(static변수) 인스턴스화를 하지 않고 사용할수 있는 변수
	public static void main(String[] args) {	
		int[][] nums = new int[4][];	//행과 열로 볼수 있다. 뒤의 방개수는 지정하지 않아도 가능하다.(가변배열)
		nums[0]= new int[3];
		System.out.println(nums[0][0]);
		nums[1]= new int[10];
		
		System.out.println(nums[0].length);
		System.out.println(nums[1].length);
	}
}
