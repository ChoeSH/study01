package study01.test03;

public class ArrayTest {

	public static void main(String[] args) {
		int[] nums=new int[10];
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]=i+1);
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]=(i+1)*2);
		}	
	}
}
//MVC패턴 : 모델(Model), 뷰(View), 컨트롤러(Controller)