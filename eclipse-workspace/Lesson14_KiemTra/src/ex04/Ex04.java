package ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex04 {

	public static void main(String[] args) {
		String path = "student.txt";
		File file = new File(path);
		List<Student> students = mockdata();
		writeFile(file, students);
		List<Student> t = new ArrayList<Student>();
		t = (List<Student>) readFile(file);

	}

	public static List<Student> mockdata() {
		Student s1 = new Student(102130174, "Le Na", 7.8f, "Nu");
		Student s2 = new Student(102130175, "Le Na", 7.8f, "Nu");
		Student s3 = new Student(102130176, "Le Na", 7.8f, "Nu");
		Student s4 = new Student(102130177, "Le Na", 7.8f, "Nu");
		Student s5 = new Student(102130178, "Le Na", 7.8f, "Nu");
		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
		return students;

	}

	private static void writeFile(File file, Object object) {
		FileOutputStream fof = null;
		ObjectOutputStream oos = null;

		try {
			fof = new FileOutputStream(file);
			oos = new ObjectOutputStream(fof);
			oos.writeObject(object);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fof.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("resource")
	private static Object readFile(File file) {
		FileInputStream fof = null;
		ObjectInputStream oos = null;

		try {
			fof = new FileInputStream(file);
			oos = new ObjectInputStream(fof);
			return oos.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fof.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static List<Student> findStudent(List<Student> students) {
		return students.stream().filter(t -> t.getPoint() >= 8).collect(Collectors.toList());
	}

	public static List<Student> findWoman(List<Student> students) {
		return students.stream().filter(t -> "Nu".equals(t.getGender())).collect(Collectors.toList());
	}

	public static List<Student> findStudentExistOne(List<Student> students) {
		List<Integer> temp = students.stream().map(Student::getId).collect(Collectors.toList());
		return students.stream().filter(t -> countExist(temp, t.getId())).collect(Collectors.toList());
	}

	public static boolean countExist(List<Integer> integers, int temp) {
		int i = 0;
		for (Integer integer : integers) {
			if (integers.contains(temp)) {
				i++;
			}
		}
		if (i == 1) {
			return true;
		} else {
			return false;
		}
	}
	public static List<Student> order(List<Student> students) {
		return students.stream().sorted(Comparator.comparing(Student::getGender).thenComparing(Student::getPoint)).collect(Collectors.toList());
	}
}
