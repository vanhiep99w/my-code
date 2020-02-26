package reuseStream;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//supplier get() method return new stream 
		
		Supplier<Stream<String>> stream = () -> Stream.of("abc", "cdn");
		stream.get().forEach(System.out::println);
		long n = stream.get().filter(t -> t.equals("abc")).count();
		System.out.println(n);

		/*
		 * String[] array = {"a", "b", "c", "d", "e"}; Stream<String> stream =
		 * Arrays.stream(array);
		 * 
		 * // loop a stream stream.forEach(x -> System.out.println(x));
		 * 
		 * // reuse it to filter again! throws IllegalStateException long count =
		 * stream.filter(x -> "b".equals(x)).count(); System.out.println(count);
		 */
	}
}
