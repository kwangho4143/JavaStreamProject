package Streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class DistinctExample {
	public static void main(String[] args) {
		String[] strAry = {"hong","park","choi","Lee"};
		Stream<String> sStream = Arrays.stream(strAry);
		sStream.sorted().distinct().forEach(System.out::println);//중복제거
	
	
	
		Student[] students = {new Student("이화진",50),new Student("이화진",50),new Student("동광희",60),new Student("우청일",70),new Student("김도은",80),new Student("김도은",90) };
		
		Stream<Student> tStream = Arrays.stream(students);
		tStream.distinct().forEach(System.out::println);//중복제거
		
		
		System.out.println("--------------");
		Stream<Student> xStream = Arrays.stream(students);
		xStream.sorted(new Comparator<Student>() {//이렇게 안하고  student클래스에서 comparteTo함수를 정의해서도 사용가능

			@Override
			public int compare(Student o1, Student o2) {
				
				return o2.score-o1.score;
			}
			
		}).forEach(System.out::println);
	
	
	
	
	}
}
