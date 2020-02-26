package baitap;

import java.util.Scanner;

public class People {

	protected String name;
	protected int birthYear;
	protected int heSoSalary;
	protected int heSoPosition;
	protected String nameofDepartment;
	protected int amountEmployees;
	public People() {
		// TODO Auto-generated constructor stub
	}
	public People(String name, int birthYear, int heSoSalary
			) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.heSoSalary = heSoSalary;
		this.heSoPosition = 0;
		this.nameofDepartment = "";
		this.amountEmployees = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int getHeSoSalary() {
		return heSoSalary;
	}
	public void setHeSoSalary(int heSoSalary) {
		this.heSoSalary = heSoSalary;
	}
	public int getHeSoPosition() {
		return heSoPosition;
	}
	public void setHeSoPosition(int heSoPosition) {
		this.heSoPosition = heSoPosition;
	}
	public String getNameofDepartment() {
		return nameofDepartment;
	}
	public void setNameofDepartment(String nameofDepartment) {
		this.nameofDepartment = nameofDepartment;
	}
	public int getAmountEmployees() {
		return amountEmployees;
	}
	public void setAmountEmployees(int amountEmployees) {
		this.amountEmployees = amountEmployees;
	}
	public int calSaraly(int basicSaraly) {
		return (heSoSalary+heSoPosition)*basicSaraly;
	}
	public void scan() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập vào tên :");
		name=sc.nextLine();
		System.out.print("Nhập vào năm sinh :");
		birthYear=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập vào hệ số lương :");
		heSoSalary=Integer.parseInt(sc.nextLine());
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s",name,birthYear,heSoSalary);
	}
}
