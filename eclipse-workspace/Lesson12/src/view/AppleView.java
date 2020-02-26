package view;

import static java.util.Comparator.*;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import service.AppleService;

public class AppleView {

	public static void main(String[] args) {
		AppleService appleService=new AppleService();
		List<Apple> inventory=appleService.getAll();
		inventory.sort(comparing(Apple::getColor));
		Map<String, Apple> t=inventory.stream().collect(Collectors.toMap(Apple::getColor, a->a,(a1,a2)->a1));
		t.forEach(System.out::printf);
	}
}
