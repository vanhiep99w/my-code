package basic_array_exe;

import java.util.Arrays;
import java.util.Comparator;

public class StudentView {

	public static void main(String[] args) {
		Student[] students=mockStudent();
		Arrays.sort(students,(o1, o2)-> o1.getId().compareTo(o2.getId()) );
				
		
		//sort(students);
		//Student[] first3MaxAvgStudents=Arrays.copyOfRange(students, 0, 3);
		Arrays.stream(students).forEach(stu->System.out.println(stu));
	}
	public static void sort(Student[] students) {
		for(int out=students.length-1;out>0;out--) {
			for(int in=0;in<=out;in++) {
				if(students[out].getAvgPoint()>students[in].getAvgPoint()) {
					Student temp=students[out];
					students[out]=students[in];
					students[in]=temp;
				}
			}
		}
	}
	
	public static Student[] mockStudent() {
		Student[] students = {
				new Student("A102", "Le Teo", 7.8f, true),
				new Student("C302", "Le Na", 8.2f, false),
				new Student("F509", "Hoang Nam", 1.9f, true),
				new Student("D205", "Van Ngoc", 9.1f, false),
				new Student("K107", "Thanh Le", 6.8f, true),
		};
		return students;
	}
	public static Student[] addNumber(Student[]number,int index,Student value) {
		int trueIndex=index-1;
		Student[] result=new Student[number.length+1];
		for(int i=0;i<trueIndex;i++) {
			result[i]=number[i];
		}
		result[trueIndex]=value;
		for(int i=trueIndex+1;i<result.length;i++) {
			result[i]=number[i-1];
		}
		return result;
	}
}
