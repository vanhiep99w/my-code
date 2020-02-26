package homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex03 {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		List<Student> students=new ArrayList<Student>();
		students.add(new Student("01", "hiep", 5.1f));
		students.add(new Student("02", "hoang", 4.1f));
		students.add(new Student("03", "trung", 9.1f));
		students.add(new Student("04", "khanh", 5.1f));
		students.add(new Student("05", "binh", 3.1f));
		students.add(new Student("06", "hieu", 2.1f));
		students.add(new Student("07", "anh", 7.1f));
		students.add(new Student("08", "tu", 6.1f));
		menu(students);
	}
	public static void showInfo(List<Student> students) {
		students.stream().forEach(stu->System.out.println(stu));
	}
	public static List<Student> sortByArithMean(List<Student> students){
		students.sort((o1,o2) -> Float.compare(o1.getArithMean(), o2.getArithMean()));	
		return students;	
	}
	public static List<Student> sortByAlphabet(List<Student> students){
		students.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));	
		return students;	
	}
	public static void add(List<Student> students) {
		Student temp=new Student("09", "nhác", 4.3f);
		students.add(temp);
	}
	public static Student search(List<Student>students,String id) {
		for (Student student : students) {
			if(student.getId().equals(id)) {
				return student;
			}
		}
		return null;
	}
	public static void remove(List<Student> students,String id) {
		Student temp=search(students, id);
		if(temp==null) System.out.println("Không tồn tại id này !");
		else students.remove(temp);
	}
	public static void menu(List<Student> students) {
		while(true) {
			System.out.println("1. Xem danh sách sinh viên . ");
			System.out.println("2. Sắp xếp và hiển thị danh sách sinh viên(Theo điểm trung bình) .");
			System.out.println("3. Sắp xếp và hiển thị danh sách sinh viên(theo alphabet) .");
			System.out.println("4. Thêm sinh viên vào danh sách .");
			System.out.println("5. Tìm kiếm sinh viên theo mã .");
			System.out.println("6. Xóa một sinh viên khỏi danh sách .");
			System.out.println("7. Thoát");
			System.out.print("Nhập vào lựa chon : ");
			int chosse=Integer.parseInt(sc.nextLine());
			switch (chosse) {
			case 1:
				showInfo(students);
				break;
			case 2:
				List<Student> temp=new ArrayList<Student>(students);
				sortByArithMean(temp);
				showInfo(temp);
				break;
			case 3:
				List<Student> temp2=new ArrayList<Student>(students);
				sortByAlphabet(temp2);
                showInfo(temp2);
                break;
			case 4:
				add(students);
				System.out.println("Đã thêm vào danh sách .");
				break;
			case 5:
				System.out.print("Nhập vào id cần tìm : ");
				String id =sc.nextLine();
				Student stu= search(students, id);
				if(stu==null) System.out.println("Không có sinh viên nào với "+ id+" này !");
				else System.out.println("Thông tin sv :" + stu);
				break;
			case 6: 
				System.out.print("Nhập vào id cần Xóa : ");
				String id2 =sc.nextLine();
				remove(students, id2);
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Vui lòng nhập lại !");
			}
		}
	}
	
}
