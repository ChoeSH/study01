package study01.test13;

import java.util.ArrayList;
import java.util.Arrays;

public class ListTest {
	private String[] strs;
	
	public int size() {
		return strs.length;
	}	
	public ListTest() {
		this.strs = new String[0];
	}

	public void add(String str) {
		String[] tmpStr= this.strs;
		
		this.strs=new String[this.strs.length+1];	//방개수+1의 방개수를 가진 strs배열 생성
		this.strs[this.strs.length-1]=str;
		for(int i=0; i<tmpStr.length; i++) {
			this.strs[i]=tmpStr[i];
		}
	}
	
	public int indexOf(String str) {
		for(int i=0; i<strs.length; i++) {
			if(str.equals(strs[i])) {
				return i;
			}
		}
		return -1;
	}	

	public void remove(int idx)	{
		String[] tmp = this.strs;
		strs= new String[strs.length-1];		//strs의 배열크기가 tmp배열의 크기보다 1 더 작다.
		for(int i=0; i<idx; i++) {
			strs[i]=tmp[i];
		}
		for(int i=idx+1; i<tmp.length; i++) {
			strs[i-1] =tmp[i];
		}
		System.out.println(Arrays.toString(strs));
	}
	
	public void remove(String str){
		int idx=indexOf(str);
		if(idx!=-1) {
		remove(idx);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<String>();
		System.out.println(arr.size());
		
		ListTest lt = new ListTest();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		System.out.println(lt.size());
		
		System.out.println(lt.strs[0]);
		System.out.println(lt.strs[1]);
		
		System.out.println(lt.strs);			//arrays.toString(arr)을 입력해야 제대로 배열이 출력됨
		System.out.println(Arrays.toString(lt.strs));

		lt.remove("b");		//2번방을 제거했을때 배열이 출력
	}
}
