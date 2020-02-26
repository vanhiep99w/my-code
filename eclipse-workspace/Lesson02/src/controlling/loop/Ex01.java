package controlling.loop;

public class Ex01 {
	public static void main(String[] args) {
		// in ra các số nguyên từ 1 -> 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println(factorialDoWhile(5));
	}
	

	private static int factorialFor(int n) {
		if (n < 2) {
			return 1;
		}
		int temp = 1;
		for (int i = 1; i <= n; i++) {
			temp *= i;
		}

		return temp;
	}
	private static int factorialWhile(int n) {
		int temp=1;
		while(n>1) {
			temp*=n;
			n--;
		}
		return temp;
	}
	private static int factorialDoWhile(int n) {
		int temp=1;
		do {
			temp*=n;
			n--;
		} while (n>1);
		return temp;
	}

	
}
