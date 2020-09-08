package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Iterator;

class ConClass implements Consumer<Student>{

	int sum = 0;
	int cnt = 0;
	@Override
	public void accept(Student t) {
		sum = t.getScore()+sum;
		
	}
	
}


public class StreamExample3 {
	static double total=0;
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("최재영",90),new Student("민해주",88),new Student("김상민",83),new Student("최형준",86));
		
		//for each(총 점수, 평균 가져오는 가능)
		
		Stream<Student> streams = list.stream();//값은 자바가 알아서 가져옴
		
		
		streams.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				total = t.getScore()+total;
			}
			
		});
		System.out.println("총점수:"+total +","+"평균:"+total/4);
				
	}
}
