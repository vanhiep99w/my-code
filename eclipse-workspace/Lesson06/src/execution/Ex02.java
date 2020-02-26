package execution;

public class Ex02 {

	public static void main(String[] args) {
		//Floating point : IEEE 754
		// arithmeticException / By zero
		int  a=10;
		int b=0;
		try {
			System.out.println(devide2Digits(a, b));
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("1");
		}
		
	}
	private static int devide2Digits(int first,int second) throws ArithmeticException{
	
		return first/second;
	}
}
