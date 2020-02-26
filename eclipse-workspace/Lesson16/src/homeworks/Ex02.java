package homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

	public static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		// 1 là đúng 0 là sai;
		System.out.print("Nhập vào số cần kiểm tra : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isHappyNumber(n));
		list.forEach(System.out::println);
	}

	public static int isHappyNumber(int n) {
		int newNumber = 0;
		while (n > 0) {
			newNumber += Math.pow(n % 10, 2);
			n /= 10;
		}
		if (newNumber == 1) {
			return 1;
		}
		if (list.contains(newNumber)) {
			System.out.println(newNumber);
			return 0;
		}
		else {
			list.add(newNumber);
			return isHappyNumber(newNumber);
		}
	}
}
