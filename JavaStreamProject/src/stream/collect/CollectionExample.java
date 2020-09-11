package stream.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Streams.intermediate.Student;

public class CollectionExample {
	public static void main(String[] args) {
		Set<String> setStr = new HashSet<>();
		setStr.add(new String("최재영"));
		setStr.add(new String("민해주"));
		setStr.add(new String("김상민"));

		Iterator<String> iter = setStr.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		List<Student> st1 = new ArrayList<>();
		st1.add(new Student("허성준",80));
		st1.add(new Student("최형준",90));
		
		List<Student> st2 = new ArrayList<>();
		st2.add(new Student("김다희",80));
		st2.add(new Student("김도은",90));
		
		List<Student> st3 = new ArrayList<>();
		st2.add(new Student("김",70));
		st2.add(new Student("이",60));

		
		Map<String,Integer> map = new HashMap<>();
		map.put("동광희", 25);
		map.put("김시무", 35);
		Set<String> key = map.keySet();
		Iterator<String> itr = key.iterator();
		while(itr.hasNext()) {
			String k = itr.next();//키값가져옴
			System.out.println(map.get(k));
		}
		
		
		
		Map<String,List<Student>> stMap = new HashMap<>();
		stMap.put("남자",st1);
		stMap.put("여자",st2);
		stMap.put("중성",st3);
		Set<String> setK = stMap.keySet();
		for(String s : setK) {
			System.out.println(s);//남자,여자 ,ㅈㅅ출력
			List<Student> valueList = stMap.get(s);
			for(Student ss : valueList) {
				System.out.println(ss);
			}
		}
		
		
		
		
		
		
	
	}
}
