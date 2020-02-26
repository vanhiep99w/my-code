package baitap;

import java.util.Scanner;

public class Employees extends People{

	
	@Override
	public String toString() {
		return String.format("%-15s%-15d%-15d%-15s%-15d",name,birthYear,heSoSalary,nameofDepartment,calSaraly(3000000));
	}
	@Override
	public void scan() {
		Scanner sc=new Scanner(System.in);
		super.scan();
		System.out.print("Nhâp vào tên đơn vị :");
		nameofDepartment=sc.nextLine();
	}
}
