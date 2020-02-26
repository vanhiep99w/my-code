package generic.wildcard;

import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		
	}
	private static<T extends Number> void copy(List<T> source,List<T> target) {
		target.addAll(source);
	}
	private static void copy01(List<? extends Number> source,List<? extends Number> target) {
		//target.addAll(source);
	}
}
