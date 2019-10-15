package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class Execute {

	public static void main(String[] args) {
		Person p = new Person();
		List<Person> pList = new ArrayList<Person>();
		
		p.setName("박도영");
		p.setAge(24);
		p.setAddr("안양");
		pList.add(p);
		
		p= new Person();		//p=new Person()이 있어야 제대로 입력이 된다.
		p.setName("하늘");
		p.setAge(24);
		p.setAddr("인천");
		pList.add(p);
		
		p=pList.get(0);
		p.setName("재빈");		//pList의 name을 "박도영"을 "재빈"으로 재정의한다.
		
		System.out.println(pList.get(0));
		System.out.println(pList.get(1));
		System.out.println(pList);
		
	}
}
