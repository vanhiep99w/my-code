package baitap;

import java.util.Scanner;

public class Bai4 {
	// Nếu muốn mở rộng số lượng số thì chỉ cần thêm các giá trị
	// phù hợp vào trong class Consonant

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số :");
		int n = sc.nextInt();
		System.out.println(spellNumber(n));
	}

	public static String spellNumber(int numberInput) {

		String result = "";
		int position = 1;
		int value;
		do {
			value = numberInput % 10;
			Number number = new Number(value);
			Consonant consonant = new Consonant(position);
			if (value == 0 && position>1) {
				number.setStringValue("linh ");
				consonant.setStringPosition(" ");
			}
			numberInput = numberInput / 10;
			result = number.getStringValue() + consonant.getStringPosition() + result;
			position++;

		} while (numberInput > 0);
		return result;
	}
}
