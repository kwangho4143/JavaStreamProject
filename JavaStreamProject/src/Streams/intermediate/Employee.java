package Streams.intermediate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

enum Gender{
	MALE,FEMALE;
}


public class Employee {
	String name;
	Gender gender;
	LocalDate dateofBirth;
	double income;
	
	public Employee(String name, Gender gender, LocalDate dateofBirth, double income) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateofBirth = dateofBirth;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	public boolean isMale() {
		return this.gender == gender.MALE;
	}
	public boolean isFemale() {
		return this.gender == gender.FEMALE;
	}

	@Override
	public String toString() {
		String str = String.format("(%s,%s,%s,%.2f)",name,gender,dateofBirth,income);
		return str;
	}
	public static List<Employee> employees(){
		Employee e1 = new Employee("Hash",Gender.FEMALE,LocalDate.of(1991,Month.JULY,17 ),5000.0);
		Employee e2 = new Employee("eeHwwash",Gender.MALE,LocalDate.of(1994,Month.DECEMBER,27 ),5500.0);
		Employee e3 = new Employee("aaHaash",Gender.MALE,LocalDate.of(1992,Month.MAY,1 ),4000.0);
		Employee e4 = new Employee("hHash",Gender.MALE,LocalDate.of(1990,Month.JULY,7 ),2000.0);
		Employee e5 = new Employee("lHjash",Gender.MALE,LocalDate.of(1993,Month.OCTOBER,27 ),3000.0);
		Employee e6 = new Employee("kHash",Gender.FEMALE,LocalDate.of(1992,Month.JULY,14 ),2000.0);
		Employee e7 = new Employee("2Hash",Gender.FEMALE,LocalDate.of(1999,Month.JUNE,12 ),1000.0);
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
		
		
		return employees;
		
	}
	
	
}
