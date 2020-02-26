package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex01  {

	public static void main(String[] args) {
		
		List< Apple> apples=new ArrayList<Apple>();
		apples.add(new Apple("vang", "vn", "12"));
		apples.add(new Apple("do", "cn", "14"));
		apples.add(new Apple("tim", "usa", "22"));
		apples.add(new Apple("vang", "tl", "1"));
		apples.add(new Apple("xanh", "l", "14"));
		apples.add(new Apple("xanh", "vn", "14"));
		
		List<Apple> greenApple=filterApple(apples, t->"green".equals(t.getColor()));
		
		
		apples.forEach(System.out::println );
	}
	public static List<Apple> filterApple(List<Apple> apples,Predicate<Apple> predicate){
		List<Apple> result=new ArrayList<Apple>();
		for (Apple apple : result) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	
}
