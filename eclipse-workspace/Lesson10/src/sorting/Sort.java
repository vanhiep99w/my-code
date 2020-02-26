package sorting;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		Student[] students=new Student[10];
		students[0]= new Student(0,"Hiep",1);
		students[1]= new Student(1,"Hiep",4);
		students[2]= new Student(2,"Hiep",7);
		students[3]= new Student(3,"Hiep",2);
		students[4]= new Student(4,"Hiep",3);
		students[5]= new Student(5,"Hiep",0);
		students[6]= new Student(6,"Hiep",5);
		students[7]= new Student(7,"Hiep",6);
		students[8]= new Student(8,"Hiep",8);
		students[9]= new Student(9,"Hiep",9);
	 
		Student[] result=insertionSort(students);
		Arrays.stream(result).forEach(stu->System.out.println(stu));
	}
	public static Student[] swap(Student[] students,int index1,int index2) {
		Student temp = students[index1];
		students[index1] = students[index2];
		students[index2] = temp;
		return students;
	}
	public static Student[] bubbleSort(Student[] students) {
		int n=students.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (students[j].getAge() > students[j + 1].getAge()) {
					swap(students, j, j+1);
				}
			}
		}
		return students;
	}
	public static Student[] selectionSort(Student[] students) {
		for(int i=0;i<students.length;i++) {
			int MinIndex=i;
			for(int j=i+1;j<students.length;j++) {
				if(students[j].getAge()<students[MinIndex].getAge()) {
					MinIndex=j;
				}
			}
			if(MinIndex!=i) {
				swap(students, i, MinIndex);
			}
		}
		return students;
	}
	public static Student[] insertionSort(Student[] students) {
		Student temp;
		int j;
		for (int i = 1; i < students.length; i++) {
			j = i - 1;
			temp = students[i];
			while (j >= 0 && temp.getAge() < students[j].getAge()) {
				students[j + 1] = students[j];
				j--;
			}
			students[j + 1] = temp;
		}
		return students;
	}
	
}
