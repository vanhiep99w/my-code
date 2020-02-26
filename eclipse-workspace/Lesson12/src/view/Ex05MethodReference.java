package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Ex05MethodReference {

	public static void main(String[] args) {
		//Function<String, Integer>stringToInteger=(String s)->s.length();
		Function<String, Integer>stringToInteger=String::length;
		int lenght=stringToInteger.apply("Hello");
		System.out.println(lenght);
		//BiPredicate<List<String>, String> biPredicate=(List,item)->List.contains(item);
		List<String> test=Arrays.asList("a","b");
		String text="a";
		//BiPredicate<List<String>, String> biPredicate=(List,item)->List.contains(item);
		BiPredicate<List<String>, String> biPredicate=List::contains;
		System.out.println(biPredicate.test(test, text));
		//Comparator<Apple> c=(a1,a2)->a1.getColor().compareTo(a2.getColor());
		Comparator<Apple> c=Comparator.comparing(Apple::getColor);
	
		BiFunction<String, String, Integer> bb = String::compareTo;
	}
}
