package random;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex01 {
	public static void main(String[] args) {
		Random rd = new Random();
		Integer i = rd.ints(10,20).findFirst().getAsInt();
		System.out.println(i);
	}
}
