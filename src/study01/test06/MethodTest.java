package study01.test06;

public class MethodTest {
	public static void main(String[] args) {
		String str= "123";		//new String을 하지 않아도 자바가 스스로 생성한다.
		String str1= new String("123");		 
		String str2= new String("123");		
		String str3="123";
		
		System.out.println(str==str3);		//new를 사용하지 않고 저장할 때는 str3은 저장되지 않고 이미 저장된 str 위치에서 불러온다.
		
		System.out.println(str=="123");		//내가 만드는 new String을 사용한 저장 공간과
		System.out.println(str1=="123");	//자바가 스스로 만드는 저장공간(static memory)은 다르다.
		
		System.out.println(str==str1);		//값을 비교하는것이 아니라 같은 위치인지를 비교한다.따라서 위치가 다르기 때문에 false다.
		System.out.println(str==str2);
		System.out.println(str1==str2);
		
		System.out.println(str.equals(str1));	//equals 메소드는 값을 비교한다. equals 메소드는 String을 가진다.
		
		int a =1;
		System.out.println(a==1);		//정해져 있는 데이터타입에서는 가능하다.
		
		String st="1234567";
		int idx = st.indexOf("345");	//indexOf의 데이터타입=int
		System.out.println("345은 st의 "+idx+" index자리에 있네요");		//없는 숫자를 찾을 경우 -1이 출력된다. 첫번째 단어의 인덱스가 나온다.
		
		String name = "new,ace,abc";	//String은 배열로 볼수 있다.
		String[] strs = name.split(",");	//name.split의 기준점을 ","으로 잡고 배열의 갯수를 나눈다.
		for(int i=0; i<strs.length; i++) {
			System.out.println("이름 : " +strs[i]);
		}
		System.out.println(strs[0]+","+strs[1]);

	}
}
