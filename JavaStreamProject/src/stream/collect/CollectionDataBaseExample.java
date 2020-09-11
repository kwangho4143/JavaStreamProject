package stream.collect;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import common.EmpDAO;
import common.Employee;

public class CollectionDataBaseExample {
	public static void main(String[] args) {
		//employee 테이블
		//입사일자 기준. 1990년대 입사한 사람들.
		//list 컬렉션에 저장.
		
		List<Employee> employees =  EmpDAO.getEmpLists();
		
		List<Employee> newList = employees.stream().filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getHireDate().isAfter(LocalDate.of(1990, 1, 1)) && t.getHireDate().isBefore(LocalDate.of(2000, 1, 1)); 
			}
		}).collect(Collectors.toList());
				
		for(Employee e : newList) {
			System.out.println(e);
		}
		
		
		
		   List<Employee> listE = employees.stream()
		            .filter(e -> e.getJobId().equals("ST_CLERK"))
		            .collect(Collectors.toList());
		      
		      for(Employee e : listE) {
		         System.out.println(e);

		      }
	}
}