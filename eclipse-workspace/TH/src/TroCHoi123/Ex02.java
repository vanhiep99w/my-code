package TroCHoi123;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<10) {
			System.out.println("BACH");
		}else {
			if(test(n)==true)System.out.println("KHOA");
			else System.out.println("BACH");
		}
	}
	public static boolean test(int n) {
		while(n>=10) {
			n=n-3;
		}
		if(n==10) return true;
		else return false;
	}
}
