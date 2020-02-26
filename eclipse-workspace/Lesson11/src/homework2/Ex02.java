package homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<CD> arr = mockData();
		System.out.println("==========================");
		System.out.println("danh sach hien co : ");
		arr.forEach(System.out::println);
		System.out.println("==========================");
		System.out.println("Them 1 CD");
		arr.add(creatNewCD());
		arr.forEach(System.out::println);
		System.out.println("==========================");
		System.out.print("So luong CD co trong danh sach : " + arr.size());
		float sum = arr.stream().map(CD::getPrice).reduce(0f, Float::sum);
		System.out.println("==========================");
		System.out.print("Tong gia thanh cua Cac CD :" + sum);
		System.out.println("Phương thức sắp xếp danh sách giảm dần theo giá thành.");
		arr.sort(Comparator.comparing(CD::getPrice).reversed());
		arr.forEach(System.out::println);
		System.out.println("==========================");
		System.out.println("Phương thức sắp xếp danh sách tĕng dần theo tựa CD.");
		arr.sort(Comparator.comparing(CD::getKind));
		arr.forEach(System.out::println);
	}

	public static boolean addCD(List<CD> direcory, CD newCD) {
		for (CD cd : direcory) {
			if (newCD.getid() == cd.getid()) {
				return false;
			}
		}
		direcory.add(newCD);
		return true;
	}

	public static CD creatNewCD() {
		System.out.print("Nhap vao id : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap vao loai nhac : ");
		String kind = sc.nextLine();
		System.out.print("Nhap vao ten ca sy : ");
		String singer = sc.nextLine();
		int amountOfSong = 0;
		do {
			System.out.print("Nhap so luong bai hat : ");
			amountOfSong = Integer.parseInt(sc.nextLine());
			if (amountOfSong <= 0) {
				System.out.println("Xin moi nhap lai !");
			}
		} while (amountOfSong <= 0);
		float price = 0f;
		do {
			System.out.print("Nhap so luong bai hat : ");
			price = Float.parseFloat(sc.nextLine());
			if (price <= 0) {
				System.out.println("Xin moi nhap lai !");
			}
		} while (price <= 0);
		return new CD(id, kind, singer, amountOfSong, price);
	}

	public static List<CD> mockData() {
		List<CD> mock = new ArrayList<CD>();
		mock.add(new CD(1, "nhac tre", "hiep", 1, 100000.5f));
		mock.add(new CD(2, "EDM", "duy", 2, 200000.5f));
		mock.add(new CD(3, "nhac rung", "bit", 5, 500000.5f));
		mock.add(new CD(4, "nhac nui", "khang", 4, 400000.5f));
		return mock;
	}
}
