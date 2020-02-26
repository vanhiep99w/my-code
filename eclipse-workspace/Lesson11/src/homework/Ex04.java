package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	static Random rd=new Random();
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
	public static void menu(List<Student> students) {
		while (true) {
			System.out.println("1 : Xáo danh sách sinh viên . ");
			System.out.println("2 : Random chọn ra 1 sinh viên trong danh sách .");
			System.out.println("3 : Randim chọn ra 1 danh sách sinh viên .");
			System.out.println("4 : Thoát .");
			System.out.print("Nhập vào lựa chon : ");
			int chosse=Integer.parseInt(sc.nextLine());
			switch (chosse) {
			case 1:
				Collections.shuffle(students);
				showInfo(students);
				break;
			case 2:
				Student temp=students.get(rd.nextInt(students.size()));
				System.out.println(temp);
				break;
			case 3:
				System.out.println("Nhập vào số lượng sinh viên : ");
				int n=Integer.parseInt(sc.nextLine());
				int i=0;
				Student stu;
				List<Student> list=new ArrayList<Student>();
				while(i<n) {
					stu=students.get(rd.nextInt(students.size()));
					if(!list.contains(stu)) {
						list.add(stu);
						i++;
					}
				}
				showInfo(list);
                break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Vui lòng nhập lại !");
			}
		}
	}
}
