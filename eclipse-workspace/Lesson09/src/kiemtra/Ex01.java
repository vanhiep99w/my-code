
package kiemtra;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		String input = "   a we are learning the bad pro language    ";
		System.out.println("Số lượng từ trong câu : " + countWord(input));
	}

	public static int countWord(String input) {
		int count=0;
		String[] temp = input.split("[ ]+");
		String test=input.charAt(0)+"";
		if(test.equals(" ")) {
			count = temp.length-1;
		}
		return count;
	}
}
