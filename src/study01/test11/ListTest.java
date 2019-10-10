package study01.test11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListTest {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();		//리스트중에 속도가 제일 빠르다
		//List<String> sList = new List<String>();	List = new List는 에러가 발생한다.
		
		List<String> strList2 = new LinkedList<String>();	//중간 방에 값을 추가하거나 제거할때 처리 속도가 빠르다.
		strList = new ArrayList<String>();					//앞에 List<String>이 없어도 생성 가능하다.
		
		List<String> list1= new ArrayList<String>();
		List<String>list2= new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list2.add("1");
		list2.add("2");
		list2.add("3");
		System.out.println(list1);
		System.out.println(list2);
		list1.remove(0);
		list2.remove(0);
		System.out.println(list1);
		System.out.println(list2);
		list1.set(0, "5");
		list2.set(0, "6");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list1.size());
		System.out.println(list2.size());
	}
}
