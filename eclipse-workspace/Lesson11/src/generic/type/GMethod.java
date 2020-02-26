package generic.type;

import collections.list.Employee;

public class GMethod {
	public static void main(String[] args) {
		Integer[] integers = { 10, 20, 30, 40 };
		Double[] doubles = { 5d, 15d, 25d, 35d };
		String[] strings = { "A", "B", "C", "D" };
		Object[] objects = { 1, "xx", 15d };

		printf(strings);
		printf(doubles);
		printf(integers);
		printf(objects);

		display(new Integer(10));
		display(new String("10"));
		display(new Employee());
	}

	// generic method: not prefer
	private static void show(Object[] strings) {
		for (Object string : strings) {
			System.out.print(string + "  ");
		}
	}
	
	// generic method with E type
	private static <E> void printf(E[] es) {
		for (E e : es) {
			System.out.print(e + "  ");
		}
	}

	private static <T> void display(T t) {
		System.out.println(t);
	}
}