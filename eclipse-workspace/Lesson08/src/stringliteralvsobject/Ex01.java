package stringliteralvsobject;

public class Ex01 {
	public static void main(String[] args) {
		String o1 = new String("vnmese");
		String o2 = new String("vnmese");
		String o3 = new String("Viet Nam");
		
		System.out.println("o1: " + System.identityHashCode(o1));
		System.out.println("o2: " + System.identityHashCode(o2));
		System.out.println("o3: " + System.identityHashCode(o3));
		
		System.out.println("o1==o2: " + (o1==o2));
		System.out.println("o1==o3: " + (o1==o3));
	}
}