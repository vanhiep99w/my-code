package basic_array;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		
		/*int[] number= {1,4,8,5,2,9};
		Arrays.sort(number);
		Arrays.stream(number).forEach(num->System.out.println(num));
		int index=Arrays.binarySearch(number, 8);
		System.out.println(index);*/
		int[] number= {1,4,8,2,9};
		//covert int[] to interger[]
		Integer[] numbersBox=Arrays.stream(number).boxed().toArray(Integer[]::new);
		Arrays.sort(numbersBox,(o1,o2)->o2.compareTo(o1));
		
		Arrays.stream(numbersBox).forEach(num-> System.out.print(num+" "));
		// chỉ áp dụng cho promitive types
//		int index=Arrays.binarySearch(number, 2);
//		System.out.println("\nindex: "+);
		
		
	}
	
}
