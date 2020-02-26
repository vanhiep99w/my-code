package homework;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input;
		do {
			input=sc.nextLine();
			try {
				isValid(input);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		String result="";
		String[]temp=input.split(" ");
		for(int i=0;i<temp.length;i++) {
			result+=upperCaseFirstCharacter(temp[i])+" ";
		}
		System.out.println(result);
	}
	public static String  upperCaseFirstCharacter(String s) {
		String temp="";
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				char c=Character.toUpperCase(s.charAt(0));
				temp+=c;
				continue;
			}else {
				char c=Character.toLowerCase(s.charAt(i));
				temp+=c;
			}
		}
		return temp;
	}
	public static boolean isValid(String input) throws Exception {
		if(!input.matches("[A-Za-z ]+")) {
			throw new Exception("Họ tên chỉ chứa các kí tự từ a-z");
		}
		return true;
	}
}
