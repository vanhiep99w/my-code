package kiemtra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {

	public static void main(String[] args) {
		List<Integer> arr1=Arrays.asList(1,2,3,4,5,6,5,3,1);
		System.out.println("cau a: ");
		for (Integer integer : arr1) {
			if (check(arr1, integer)==1) {
				System.out.print(integer+" ");
			}
		}
		System.out.println("\ncau b: ");
		List<Integer> result=new ArrayList<Integer>();
		for (Integer integer : arr1) {
			if (check(arr1, integer)!=1) {
				result.add(integer);
				
			}
		}
		result.stream().distinct().forEach(System.out::print);
		
	}
	public static int check(List<Integer> arr,Integer n) {
		int result=0;
		for (Integer integer : arr) {
			if (integer==n) {
				result++;
			}
		}
		return result;
	}
}
