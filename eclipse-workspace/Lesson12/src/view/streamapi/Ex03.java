package view.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex03 {

	public static void main(String[] args) {
		List<String> first = Arrays.asList("2 cơ", "Xì rô", "10 bích");
		List<String> second = Arrays.asList("3 cơ", "Xì rô", "8 bích");
		List<String> third = Arrays.asList("4 cơ", "Xì chuồn", "9 bích");
		List<String> fourth = Arrays.asList("5 cơ", "Xì bích", "7 bích");
		List<List<String>> cards = Arrays.asList(first, second, third);
		List<String> result= cards
				.stream()
				.flatMap(Collection::stream)
				.filter(t->t.contains("2"))
				.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
