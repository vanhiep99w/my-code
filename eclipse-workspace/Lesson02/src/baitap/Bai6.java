package baitap;

import java.util.Scanner;

public class Bai6 {

	static int n, m, temp = 0, temp2 = 0;

	public static void main(String[] args) {
		String[] A = new String[255];
		String[] B = new String[255];
		System.out.println("Nhập vào số phần tử của A:");
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextLine();
		}
		System.out.println("Nhập vào số phần tử của B:");
		m = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < m; i++) {
			B[i] = sc.nextLine();
		}
		String[] c = giao(A, B);

		System.out.print("Giao : ");
		for (int i = 0; i < temp; i++) {
			System.out.print(c[i]);
		}
		System.out.println("\n");
		c = hieu(A, B);
		System.out.print("Hiệu :");
		for (int i = 0; i < temp2; i++) {
			System.out.print(c[i]);
		}
		System.out.println("\n");
		c = hop(A, B);
		System.out.print("Hiệu :");
		for (int i = 0; i < temp2+m; i++) {
			System.out.print(c[i]);
		}
	}

	private static String[] giao(String[] A, String[] B) {
		String[] c = new String[255];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (A[i].equals(B[j])) {
					c[temp] = B[j];
					temp++;
					break;
				}
			}
		}
		return c;
	}

	private static String[] hieu(String[] A, String[] B) {
		String[] c = new String[255];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (A[i].equals(B[j])) {
					break;
				}
				if (j == m - 1) {
					c[temp2] = A[i];
					temp2++;
				}
			}
		}
		return c;
	}

	private static String[] hop(String[] A, String[] B) {
		String[] c = new String[255];
		for(int i=0;i<m;i++) {
			c[i]=B[i];
		}
		temp2=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (A[i].equals(B[j])) {
					break;
				}
				if (j == m - 1) {
					c[temp2+m] = A[i];
					temp2++;
				}
			}
		}
		return c;
	}
}