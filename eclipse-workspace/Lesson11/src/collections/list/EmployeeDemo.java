package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeDemo {
	public static void main(String[] args) {
		List<Employee> employees = mockEmployees();
		
		// Employee newEmp = new Employee(99, "Adam", 29, Title.Dev);
		
		// Thêm mới 1 nhân viên vào giữa danh sách
		// employees.add(employees.size()/2, newEmp);
		
		// Xóa thông tin nhân viên có id = 9
		// Employee employee = getStudent(employees, 9);
		// employees.remove(employee);
		
		// Xóa nhân viên có tuổi > 65
		
		// employees.removeIf(t -> t.getAge() > 65);
		// employees.removeIf(t -> t.getId() == 9);
		// employees.removeIf(t -> t.getTitle().equals(Title.Assistant));
		
		// Cập nhật fullname = “Chi pheo” với id = 22
		update(employees, 22, "Chi pheo");
		
		employees.sort((e1, e2) -> e1.getId() - e2.getId());
	}
	
	private static void update(List<Employee> employees, int id, String fullname) {
		employees.forEach(emp -> {
			if (emp.getId() == id) {
				emp.setFullname(fullname);
			}
		});
	}
	
	
	
	private static Employee getStudent(List<Employee> employees, int id) {
		for (Employee emp: employees) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}
	
	
	private static List<Employee> mockEmployees() {
		List<Employee> emps = new ArrayList<>();
		Employee emp1 = new Employee(1, "Le Na", 70, Title.Dev);
		Employee emp2 = new Employee(13, "Hoang Teo", 100,  Title.President);
		Employee emp3 = new Employee(22, "Van Nam", 90, Title.Dev);
		Employee emp4 = new Employee(9, "Ngoc Thanh", 19, Title.Assistant);
		Employee emp5 = new Employee(7, "Hoang Ka", 92, Title.Dev);
		emps.add(emp1);emps.add(emp2);emps.add(emp3);emps.add(emp4);emps.add(emp5);
		return emps;

	}
}