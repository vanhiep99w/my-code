package baitap;

import java.util.Scanner;

import datetimeutils.DateUtils;

public class Bai03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean b;
		do {
			System.out.println("Nhập vào email");
			String c=sc.nextLine();
			EmailException email=new EmailException(c);
			b=email.isCorrectEmail();
			if(!b) {
				System.out.println("Cú pháp email bị sai vui lòng nhập lại !");
			}
		} while (!b);
	}
}
