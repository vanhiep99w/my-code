package baitap;

import java.util.Scanner;

public class Ex02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhập vào số phần tử của mảng : ");
		int lenght = Integer.parseInt(sc.nextLine());
		SoNguyen_Ex02[] arr = new SoNguyen_Ex02[lenght];
		for (int i = 0; i < lenght; i++) {
			int value = Integer.parseInt(sc.nextLine());
			arr[i] = new SoNguyen_Ex02(value);
		}
		arr = convertArr(arr);

		for (int i = 0; i < lenght; i++) {
			System.out.println(arr[i].getValue());
		}

	}

	public static void swap(SoNguyen_Ex02 s1, SoNguyen_Ex02 s2) {
		int temp = s1.getValue();
		s1.setValue(s2.getValue());
		s2.setValue(temp);
	}

	public static SoNguyen_Ex02[] convertArr(SoNguyen_Ex02[] arr) {
		int count7 = 0;
		int count5 = 0;
		for (int i = 0; i < arr.length-count5; i++) {
			System.out.println(i + "---");
			if (arr[i].getValue() % 7 == 0 && arr[i].getValue() % 5 != 0 ) {
				swap(arr[i], arr[count7++]);
			} else if (arr[i].getValue() % 5 == 0 && arr[i].getValue() % 7 != 0) {
				swap(arr[i], arr[arr.length - 1 - count5++]);

			}
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j].getValue()+"  ");
			}
			System.out.println();
		}
		return arr;
	}
}
