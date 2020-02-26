package random;

import java.util.Date;
import java.util.Random;

public class Ex04 {
	private static Random rd = new Random();

	public static void main(String[] args) throws InterruptedException {
		// how to attack an account with basic password
		String username = "admin";
		String password = "123";
		int[] resultSet = new int[900];
		int count = 0;

		// random 1 so ngau nhien co 3 chu so den khi nao dung pass thi dung
		// cac phan tu in ra khac nhau
		// in ra khoang thoi gian
		long timeBegin = System.currentTimeMillis();
		// Date now = new Date(timeBegin);
		// System.out.println(now);
		int a;
		do {
			a = 100 + rd.nextInt(900);

			if (contain(a, resultSet)) {
				//a = 100 + rd.nextInt(900);
				continue;
			}
			resultSet[count] = a;
			count++;
			if (count % 15 == 0)
				System.out.println();
			System.out.print(a + "   ");
			Thread.sleep(50);
		} while (a != Integer.parseInt(password));
		long timeEnd = System.currentTimeMillis();
		System.out.println("Execute time:" + (timeEnd - timeBegin) + " ms");
	}

	private static boolean contain(int a, int[] resultSet) {
		for (int i = 0; i < resultSet.length; i++) {
			int result = resultSet[i];
			// chi ktra phan tu khac 0
			if (result == 0)
				return false;
			if (result == a)
				return true;
		}
		return false;
	}
}
