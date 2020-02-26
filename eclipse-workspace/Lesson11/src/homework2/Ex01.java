package homework2;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < 2 * n - 1; i++) {

			if (i >= n) {
				for (int j = 0; j < 2 * n - 1; j++) {
					if (j <= 2 * n - 2 - i || j >= i) {
						System.out.print((j + 1) + " ");
					} else
						System.out.print("  ");
				}
				System.out.println();
				continue;
			}

			for (int j = 0; j < 2 * n - 1; j++) {
				if ( j <= i || j >= 2 * n - 2 - i) {
					System.out.print((j + 1) + " ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
}
