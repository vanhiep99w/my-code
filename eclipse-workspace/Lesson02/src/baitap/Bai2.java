package baitap;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		for(int i=n;i>0;i=i-2) {
			temp+=giaiThua(i);
		}
		System.out.println(temp);
	}
	private static int giaiThua(int n) {
		int temp=1;
		for(int i=n;i>0;i=i-1) {
			temp=temp*i;
		}
		return temp;
	}
}