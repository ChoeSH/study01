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
		
		System.out.println(Arrays.toString(t.strs));

	}
}

