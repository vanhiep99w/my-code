package ex03;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println(isAnagram("word", "orWd"));;
	}
	public static boolean isAnagram(String s1,String s2) {
		char[] arrS1= s1.toCharArray();
		for (char c : arrS1) {
			if (check(s1, c)!=check(s2, c)) {
				return false;
			}
		}
		return true;
	}
	
	public static int check(String s,char c) {
		int temp=0;
		char[] t=s.toCharArray();
		for (char d : t) {
			if ((d+"").equalsIgnoreCase(c+"")) {
				temp++;
			}
		}
		return temp;
	}
}
