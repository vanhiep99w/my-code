package baitap;

import java.util.Scanner;

public class Ex01 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int n=sc.nextInt();
		System.out.println("Hình A");
		imageA(n);
		System.out.println("Hình B");
		imageB(n);
		System.out.println("Hình C");
		imageC(n);
		System.out.println("Hình D");
		imageD(n);
	}
	private static void imageA(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	private static void imageB(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	private static void imageC(int n) {
		for(int i=0;i<n;i++) {
			for(int temp=0;temp<i;temp++) {
				System.out.print("  ");
			}
			for(int j=n-i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	private static void imageD(int n) {
		for(int i=0;i<n;i++) {
			for(int temp=0;temp<n-i-1;temp++) {
				System.out.print("  ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
}
