package generic.type;

import java.util.Arrays;
import java.util.List;

public class GMethodEx01 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> doubles = Arrays.asList(1d, 2d, 3d, 4d, 5d);
		List<Float> floats = Arrays.asList(1f, 2f, 3f, 4f, 5f);
		List<Number> numbers = Arrays.asList(1, 1f, 1d);
		List<String> strings = Arrays.asList("1", "1f", "1d");
		
		// show(integers);
		// show(doubles);
		show(strings);
	}
	
	private static <E extends CharSequence> void show(List<E> list) {
		list.forEach(item -> System.out.print(item + "  "));
	}
	
	
	
	
}