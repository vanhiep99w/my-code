package view.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import dao.Dish;
import service.DishService;

public class Ex04 {

	public static void main(String[] args) {
		DishService dishService = new DishService();
		List<Dish> menu = dishService.getAll();
		menu.stream().reduce(Dish::new, new BiFunction() {
		}, (Dish t1, Dish t2) -> t1.getCalories() - t2.getCalories());

		// Is all the menu's dishes for vegetarin

		// menu.stream().allMatch(is->is.isVegeterian());
		// System.out.println(menu.stream().filter(d -> d.getCalories() ==
		// 280).findAny().orElse(null));
		// IntStream t=IntStream.range(1, 100).filter(u->u%2==0);
		// int a=3;
		// Stream<int[]> test=IntStream.rangeClosed(1, 100).filter(b -> Math.sqrt(a*a +
		// b*b) % 1 == 0).boxed().map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b *
		// b)}).fla;
		// test.collect(Collectors.toList()).forEach(System.out::println);
		// IntStream.rangeClosed(1, 100).filter(b -> Math.sqrt(a*a + b*b) % 1 == 0);
		// Stream.o
		// });
		// Stream<int[]> pythagoreanTriples =

		Stream<int[]> pythagoreanTriples =IntStream.rangeClosed(1, 100).boxed()
				.flatMap(a -> IntStream.rangeClosed(a, 100).filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
						.
		//pythagoreanTriples.limit(5).forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));

		/*
		 * t.forEach(System.out::println); IntStream t2 = IntStream.rangeClosed(1,
		 * 100).filter(u -> u % 2 == 0); System.out.println(t2.count());
		 */
						List<Integer> naturals = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
				naturals.stream()
				    .map(n -> n * 2)
				    .peek(System.out::println)
				    .collect(Collectors.toList());
	}
}
