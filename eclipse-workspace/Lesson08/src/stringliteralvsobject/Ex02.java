package stringliteralvsobject;

public class Ex02 {
	public static void main(String[] args) {
		String l1 = "vnmese";
		String l2 = "vnmese";
		String l3 = "Viet Nam";
		
		System.out.println("l1: " + System.identityHashCode(l1));
		System.out.println("l2: " + System.identityHashCode(l2));
		System.out.println("l3: " + System.identityHashCode(l3));
		
		System.out.println("l1==l2: " + (l1==l2));
		System.out.println("l1==l3: " + (l1==l3));
	}
}