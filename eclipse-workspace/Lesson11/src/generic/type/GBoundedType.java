package generic.type;

import java.util.Arrays;
import java.util.List;

public class GBoundedType {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> doubles = Arrays.asList(1d, 2d, 3d, 4d, 5d);
		List<Float> floats = Arrays.asList(1f, 2f, 3f, 4f, 5f);
		List<Number> numbers = Arrays.asList(1, 1f, 1d);
		List<String> strings = Arrays.asList("1", "1f", "1d");
		List<Object> objects=Arrays.asList(1,4f," ");
		// show(integers);
		// show(doubles);
		
	}
	
	private static <E extends Number> void show(List<E> list) {
		list.forEach(item -> System.out.print(item + "  "));
	}
	
	
	
	
}
