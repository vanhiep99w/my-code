package view.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


import dao.Dish;
import dao.Type;
import service.DishService;

public class Ex01 {

	public static void main(String[] args) {
		DishService dishService = new DishService();
		List<Dish> menu = dishService.getAll();
		//menu.stream().mapToInt()
		List<String> result = menu.stream()
				.filter(dish -> dish.getCalories() < 300)
				.sorted(Comparator.comparing(Dish::getName))
				.map(Dish::getName).collect(Collectors.toList());
		System.out.println("==============================");
		
		List<Dish> temp=menu.stream().filter(t->Type.MEAT.equals(t.getType())).collect(Collectors.toList());
		temp.forEach(System.out::println);
		System.out.println("===============================");
		List<Integer> intList=Arrays.asList(1,2,3,4,5,6,2,3,0,8);
		List<Integer> temp2=intList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("================");
		//BinaryOperator<Dish> d=(t,u)->t;
		//Dish m;
		List<Dish> temp3=menu.stream()
			//	.filter(t->Type.MEAT.equals(t.getType()))
				.filter(distinctBy(Dish::getCalories))
				.collect(Collectors.toList());
		List<String> temp4=menu.stream().filter(t->t.getCalories()>100).map(Dish::getName).collect(Collectors.toList());
		
	}

	/*
	 * private static Predicate<Dish> distinctBy(Function<Dish, Integer>function){
	 * Set<Integer> seen = new HashSet<>(); return d-> seen.add(function.apply(d));
	 * }
	 */
	
	/*
	 * private static <T,U> Predicate<T> distinctBy(Function<T, U>function){ Set<U>
	 * seen = new HashSet<>(); return (T d)-> seen.add(function.apply(d)); }
	 */
	
	private static <T> Predicate<T> distinctBy(Function<T, ?>function){
		Set<Object> seen = new HashSet<>();
		return d-> seen.add( function.apply(d));
	}
}

