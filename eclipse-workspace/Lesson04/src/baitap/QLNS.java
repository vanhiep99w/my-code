package baitap;

import java.util.Scanner;

public class QLNS {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		scanAndShow();

	}
	public static void scanAndShow() {
		People president=new President();
		People manager=new Manager();
		People employees1=new Employees();
		People employees2=new Employees();
		System.out.println("Nhập thông tin Giám Đốc :");
		president.scan();
		System.out.println("Nhập thông tin Trưởng phòng :");
		manager.scan();
		System.out.println("Nhập thông tin Nhân Viên :");
		employees1.scan();
		System.out.println("Nhập thông tin Nhân Viên :");
		employees2.scan();
		System.out.println("============Thông Tin=============");
		System.out.println("Giám đốc");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s","Tên","Năm Sinh","HS Lương","HS Chức Vụ","Lương");
		System.out.println();
		System.out.println(president);
		System.out.println("Trưởng phòng");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s","Tên","Năm Sinh","HS Lương","SLNVQL","Lương");
		System.out.println();
		System.out.println(manager);
		System.out.println("Nhân viên");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s","Tên","Năm Sinh","HS Lương","Phòng Ban","Lương");
		System.out.println();
		System.out.println(employees1);
		System.out.println(employees2);
	}

}
