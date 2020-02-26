package basic_array;

import java.util.Random;

public class Ex01 {
	private static Random rd = new Random();

	public static void main(String[] args) {
		// tạo 5 số ngẫu nhiển từ 1-50;
		// và in ra các số lẻ trong danh sách
		// cách 1:
		int[] digits = new int[5];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = rd.nextInt(50) + 1;
		}
		show(digits);
		// cách 2
		int [] number= {1,2,5,7,9};
		System.out.println("N1 : "+ System.identityHashCode(number));
		replace(number);
		System.out.println("N2 : "+ System.identityHashCode(number));
		
		
	}
	private static void replace(int[] input) {
		input[0]=100;
	}
	private static void show(int[] digits) {
		for(int i=0;i<digits.length;i++) {
			if(digits[i]%2!=0) {
				System.out.print(digits[i]+" ");
				
			}
			
		}
		
	}
}
