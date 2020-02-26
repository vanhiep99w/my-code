package operator;

public class Ex01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 10;

		int max = max(a, b, c);
		System.out.println(max);

		if (!equals(a, b)) {
			System.out.println("a # b");
		} else {
			System.out.println("a = b");
		}
	}

	private static boolean equals(int a, int b) {
		return a == b;
	}

	private static int max(int a, int b, int c) {
		int max = a > b ? a : b;
		return max > c ? max : c;

		// return (a > b ? a : b) > c ? (a > b ? a : b) : c;
	}
}
