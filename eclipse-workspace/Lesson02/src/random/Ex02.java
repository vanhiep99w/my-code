package random;

import java.util.Random;

public class Ex02 {
	private static Random rd = new Random();

	public static void main(String[] args) {
		// viet ct random in 5 so ngau nhien tu 10 den 20
		// 2 so lien ke khac nhau

		int pre = 0;
		for (int i = 0; i < 5; i++) {
			int rand = randValue();
			while (rand == pre) {
				rand = randValue();
			}
			pre = rand;
			System.out.println(rand);
		}
	}

	private static int randValue() {
		return 10 + rd.nextInt(11);
	}
}
