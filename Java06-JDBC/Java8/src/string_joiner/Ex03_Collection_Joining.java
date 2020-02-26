package string_joiner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex03_Collection_Joining {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("123","234","456","789");
		String s = strings.stream().collect(Collectors.joining("-"));
		System.out.println(s);
	}
}
