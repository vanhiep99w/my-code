package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex03 {
	/**
	 Cho danh sách các học sinh trong lớp học như sau 
	  { 
	      Le Na, Hoang Teo, 
	      Van Bien, Ngoc Nam, 
	      Hoang Teo, Hoang Sinh
	  }
		1. In ra danh sách các học viên trong lớp
		2. Loại bỏ những phần tử trùng nhau trong danh sách
		   + Kết quả: {Le Na, Hoang Teo, Van Bien, Ngoc Nam, Hoang Sinh}
		3. Sắp xếp các phần tử theo chiều
		   + Giảm dần
		   + Tăng dần
		   Hint: Comparable vs Comparator
		4. Viết phương thức lấy danh sách 2 bạn đầu tiên sau khi đã sắp xếp
		   + Kết quả: List<String>
	 */
	public static void main(String[] args) {
		
		List<String> students = mockStudents();
		List<String> result = distinct(students);
		Collections.sort(result, (o1, o2) -> o2.compareTo(o1));
		
		result.forEach(student -> System.out.println(student));
		
		// Lấy 2 sinh viên đầu tiên trong danh sách
		List<String> firstTwoStudents = result.subList(0, 2);
		
		System.out.println("============================");
		firstTwoStudents.forEach(student -> System.out.println(student));
	}
	
	private static List<String> distinct(List<String> students) {
		List<String> result = new ArrayList<>();
		
		for(String student: students) {
			if (!result.contains(student)) {
				result.add(student);
			}
		}
		
		return result;
	}
	
	private static List<String> mockStudents() {
		List<String> students = new ArrayList<>();
		
		students.add("Le Na");
		students.add("Hoang Teo");
		students.add("Van Bien");
		students.add("Ngoc Nam");
		students.add("Hoang Teo");
		students.add("Hoang Sinh");
		
		return students;
	}
}