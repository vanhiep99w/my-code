
import java.math.BigInteger;
import java.util.Scanner;

public class Ex01{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger n=sc.nextBigInteger();
		if(n.mod(BigInteger.valueOf(4))==BigInteger.ZERO) {
			System.out.println("KHOA");
		}else System.out.println("BACH");
	}

}