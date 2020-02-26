package homework;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;
		do {
			input = sc.nextLine();
			try {
				isVlid(input);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		//Cắt chữ
		String[] charArr = input.split("");
		for (String temp : charArr) {
			if (!temp.equals(" ")) {
				System.out.println(temp);
			}
		}
		//cắt từ
		System.out.println("========");
		String temp="0 "+input;
		String[] wordArr= temp.split("[ ]+");
		for(int i=1;i<wordArr.length;i++) {
			System.out.println(wordArr[i]);
		}
		//đảo chữ
		System.out.println("==========");
		for (int i=charArr.length-1;i>=0;i--) {
			if (!charArr[i].equals(" ")) {
				System.out.println(charArr[i]);
			}
		}
		//đảo word
		System.out.println("===========");
		for(int i=wordArr.length-1;i>=1;i--) {
			System.out.println(wordArr[i]);
		}
	}

	public static Boolean isVlid(String input) throws Exception {
		if (input.matches("[wjzf]+")) {
			throw new Exception("Không được chứa các kí tự W hoặc J Hoặc Z");
		}
		return true;
	}
}
