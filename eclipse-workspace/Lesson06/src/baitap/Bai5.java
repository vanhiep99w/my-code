package baitap;

import java.util.Scanner;

public class Bai5 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	
		
		int n;
		
		System.out.print("Nhập vào số giám khảo : ");
		n=Integer.parseInt(sc.nextLine());
		int [][]arr=scanfInput(n);
		int[] test=arrPoint(arr, n);
		System.out.println(winnerStudent(test));
		
	}
	public static int[][] scanfInput(int n) {
		String[] arrStringInput=new String[n];
		arrStringInput[0]="3 5 2 1";
		arrStringInput[1]="3 12 5 2";
		arrStringInput[2]="2 1 2";
		arrStringInput[3]="3 2 1 5";
		
//		for(int i=0;i<n;i++) {
//			arrStringInput[i]=sc.nextLine();
//		}
		String [][] arrString=new String[100][100];
		for(int i=0;i<n;i++) {
			arrString[i]=arrStringInput[i].split(" ");
		}
	
		int [][] arrInt=new int[100][100];
		for(int i=0;i<n;i++) {
			int temp=Integer.parseInt(arrString[i][0]);
			for(int j=0;j<temp+1;j++) {
				arrInt[i][j]=Integer.parseInt(arrString[i][j]);
			}
		}
		for(int i=0;i<n;i++) {
			int temp=arrInt[i][0];
			for(int j=0;j<temp+1;j++) {
				System.out.print(arrInt[i][j]);
			}
			System.out.println("\n");
		}
		return arrInt;
				
	}
	public static int[] arrPoint(int[][] arr,int n) {
		int[] test=new int[100];
		int point=3;
		for(int i=0;i<n;i++) {
			for(int j=1;j<arr[i][0]+1;j++) {
				test[arr[i][j]]=test[arr[i][j]]+point--;
			}
			point=3;
		}
		return test;
	}
	public static int winnerStudent(int []test) {
		int temp=test[0];
		int result=0;
		for(int i=1;i<100;i++) {
			if(temp<test[i]) {
				temp=test[i];
				result=i;
			}
		}
		return result;
	}
}
