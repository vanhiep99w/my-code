package view;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;


public class Ex02 {

	public static void main(String[] args) {
		
		BiFunction<String, String, Integer> biFunction = (t, u) -> 1;
		BinaryOperator<String> test=(t,u)->t+u;
		List<String> students=Arrays.asList("a","b","c");
		students.forEach(System.out::println);
	}
}
