package study01.test15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String> map= new LinkedHashMap<String,String>();	//순서는 없지만 자기 값의 앞뒤를 알고 있다.
		map.put("이름","김씨");
		map.put("나이","22");
		map.put("성별","여자");
		map.put("지역","대전");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			String value=map.get(key);
			System.out.println("key : "+key+", value : "+value);
		}
	}
}
