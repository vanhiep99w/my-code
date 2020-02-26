package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		int size = 10;// size of list;
		List<Integer> listInter = new ArrayList<Integer>();
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			listInter.add(rd.nextInt(91) + 10);
			//listInter.add(rd.nextInt(20)+1);
		}
		listInter.stream().forEach(ele -> System.out.print(ele + " "));
		System.out.println();
		List<Integer> listCopy = new ArrayList<Integer>(listInter);

		System.out.println("Số lớn thứ 2 : " + theSecondMax(listCopy));
		// Tổng số đầu và cuối
		System.out.println("Tổng 2 số đầu và cuối : "+(listInter.get(0) + listInter.get(listInter.size() - 1)));
		System.out.println("LCM :" + LCMOfList(listInter));

	}

	public static long GCD(long a, long b) {
		if (a == 0 || b == 0)
			return a + b;
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}
	public static long LCM(long a,long b) {
		return (a*b)/GCD(a, b);
	}
	public static long LCMOfList(List<Integer> lisInter) {
		long restlt=1;
		for (Integer integer : lisInter) {
			restlt=LCM(restlt, integer);
			System.out.println(restlt);
		}
		return restlt;
	}

	public static int theSecondMax(List<Integer> listInter) {
		listInter.sort(Integer::compare);

		return listInter.get(listInter.size() - 2);
	}

}
