package study01.test07;

public class Cons {
	int num;
	public Cons() {
		System.out.println("내가 호출되었구나");
		System.out.println(num);
	}
	public Cons(int a) {
		System.out.println("a 파라미터가 있는 내가 호출 되었다.");
	}
	
	public static void main(String[] args) {
		Cons cs=new Cons();				//13번이 실행된 후, 4번으로 올라가서 10번까지 실행 후, 13번>14번 순서로 진행 된다.
		System.out.println(cs.num);
		

	}
}
