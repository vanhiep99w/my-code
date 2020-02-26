package baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a,b,result;
		
		do {
			try {
				System.out.println("Nhập vào number a : ");
				a=Float.parseFloat(sc.nextLine());
				System.out.println("Nhập vào number b : ");
				b=Float.parseFloat(sc.nextLine());
				result=phuongTrinhBac1(a, b);
				break;
				
			} catch (NumberFormatException e) {
				System.out.println("Xin chỉ nhập số ! ");
			}
			catch (ArithmeticException e) {
				System.out.println(" a phải khác 0");
			}
		} while (true);
		
		System.out.println("Kết quả : "+ result);
	}
	
	public static float phuongTrinhBac1(Float a,Float b) {
		return -b/a;
	}
}
//InputMismatchException