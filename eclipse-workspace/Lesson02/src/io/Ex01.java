package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// viet chuong trinh nhap vao ho ten, tuoi va luong
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter fullname:");
		String name = obj.nextLine();

		System.out.print("Enter age:");
		int age = Integer.parseInt(obj.nextLine());

		System.out.print("Enter salary:");
		float salary = Float.parseFloat(obj.nextLine());

		System.out.print("Enter friend's name:");
		String name2 = obj.nextLine();

		System.out.println("Fullname: " + name + "\nAge: " + age + "\nSalary: " + salary);
		System.out.println("Friend's name: " + name2);

	}
}
