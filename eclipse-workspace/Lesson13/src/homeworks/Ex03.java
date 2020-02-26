package homeworks;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex03 {

	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		String path = "student.txt";
		//show
		System.out.println("danh sách trong file");
		show(path);
		System.out.println("===========================");
		//them
		System.out.println("Thêm");
		Student newStudent=new Student(11, "Rose", 10f);
		addToFile(path, newStudent);
		show(path);
		System.out.println("===========================");
		// xoa
		System.out.println("Xóa");
		System.out.print("Nhập vào id cần xóa");
		int id=Integer.parseInt(sc.nextLine());
		DeleteStudent(path, id);
		show(path);
		System.out.println("===========================");
		// update
		System.out.println("Update");
		System.out.print("nhap vào id cần update ");
		id=Integer.parseInt(sc.nextLine());
		update(path, id);
		show(path);
		

	}
	public static void show(String path) {
		List<Student> list=readFile(path);
		list.forEach(System.out::println);
	}

	public static List<Student> readFile(String path) {
		
		List<Student> list = new ArrayList<Student>();
		
		try {
			list = Files.lines(Paths.get(path)).map(t -> {
				String[] temp = t.split("-");
				return new Student(Integer.parseInt(temp[0]), temp[1], Float.parseFloat(temp[2]));
			}).filter(t -> t != null).collect(Collectors.toList());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return list;

	}

	public static boolean addToFile(String path, Student stu) {
		List<Student> list = null;
		if (!Files.exists(Paths.get(path)) || stu == null) {
			return false;
		} else {
			list = readFile(path);
			list.add(stu);
			writeFile(path, list);
			return true;
		}

	}

	public static boolean writeFile(String path, List<Student> list) {
		BufferedWriter bf = null;
		if (!Files.exists(Paths.get(path)) || list == null) {
			return false;
		} else {
			try {

				bf = Files.newBufferedWriter(Paths.get(path));
				for (Student student : list) {
					bf.write(student.toString());
					bf.newLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return true;
		}
	}

	public static boolean DeleteStudent(String path,int id) {
		List<Student> list=null;
		if(!Files.exists(Paths.get(path))) {
			return false;
		}else {
			list=readFile(path);
			for (Student student : list) {
				if(student.getId()==id) {
					list.remove(student);
					writeFile(path, list);
					return true;
				}
			}
			return false;
		}
	}
	public static boolean update(String path,int idTarget) {
		List<Student> list=null;
		if(!Files.exists(Paths.get(path))) {
			return false;
		}else {
			list=readFile(path);
			for (Student student : list) {
				if(student.getId()==idTarget) {
					updateStudent(student);
					writeFile(path, list);
					return true;
				}
			}
			return false;
		}
		
	}
	public static void updateStudent(Student stu) {
		System.out.println("Chọn thuộc tính cần update");
		System.out.println("1. id");
		System.out.println("2. name");
		System.out.println("1. điêm tb");
		int chosse;
		
		
		chosse=Integer.parseInt(sc.nextLine());
		switch (chosse) {
		case 1:
			System.out.print("nhap vào id mới : ");
			int newID=Integer.parseInt(sc.nextLine());
			stu.setId(newID);
			break;
		case 2:
			System.out.print("nhap vào tên mới : ");
			String newName=sc.nextLine();
			stu.setName(newName);
			break;
		case 3:
			System.out.print("nhap vào Diểm trung bình mới : ");
			float newDTB=Float.parseFloat(sc.nextLine());
			stu.setDiemTB(newDTB);
			break;

		default:
			System.out.println("Chọn sai");
			break;
		}

	}
	

	
}
