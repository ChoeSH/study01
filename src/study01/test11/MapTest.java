package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {
	static void changeMap(HashMap<String,String> map) {
		//map = new HashMap<String,String>();	//주석된 부분이 있을경우 map이 새로운 메모리가 만들어진다.따라서 나이=44로 바뀌지 않는다.
		map.put("나이", "44");
	}
	public static void main(String[] args) {		
		HashMap<String,String> map = new HashMap<String,String>();	//각 데이터 값의 속성이 무엇인지 정할때 map을 사용
		map.put("이름", "김씨");									//<>안에는 정해져있지 않은 데이터 타입(대문자)만 입력 가능
		map.put("나이", "99");
		map.put("주소", "서울");
		map.put("성별", "남");
		map.put("성별", "여");		//같은 성별 타입을 덮어쓴다. 따라서 출력시 성별은 "여"로 나온다.
		System.out.println(map);
		changeMap(map);
		System.out.println(map);
		
		List<HashMap<String,String>> people= new ArrayList<HashMap<String,String>>();
		people.add(map);
		people.add(map);
		people.get(0).put("이름","박씨");
		map.put("나이","22");		//"나이"속성이 둘다 22로 출력된다.
		System.out.println(people);
		map= new HashMap<String,String>();	//map을 새로운 HashMap 영역을 생성(이전의 영역은 남아있다.)
		System.out.println(map);	//값이 빈 영역이 출력되어 {}만 출력
	}
}
