package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex05 {
	public static void main(String[] args) {
		List<String> first = Arrays.asList("A", "222", "C", "333");
		List<String> second = Arrays.asList("111", "222", "333");
		
		Set<String> sfirst = new HashSet<>(first);
		Set<String> ssecond = new HashSet<>(second);

		// Hợp
		Set<String> generatedResult = new HashSet<>(sfirst);
		generatedResult.addAll(ssecond);
		generatedResult.forEach(item -> System.out.print(item + "  "));

		System.out.println("\n===============================");
		
		// Giao
		List<String> intersectionResult = new ArrayList<>(first);
		intersectionResult.retainAll(second);
		intersectionResult.forEach(item -> System.out.print(item + "  "));
		
		System.out.println("\n===============================");
		
		// Hiệu
		List<String> removeResult = new ArrayList<>(first);
		removeResult.removeAll(second);
		removeResult.forEach(item -> System.out.print(item + "  "));

	}

}