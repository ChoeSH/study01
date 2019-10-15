package study01.test13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		//List<HashMap<String,String>> mapList;		List는 interface이기 때문에 new를 하지 않고 사용한다.
		
		List<HashMap<String,String>> mapList= new ArrayList<HashMap<String,String>>();	
		map.put("name", "김씨");						//ArrayList는 new를 사용하고 마지막에 ()를 붙인다.
		map.put("age", "22");
		map.put("addr", "서울");
		mapList.add(map);
		System.out.println(mapList);		//List는 [], map은 {} 
		
		//map.clone();		//map을 복사
		//map.clear(); 		//map을 삭제
		
		map.remove("name");	//"name"키값을 삭제
		System.out.println(map);
		map.put("sex","남자");	//mapList는 키값이 삭제되거나 추가되면 삭제되고 추가된 후의 값을 바라본다.
		
		System.out.println(mapList);
	}
}
