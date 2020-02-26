package baitap;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		boolean b;
		do {
			System.out.println("Nhập vào tên học viên ");
			String c=sc.nextLine();
			b=checkInput(c, s->c.matches("[\\w]{5,63}"));
			if(!b)
				System.out.println("Xin nhập lai ! ");
		} while (!b);
		do {
			System.out.println("Nhập vào ma học viên ");
			String c=sc.nextLine();
			b=checkInput(c, s->c.matches("^bkit[\\d]{3}"));
			if(!b)
				System.out.println("Xin nhập lai ! ");
		} while (!b);
		do {
			System.out.println("Nhập vào password học viên ");
			String c=sc.nextLine();
			b=checkInput(c, s->c.matches("[[A-Z]*[\\w]*[!@#$%^&*]*[\\w]*]{8,63}"));
			if(!b)
				System.out.println("Xin nhập lai ! ");
		} while (!b);
		do {
			System.out.print("Nhập vào ngày : ");
			int day=Integer.parseInt(sc.nextLine());
			System.out.print("Nhập vào tháng : ");
			int month=Integer.parseInt(sc.nextLine());
			System.out.print("Nhập vào năm : ");
			int year=Integer.parseInt(sc.nextLine());
			Date date=new Date();
			b=Date.checkDate(day, month, year);
			if(!b) System.out.println("xin nhập lại !");
		} while (!b);
		
		
	}
	public static boolean checkInput(String c , checkStatus s) {
		return s.checkString(c);
	}
	

}
