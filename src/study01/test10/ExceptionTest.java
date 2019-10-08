package study01.test10;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("시작");
		String strNum="124";
		try {
			int num=Integer.parseInt(strNum);
			System.out.println(strNum);			
		}
		catch(Exception e) {
			System.out.println(strNum+"숫자가 아닙니다");	//오류가 발생시 catch로 이동되어 출력된다. 오류가 발생하지 않으면 출력x
		}
		finally {
			System.out.println("난 항상 실행됨");		//오류 발생여부에 관계없이 항상 실행됨
		}
	}
}
