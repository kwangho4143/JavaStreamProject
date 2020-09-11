package stream.collect;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import common.EmpDAO;
import common.Employee;

public class CollectionDataBaseGroupby {

	public static void main(String[] args) {
		//직무별로
		List<Employee> employees =  EmpDAO.getEmpLists();
		
		//Map<String,List<Employee>> map;
		
		Map<String,Set<Employee>> gMap = employees.stream().collect(Collectors.groupingBy(new Function<Employee,String>(){
			@Override
			public String apply(Employee t) {
				// TODO Auto-generated method stub
				return t.getJobId();
			}	
		},Collectors.toSet()));
		
		Set<String> set = gMap.keySet();
		for(String s : set) {
			System.out.println(s);
			System.out.println("");
			Set<Employee> list = gMap.get(s);
			for(Employee e : list)
				System.out.println(e);
		}
		
		
	}

}
