package sorting;

import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
		int[] number = { 1, 6, 0, 7, 3, 9, 4 };
		bubbleSort(number);
		Arrays.stream(number).forEach(num -> System.out.println(num + " "));
	}

	public static int[] bubbleSort(int[] number) {
		int i, j;
		int n = number.length;
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (number[j] > number[j + 1]) {
					int temp = number[j ];
					number[j ] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		return number;
	}
	
}
