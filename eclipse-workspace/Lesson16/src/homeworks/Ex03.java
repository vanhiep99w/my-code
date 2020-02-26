package homeworks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex03 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(8 ,5, 9, 20);
		list.stream().sorted((t1,t2)->levelOfNumber(t1)-levelOfNumber(t2)).forEach(System.out::println);
		
	}
	public static int levelOfNumber(int n) {
		int level=0;
		if(n==0) {
			return 0;
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) level++;
		}
		return level;
	}
}
