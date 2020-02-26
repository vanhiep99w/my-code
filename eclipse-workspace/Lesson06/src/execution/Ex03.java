package execution;

public class Ex03 {

	public static void main(String[] args) {
		int[] nuber= {1,3,5,4,7,10};
		System.out.println(nuber[10]);
	}
	private static void showNumber(int[] nuber) {
		for(int item : nuber) {
			System.out.println(item);
		}
	}
	
}
