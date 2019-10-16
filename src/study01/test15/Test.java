package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String,String> map= new HashMap<String,String>();
		map.put("성별","남자");
		map.put("나이","25");
		map.put("이름","최씨");
		System.out.println(map.get("성별"));
		System.out.println(map);
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key= it.next();
			String value=map.get(key);
			System.out.println("key : "+ key+" value : "+value);
		}
		
		Iterator<Map.Entry<String,String>> iter= map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> entry=(Map.Entry<String, String>) iter.next();
			String key = entry.getKey();
			String value= entry.getValue();
			System.out.println("[key] : "+ key+" [value] : "+value);
		}
	}
}