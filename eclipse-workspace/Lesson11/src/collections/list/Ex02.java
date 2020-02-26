package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		// Trước Java 1.5
		// rawtypes
		List<Integer> digits =new ArrayList<>();

	
		System.out.println("size : "+ digits.size());
		System.out.println("Is empty : "+ digits.isEmpty());
		digits.add(1);
		digits.add(7);
		digits.add(12);
		digits.add(29);
		digits.add(35);
		digits.add(4);
		System.out.println("size : "+ digits.size());
		System.out.println("Is empty : "+ digits.isEmpty());
		
		//iterating
		//loop(digits);
		digits.stream().forEach(digit-> System.out.print(digit+" "));
		System.out.println(digits.contains(7));
		Collections.sort(digits);
		Collections.reverse(digits);
		digits.stream().forEach(digit-> System.out.print(digit+" "));
		
	}
	@SuppressWarnings("unused")
	public static void loop(List<Integer> digits) {
		for(int i=0;i<digits.size();i++) {
			System.out.print( digits.get(i)+" ");
		}
		System.out.println("\n================");
		for(Integer i: digits) {
			System.out.print(i +" ");
		}
		System.out.println("\n================");
		Iterator<Integer> iter=digits.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println("\n================");
		digits.stream().forEach(digit-> System.out.print(digit+" "));
	}
}
