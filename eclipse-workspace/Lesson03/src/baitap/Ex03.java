package baitap;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	
	static Scanner sc=new Scanner(System.in);
	static Random rd=new Random();
	static int n,m;// số hàng và số cột
	public static void main(String[] args) {
		int [][]matrix=new int[100][100];
		randomMatrix(matrix);
		System.out.println(saddleElement(matrix));
	}

	private static int[][] randomMatrix(int[][] matrix) {
		System.out.print("Nhập vào n :");
		n=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập vào m :");
		m=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				matrix[i][j]=rd.nextInt(100);
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		return matrix;
	}
	
	private static boolean saddleElement(int[][]matrix) {
		boolean temp=false;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix[i][j]==minInCol(matrix, j) && matrix[i][j]==maxInRow(matrix, i)) {
					System.out.println(matrix[i][j]);
					temp= true;
				}
			}
		}
		return temp;
	}
	private static int maxInRow(int[][]matrix,int row ) {
		int max=matrix[row][0];;
		for(int i=1;i<m;i++) {
			if(max<matrix[row][i]) {
				max=matrix[row][i];
			}
		}
		return max;
	}
	private static int minInCol(int[][]matrix,int col ) {
		int min=matrix[0][col];;
		for(int i=1;i<n;i++) {
			if(min>matrix[i][col]) {
				min=matrix[i][col];
			}
		}
		return min;
	}
}
