package common.excel;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import common.EmpDAO;
import common.Employee;

public class ExcelExample {
	public static void main(String[] args) {
		EmployeeExcelWriter writer = new EmployeeExcelWriter();
		List<Employee> list = EmpDAO.getEmpLists();
		
		List<Employee> newList=list.stream().filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.getJobId().equals("IT_PROG");
			}
			
		}).collect(Collectors.toList());
		
		writer.xlsWriter(newList);
		System.out.println("엑셀 완료");
		
	}
}
