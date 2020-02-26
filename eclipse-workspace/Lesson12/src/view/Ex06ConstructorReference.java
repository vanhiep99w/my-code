package view;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ex06ConstructorReference {

	public static void main(String[] args) {
		// tạo instance variable thông qua constructor reference
		// Supplier<Apple> s0=()->new Apple();
		Supplier<Apple> s0 = Apple::new;
		s0.get();
		Supplier<LinkedHashMap<String, Integer>> lmap = LinkedHashMap::new;
		lmap.get();
		
		Supplier<Apple> sMap = Apple::new;
		Function<Integer, String[]> sArray=String[]::new ;
		String[] test=sArray.apply(1);
		System.out.println(test.length);
		

	}
}
