package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class StreamExample {
	public static void main(String[] args) {
		//컬렉션 => 외부반복자
		List<String> users = Arrays.asList("홍길동","최재영","민해주","김상민");
		Iterator<String> iter = users.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str.toString());
		}
		
		System.out.println("---------------------------");
		
		//스트림 => 내부반복자
		Stream<String> streams = users.stream();//값은 자바가 알아서 가져옴
		streams.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {//실제로 해야하는 구현부분
				System.out.println(t.toString());
			}
			
		});//매개값을 받아서 반환해주는 클래스
//		람다표현식
//		Stream<String> streams = users.stream();
//		streams.forEach((t) -> System.out.println(t.toString()));//매개값을 받아서 반환해주는 클래스
		
		
		
		
	}
}
