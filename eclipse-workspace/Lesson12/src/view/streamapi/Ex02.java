package view.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * Stream<Integer> t = Stream.empty(); Optional<Integer> re = t.reduce((t1, t2)
		 * -> t1 + t2); System.out.println(re);
		 */
		/*
		 * int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } }; 
		 * int[] arr2 = { 1, 2, 3
		 * , 4, 5 ,6, 7, 8 }; List<Integer> list=Arrays.asList(1, 2, 3 , 4, 5 ,6, 7, 8);
		 * List<Integer> result = new ArrayList()<Integer>(); result.add(1);
		 * result.add(2); int n = 5; result.stream() .limit(n) .reduce(identity,
		 * (base,index) -> base); //Arrays.stream(arr2).m)
		 * 
		 * for (int[] is : arr) { for (int is1 : is) { if (is1 % 2 == 0)
		 * System.out.println(is1); } }
		 * 
		 * 
		 * Arrays.stream(arr) .flatMap(is->Arrays.stream(is).boxed()) .filter(i->i%2==0)
		 * .forEach(System.out::println);
		 * 
		 * list.stream().re List<List<Integer>>
		 * digit=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(8
		 * ,9,0)); digit.stream() .flatMap(is->is.stream().map(String::valueOf))
		 * //collection::stream .forEach(System.out::println);;
		 */
		List<Integer> list=Arrays.asList(1, 2, 3 , 4, 5 ,6, 7, 8);
		list.stream().flatMap(new Function<Integer, Stream<String>>() {

			@Override
			public Stream<String> apply(Integer t) {
				String s=t+" a";
				return Stream.of(s);
			}
		}).forEach(System.out::println);;
	}
}
