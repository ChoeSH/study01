package study01.test15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		
		for(int i=0; i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
		
		Map<String,String>map=new HashMap<String,String>();{
		map.put("보물1호","컴퓨터");
		map.put("선호음식","초밥");
		map.put("해야할일","공부");
		map.put("선호음식","치킨");
		System.out.println(map.get("초밥")==map.get("치킨"));	//키값끼리 위치는 같고 밸류끼리 위치도 같다. 밸류값의 초밥과 치킨은 true가 출력
		
		Iterator<String> it = map.keySet().iterator();	//iterator()가 첫글자 소문자이므로 생성자가 아니고 메소드이다.
		while(it.hasNext()){
			String key=it.next();
			System.out.println(key);
			String value=map.get(key);
			System.out.println(value);
		}
		}
	}
}