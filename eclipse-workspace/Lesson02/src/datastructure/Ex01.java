package datastructure;

public class Ex01 {
	// C: bien toan cuc
	// java: thuoc tinh
	private static int number = 1000;
	private static final int YEAR = 1998;

	public static void main(String[] args) {
		int a = 10;
		float b = 10.5f;          // ko co f = int
		int maxInt = Integer.MAX_VALUE;
		double c = 22d;
		long d = 22l;
		long e=maxInt+10l;
		System.out.println(
				 "a: "+a
				+"\nb: "+b
				+"\nc: "+c
				+"\nd: "+d
				+"\nmax:"+maxInt
				+"\ne: "+e);
		
		char f = '\u00A9';
		String s = "Welcome";
		System.out.println(s+":"+f);
	}

	private void test() {
		int b = 10;
	}
}
