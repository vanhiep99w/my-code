package baitap;

import java.util.Scanner;

public class Manager extends People {
 
	@Override
	public String toString() {
		return String.format("%-15s%-15d%-15d%-15d%-15d",name,birthYear,heSoSalary,amountEmployees,calSaraly(2200000));
	}
	@Override
	public void scan() {
		Scanner sc=new Scanner(System.in);
		super.scan();
		System.out.print("Nhập vào số lượng nhân viên quản lí :");
		amountEmployees=Integer.parseInt(sc.nextLine());
	}
}
