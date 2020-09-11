package Streams.intermediate;

import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import common.EmpDAO;

public class ReduceExample {
	public static void main(String[] args) {
		List<Employee> empList = EmpDAO.getEmpLists();
		
		//list.stream().
		Stream<Employee> stream = empList.stream();

		
		OptionalInt avg = stream.filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				
				return t.getJobId().equals("IT_PROG");
			}
			
		}).flatMapToInt(new Function<Employee,IntStream>(){

			@Override
			public IntStream apply(Employee t) {
				// TODO Auto-generated method stub
				return null;
			}
			
		}).average();
		double avg =empList.stream().filter(n -> n++).forEach(a -> a +  );
		
		System.out.println("평균급여는: "+ avg);
		
		
		
		
	}
}
