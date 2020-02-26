package baitap;

import java.util.Random;

public class Bai4 {

	public static void main(String[] args) {
		System.out.println(soNT200());
	}
	private static boolean checkSNT(int n) {
		if (n == 2) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static int soNT200() {
		int temp = 0,temp2=0;
		for (int i = 2;; i++) {
			if (checkSNT(i)) {
				temp++;
				temp2=i;
			}
		    if(temp==199) {
		    	break;
		    }					
		}
		while(temp!=200) {
			
		}
		return temp2;
	}
}