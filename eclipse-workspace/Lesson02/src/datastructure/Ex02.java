package datastructure;

public class Ex02 {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 5;
//		b = a;
//		System.out.println("b:"+b);

		int a = 5;
		int b = 10;

		//swap(a, b);
		a = swapAdv(b, b = a);

		System.out.println(a + "," + b);
	}

	private static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

	private static int swapAdv(int a, int b) {
		return a;
	}

}
