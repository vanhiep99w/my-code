package stringliteralvsobject;

public class Ex04 {
	private static final long COUNT = 1000000l;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (long i = 0; i < COUNT; i++) {
			String l1 = "welcome";
			String l2 = "welcome";
		}
		long end = System.currentTimeMillis();
		System.out.println("String literal duration: " + (end - start));

		/*
		long start = System.currentTimeMillis();
		for (long i = 0; i < COUNT; i++) {
			String o1 = new String("welcome");
			String o2 = new String("welcome");
		}
		long end = System.currentTimeMillis();
		System.out.println("String object duration: " + (end - start));
		*/

	}
}