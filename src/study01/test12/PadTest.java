package study01.test12;

public class PadTest {

	public static void main(String[] args) {		//debug 밑줄로 내려가기 f6, debug 나가기 f8
		String str="1";
		int max=4-str.length();
		for(int i =1; i<=max; i++) {
			str+="0";
			System.out.println(str);
		}
	}
}
