package study01.test13;

import java.util.Arrays;

public class Test {
	
	public String[] strs= new String[0];
	
	public Test() {
		this.strs = new String[0];
	}
	public void add(String str) {
		String[] tmpstr=this.strs;	//strs 방크기의 배열을 tmpstr에 생성
		
		this.strs= new String[strs.length+1];	//strs배열을 크기+1된 배열로 재생성
		strs[strs.length-1]=str;
		for(int i=0; i<tmpstr.length; i++) {
			strs[i]=tmpstr[i];
		}
	}
	
	public static void main(String[] args) {
		Test t= new Test();
		t.add("a");
		t.add("b");
		t.add("c");
		System.out.println(t.strs[0]);
		System.out.println(t.strs[1]);
		System.out.println(t.strs.length);
		
		System.out.println(Arrays.toString(t.strs));
		
		String a="1234";
		System.out.println(a.substring(2));		//2번방까지 제외한 값을 출력한다.
		System.out.println(a.substring(2,3));	//2번방에서 시작 3번방 전까지 출력한다.
		System.out.println(a.substring(0,a.length()-1));	//0번방에서 시작 a의 길이-1(마지막 방)전까지 출력
		
		a=a.substring(2);			//a의 값을 a에서 2개의 방을 제외한 값으로 새로 초기화한다.
		System.out.println(a);
		
		System.out.println(a.matches("34"));	//"34"가 a의 문자열이 맞는지 boolean하여 true,false를 출력한다.
		
		//String a="123";	(a.substring(2));	a에서 2개의방을 제외한 값을 출력한다.	※a의값이 완전히 바뀌는것은 아니다.
		//a.indexOf("1");	a에서 "1"이 포함된 방의 번호를 출력한다.
	}
}

