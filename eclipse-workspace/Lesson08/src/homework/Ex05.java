package homework;

public class Ex05 {
	public static void main(String[] args) {
		String st1 = "ABCEVDEABCKkkkkkkkkkk";
		String st2 = "ABCEDCBBvCKkkkkkk";
		System.out.println("chuỗi chung dài nhất : " + findMaxString(st2, st1));
		;

	}

	public static String findMaxString(String s1, String s2) {
		// s1 có length nhỏ hơn s2
		String maxString = "";
		String tempString = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				tempString += s1.charAt(i);
			}
			if (s1.charAt(i) != s2.charAt(i) || i == s1.length() - 1) {
				if (tempString.length() > maxString.length()) {
					maxString = tempString;
					tempString = "";
				}
			}

		}
		return maxString;
	}

}