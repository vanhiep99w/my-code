package controlling.loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//Viết chương trình nhập vào số nguyên n>0
		// Bắn lỗi khi nhập sai
		//Khi nào nhập đúng thì in ra n
		Scanner sc=new Scanner( System.in);
		String s;
		int number;
		
		do {
			s=sc.nextLine();
			if(isNumber(s)) {
				number=Integer.parseInt(s);
					if(number>0) {
						break;
					}
				}
			}
		 while (true);
		System.out.println(isNumber(s));	
	}
	private static boolean isNumber(String a) {
		for(int i=0;i<a.length();i++) {
			Character c=a.charAt(i);
			if(!c.isDigit(c)) {//if(
				return false;
			}
		}
		return true;
	}
}
