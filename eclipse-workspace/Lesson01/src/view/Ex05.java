package view;

import java.util.Scanner;
import java.util.function.Predicate;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Enter your number:");
			try {
				n = Integer.parseInt(ip.nextLine());
				if (n < 1000) {
					System.out.println("Your number is:" + n);
					readNumber(n);
				} else {
					System.out.println("Your number is wrong with the request!!!");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR:Enter your number once again!!!");
			}
		} while (true);
	}

	private static void readNumber(int n) {
		String[] number = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
		String result = " ";
		int hundred = n / 100;
		int dozen = (n % 100) / 10;
		int unit = n % 10;
		if (hundred == 0 && dozen == 0 && unit == 0) {
			System.out.println(result);
		}
		if (hundred != 0) {
			result += " " + number[hundred] + " " + "trăm";
			if ((dozen == 0) && (unit != 0)) {
				result += " " + "linh";
			}
		}
		if ((dozen != 0) && (dozen != 1)) {
			result += " " + number[dozen] + " " + "mươi";
			if ((dozen == 0) && (unit != 0)) {

			}
		}
		if (dozen == 1) {
			result += " " + "mười";
		}
		switch (unit) {
		case 1:
			if ((dozen != 0) && (dozen != 1)) {
				result += " " + " mốt ";
			} else {
				result += " " + number[unit] + " ";
			}
			break;
		case 5:
			if (dozen == 0) {
				result += " " + number[unit];
			} else {
				result += " " + " lăm ";
			}
			break;
		default:
			if (unit != 0) {
				result += " " + number[unit] + " ";
			}
			break;
		}
		System.out.println(result);
	}

}