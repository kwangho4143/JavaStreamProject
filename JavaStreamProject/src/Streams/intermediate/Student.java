package Streams.intermediate;

import java.util.Objects;

public class Student implements Comparable<Student> {
	String name;
	int score;
	public Student(String name,int score) {
		this.name= name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,score);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student that = (Student) obj;
			return this.name.equals(that.name) && this.score == this.score;
		}else 
			return false;
	}
	@Override
	public int compareTo(Student st) { //정열
		
		return this.score - st.score; //양수면 오름차순정리
	}
	
}
