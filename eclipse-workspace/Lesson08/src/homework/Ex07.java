package homework;

public class Ex07 {

	public static void main(String[] args) {
		String input = "aaabaaabbaaaaabb";

		String maxString = "", minString = input ;

		char tempChar = input.charAt(0);
		String tempString = tempChar + "";

		for (int i = 1; i < input.length(); i++) {
			
			if (input.charAt(i) == tempChar) {
				tempString+=tempChar;
			}if (input.charAt(i) != tempChar||i==input.length()-1) {
				System.out.println(tempString);
				if(tempString.length()>maxString.length()) {
					
					maxString=tempString;
				}
				tempChar=input.charAt(i);
				tempString=tempChar+"";
			}
		}
		System.out.println("Chuỗi dài nhất : "+maxString );
	}

}
