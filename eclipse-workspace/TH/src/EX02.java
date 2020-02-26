
import java.util.Random;
import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
	 
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<10) {
				System.out.println("BACH");
			}
			else {
				if(test(arr[i])==true)System.out.println("KHOA");
				else System.out.println("BACH");
			}
		}

	}
	
	public static boolean test(int n) {
		n=n-10;
		if(n%3==0) return true;
		else return false;
	}
}