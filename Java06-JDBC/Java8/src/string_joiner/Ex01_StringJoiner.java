package string_joiner;

import java.util.StringJoiner;

public class Ex01_StringJoiner {
	public static void main(String[] args) {
		StringJoiner s = new StringJoiner("-","+","?");
		
		s.add("123");
		s.add("345");
		s.add("567");
		System.out.println(s.toString());
	}
}
