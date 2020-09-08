package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
}


public class StreamExample2 {
	public static void main(String[] args) {
		//최재영,90   민해주,88  김상민 83 , 최형준 86
		List<Student> stlist = new ArrayList<>();
		int count=0;
		stlist.add(new Student("최재영",90));
		stlist.add(new Student("민해주",88));
		stlist.add(new Student("김상민",83));
		stlist.add(new Student("최형준",86));
		
		for(Student ss:stlist) {
			if(ss.getScore()>=85) {
				count++;
				System.out.println(ss.getScore()+","+ss.getName());
				}
			}
		System.out.println("총 인원:"+ count);
		
		System.out.println("--------------------------------");
		
		List<Student> list = Arrays.asList(new Student("최재영",90),new Student("민해주",88),new Student("김상민",83),new Student("최형준",86));
		Stream<Student> students= list.stream(); 
		long iCnt = students.filter(new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.score >=85;
			}
			
		}).peek(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				System.out.println(t.name + "," + t.score);
			}
			
		}).count();//최종처리 메소드 최종처리메소드가 없으면 중간처리메소드는 실행되지 않는다
		System.out.println("총 인원: "+ iCnt);
		
		
		
		
		
	}
}
