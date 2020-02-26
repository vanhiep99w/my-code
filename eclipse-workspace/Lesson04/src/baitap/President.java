package baitap;

import java.util.Scanner;

public class President extends People{

	@Override
	public String toString() {
		return String.format("%-15s%-15d%-15d%-15d%-15d",name,birthYear,heSoSalary,heSoPosition,calSaraly(3000000));
	}
	@Override
	public void scan() {
		Scanner sc=new Scanner(System.in);
		super.scan();
		System.out.print("Nhập vào hệ số chức vụ :");
		heSoPosition=Integer.parseInt(sc.nextLine());
	}
}
