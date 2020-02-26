package datastructure;

public class Ex05 {
	public static void main(String[] args) {
		int a = 10;
		Integer b = 100;
		System.out.println(b.intValue());

		// Copy address
		Integer c = b;
		// Boxing, UnBoxing, AutoBoxing

		// UnBoxing
		a = b;

		// Boxing
		b = a;
	}
}
