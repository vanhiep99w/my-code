package random;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		// random 1 so nguyen integer tu 0 den n-1
		Random rd = new Random();
		int a = rd.nextInt(20);
		System.out.println("A: " + a);

		// random 1 so tu 10 den 40
		// (a -> b) int res = a +rd.nextInt(...)
		int b = 10 + rd.nextInt(31);
		System.out.println("B: " + b);
	}
}
