package stringliteralvsobject;

public class Ex03 {
	public static void main(String[] args) {
		// String is IMMUTABLE
		String l1 = "welcome";
		
		String o1 = new String("hello");
		System.out.println("o1 V1: " + System.identityHashCode(o1));
		System.out.println("o2 V1 VALUE: " + o1);
		o1 = "welcome";
		System.out.println("o1 V2: " + System.identityHashCode(o1));
		System.out.println("o2 V2 VALUE: " + o1);
		
		System.out.println(l1==o1);
		
		String s1 = new String("welcome to java06");
		String s2 = new String("welcome to java06");
		
		System.out.println("s1==s2: " + (s1.intern() == s2.intern()));
		
	}
}