package stringbb;

public class Ex01 {

	public static void main(String[] args) {
		String s1="hello";
		System.out.println("s1 code 1: "+ System.identityHashCode(s1));
		s1=s1.concat("+ bye bye");
		System.out.println("s1 code 2: "+ System.identityHashCode(s1));
		StringBuilder sb1=new StringBuilder("xin chao");
		System.out.println("sb1 code 1: "+ System.identityHashCode(sb1));
		sb1.append("+tam biet");
		System.out.println("sb1 code 2: "+ System.identityHashCode(sb1));
	}
}
