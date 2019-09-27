package study01.test03;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]=(i+1)*10);
		}
	}
}
