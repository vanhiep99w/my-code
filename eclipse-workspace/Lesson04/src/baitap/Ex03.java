package baitap;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập vào số mũ : ");
		int n=Integer.parseInt(sc.nextLine());
		pascalTriangle(n);
	}
	public static void pascalTriangle(int n) {
		int[] preArr=new int[100];
		int[] lastArr=new int[100];
		int temp=2;
		preArr[0]=1;preArr[1]=1;
		for(int j=0;j<n;j++) {
			for(int i=0;i<temp;i++) {
				System.out.print(preArr[i]+"  ");
			}
			temp++;
			for(int i=0;i<temp;i++) {
				if(i==0||i==temp-1) {
					lastArr[i]=1;
				}else {
					lastArr[i]=preArr[i]+preArr[i-1];
				}
			}
			for(int i=0;i<temp;i++) {
				preArr[i]=lastArr[i];
			}
			System.out.println();
		}
		
		
	}
}
