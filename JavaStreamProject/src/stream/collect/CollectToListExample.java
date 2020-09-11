package stream.collect;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

enum Gender{
	MALE,
	FEMALE
}
class Student{
	String name;
	int age;
	Gender gender;
	public Student(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	} 
	
	

}

public class CollectToListExample {
	public static void main(String[] args) {
		Student s1 = new Student("허성준",28,Gender.MALE);
		Student s2 = new Student("김시무",23,Gender.MALE);
		Student s3 = new Student("문선애",22,Gender.FEMALE);
		
		List<Student> students = Arrays.asList(s1,s2,s3);
		
		Collector<Student, ?, List<Student>> collector = Collectors.toList();
		
		List<Student> newList = students.stream().filter(new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				
				return t.gender == Gender.MALE;
			}
		}).collect(collector);

		//newList.stream().forEach(System.out::println);
		
		
		
		
		
		//나이가 25살 넘는 사람들.Set이용
		Collector<Student,?,Set<Student>> collector2 = Collectors.toSet();
		
		Set<Student> newSet = students.stream().filter(new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.getAge()>25;
			}
			
		}).collect(collector2);
		
		Iterator<Student> iter = newSet.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.getAge() + ","+ s.getName());
		}
		
		
		
		
		
		
		
		
		
		
	}
}
