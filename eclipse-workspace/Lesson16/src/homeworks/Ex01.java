package homeworks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(2, 8, 9, 1, 6);
		List<Integer> list2=Arrays.asList(2,1, 1, 8, 9);
		List<Integer> result=commonNumber(list1, list2);
		result.forEach(System.out::println);
	}
	public static List<Integer> commonNumber(List<Integer> list1,List<Integer> list2) {
		return list1.stream().filter(t->list2.contains(t)).distinct().collect(Collectors.toList());
	}
}
