package generic.wildcard;

import java.util.Arrays;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> doubles = Arrays.asList(1d, 2d, 3d, 4d, 5d);
		List<Float> floats = Arrays.asList(1f, 2f, 3f, 4f, 5f);
		List<Number> numbers = Arrays.asList(1, 1f, 1d);
		List<String> strings = Arrays.asList("1", "1f", "1d");
		List<Object> objects=Arrays.asList(1,4f," ");
		showUpper(integers);
		showLower(objects);
	}
	private static void showUpper(List<? extends Number> ts) {
		for (Object t : ts) {
			System.out.println(t +" ");
		}
		System.out.println("=================");
		ts.forEach(t->System.out.println(t));
	}
	private static void showLower(List<? super Integer> ts) {
		for (Object t : ts) {
			System.out.println(t +" ");
		}
		System.out.println("=================");
		ts.forEach(t->System.out.println(t));
	}
}
