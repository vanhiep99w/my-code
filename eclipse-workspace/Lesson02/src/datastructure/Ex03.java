package datastructure;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * Integer a = 10; Integer b = 20;
		 * 
		 * // Lay dia chi ma a, b dang tro den System.out.println("a hascode: " +
		 * System.identityHashCode(a)); System.out.println("b hascode: " +
		 * System.identityHashCode(b));
		 * 
		 * a = b; System.out.println("a hascode 1: " + System.identityHashCode(a));
		 * System.out.println("b hascode 1: " + System.identityHashCode(b));
		 * 
		 * b = 99; System.out.println("a hascode 2: " + System.identityHashCode(a));
		 * System.out.println("b hascode 2: " + System.identityHashCode(b));
		 */

		// Khac nhau giua new va non-new: constant pool
		Integer a = 22;
		Integer b = 22;
		System.out.println("a hascode: " + System.identityHashCode(a));
		System.out.println("b hascode: " + System.identityHashCode(b));

		Integer c = new Integer(50);
		Integer d = new Integer(50);

		d = 22;
		System.out.println("c hascode: " + System.identityHashCode(c));
		System.out.println("d hascode: " + System.identityHashCode(d));

		/*
		 * Khac biet giua primitive va object data type Giong: + Luu tru du lieu Khac: +
		 * Primitive > Cap phat vung nho: Stack > Performance: faster > Support : Non +
		 * Object > Cap phat vung nho: Stack - Heap > Performance: slower > Support :
		 * Cung cap nhieu ham ho tro xu ly
		 */

		// Viet ham kiem tra ky tu (chuoi) co phai la 1 so ko
		System.out.println(isDigit('h'));
		System.out.println(Character.isDigit('5'));

		// Viet ham kiem tra chuoi co phai la so nguyen ko
		System.out.println(isDigit("123a46"));
		
		//regex: Regular expression
		String sinput="12345";
		System.out.println("isNumber:"+sinput.matches("[0-9]{1,9}"));

	}

	private static boolean isDigit(char input) {
		return (input > '0' && input < '9');

	}

	private static boolean isDigit(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i)))
				return false;
		}
		return true;
	}

}
