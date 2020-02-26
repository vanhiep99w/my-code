package collections.list;

import java.util.LinkedList;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		List<Integer> digits = new LinkedList<>();
		digits.add(10);
		digits.add(20);
		Integer dInt = 10;
		digits.remove(dInt);
		digits.forEach(digit -> System.out.print(digit + "  "));
		
		System.out.println("\n===============================");
		
		LinkedList<String> texts = new LinkedList<>();
		texts.addLast("XXX");
		texts.addFirst("ZZZ");
		texts.forEach(text -> System.out.print(text + "  "));
		
	}
}