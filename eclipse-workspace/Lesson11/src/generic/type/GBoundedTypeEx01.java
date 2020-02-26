package generic.type;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GBoundedTypeEx01 {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		int result=compare(integers,i->i.equals(3));
		System.out.println(result);
	}
	public static <T extends Comparable<T>> int compare(List<T> list ,Predicate<T> predicate) {
		int temp=0;
		for (T t : list) {
			if(predicate.test(t)) {
				temp++;
			}
		}
		return temp;
	}
}
