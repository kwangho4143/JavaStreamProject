package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import common.Employee;

public class EmpDAO {
	public static List<Employee> getEmpLists() {
		Connection conn = ConnectionDB.getDB();
		List<Employee> employees = new ArrayList<>();

		try {
			String sql = "select * from employees ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee();
				// String firstName = rs.getString("first_name");
				emp.setFirstName(rs.getString("first_name"));// 위 아래 동작은 같다
				emp.setLastName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setEmail(rs.getString("email"));
				emp.setHireDate(rs.getDate("hire_date").toLocalDate());
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));

				employees.add(emp);
			}
			//System.out.println("--end of data--");

//			for(Employee em : employees) {
//				System.out.println(em);
//			}
			//employees.stream().forEach(s -> System.out.println(s));

			
			
			
//			Optional result = employees.stream().reduce(new BinaryOperator<Employee>() {
//
//				@Override
//				public Employee apply(Employee t, Employee u) {
//
//					return t.getHireDate().isBefore(u.getHireDate()) ? u : t;
//				}
//			});
//			System.out.println(result);

			
			
//			Optional<LocalDate> result2 = employees.stream().flatMap(new Function<Employee,DoubleStream>(){
//
//				@Override
//				public Stream<Integer> apply(Employee t) {
//					
//					return Stream.of(t.getSalary());
//				}
//				
//			}).reduce(new BinaryOperator<LocalDate> () {
//
//				@Override
//				public LocalDate apply(LocalDate t, LocalDate u) {
//					System.out.println(t + ","+ u);
//					return t.isBefore(u)?t:u;
//				}
//				
//			});
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

}
