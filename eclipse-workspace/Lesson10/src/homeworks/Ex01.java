package homeworks;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] arrInput = { 1, 2, 3, 4, 3, 1 };
		int[] result = enique(arrInput);
		Arrays.stream(result).forEach(x -> System.out.print(x + " "));
	}

	public static int[] distinct(int[] arrInput) {
		int k = 0;
		int[] arrTempResult = new int[10];
		int[] arrResult;

		for (int i = 0; i < arrInput.length; i++) {
			int temp = arrInput[i];
			if (contain(arrTempResult, arrInput[i]) == 0) {
				arrTempResult[k++] = temp;
			}
		}
		arrResult = Arrays.copyOfRange(arrTempResult, 0, k);
		return arrResult;
	}

	public static int[] enique(int[] arrInput) {
		int k = 0;
		int[] arrTempResult = new int[10];
		int[] arrResult;

		for (int i = 0; i < arrInput.length; i++) {
			int temp = arrInput[i];
			if (contain(arrTempResult, temp) == 0 && contain(arrInput, temp) == 1) {
				arrTempResult[k++] = temp;
			}
		}
		arrResult = Arrays.copyOfRange(arrTempResult, 0, k);
		return arrResult;
	}

	public static void compareMediumValue(int[] arrInput) {
		int temp1 = 0;
		int temp2 = 0;
		for (int i = 0; i < arrInput.length; i++) {
			if (i < 6) {
				temp1 += arrInput[i];
				continue;
			}
			temp2 += arrInput[i];
		}
		// vì đều là giá trị trung bình của 5 số nên ko cần chia cho 5 lấy tổng so sánh
		// là đưuọc
		if (temp1 > temp2)
			System.out.println("Trung bình 5 số đầu lớn hơn");
		if (temp1 == temp2)
			System.out.println("Trung bình bằng nhau");
		else
			System.out.println("Trung bình 5 số cuối lớn hơn");
	}

	public static int contain(int[] arrInput, int value) {
		int temp = 0;
		for (int i = 0; i < arrInput.length; i++) {
			if (arrInput[i] == value) {
				temp++;
			}
		}
		return temp;
	}

	public static int[] insertionSort(int[] arrInput) {
		int t, j;
		for (int i = 1; i < arrInput.length; i++) {
			j = i - 1;
			t = arrInput[i];
			while (j >= 0 && t < arrInput[j]) {
				arrInput[j + 1] = arrInput[j];
				j--;
			}
			arrInput[j + 1] = t;
		}
		return arrInput;
	}

}
