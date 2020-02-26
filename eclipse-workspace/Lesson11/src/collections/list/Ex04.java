package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> digits = mockIntegers();
		Integer dInt = new Integer(15);
		System.out.println("contains: " + digits.contains(dInt));
		digits.forEach(digit -> System.out.println(digit));
		
		
		System.out.println("========================");
		
		List<Employee> employees = mockEmployees();
		Employee emp1 = new Employee(1, "Le Na", 70, Title.Dev);
		System.out.println("contains: " + employees.contains(emp1));
		employees.forEach(emp -> System.out.println(emp));
	}
	
	private static List<Integer> mockIntegers() {
		List<Integer> digits = new ArrayList<>();
		digits.add(new Integer(2)); digits.add(new Integer(15)); digits.add(new Integer(22));
		return digits;
		
	}
	
	private static List<Employee> mockEmployees() {
		List<Employee> emps = new ArrayList<>();
		Employee emp1 = new Employee(1, "Le Na", 70, Title.Dev);
		Employee emp2 = new Employee(13, "Hoang Teo", 100,  Title.President);
		Employee emp3 = new Employee(22, "Van Nam", 90, Title.Dev);
		emps.add(emp1);emps.add(emp2);emps.add(emp3);
		return emps;

	}
}