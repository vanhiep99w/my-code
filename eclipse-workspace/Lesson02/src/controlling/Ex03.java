package controlling;

public class Ex03 {
	public static void main(String[] args) {
		int number = RandomUtils.rd.nextInt(10);
		switch (number % 2) {
		case 0:
			System.out.println(number + " la so chan");
			break;
		case 1:
			System.out.println(number + " la so le");
			break;
		}
	}
}
