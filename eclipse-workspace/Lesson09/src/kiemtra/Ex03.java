package kiemtra;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(102, "Nam", "C");
		SinhVien sv2 = new SinhVien(104, "Hoàng", "D");
		SinhVien sv3 = new SinhVien(109, "Lan", "A");
		SinhVien sv4 = new SinhVien(103, "Bảo", "F");
		SinhVien sv5 = new SinhVien(105, "Nguyên", "B");
		SinhVien sv6 = new SinhVien(107, "Vũ", "F");
		SinhVien sv7 = new SinhVien(105, "Nguyên", "B");
		SinhVien sv8 = new SinhVien(104, "Hoàng", "D");
		SinhVien sv9 = new SinhVien(199, "Tài", "A");
		SinhVien[] sinhViens = { sv1, sv2, sv3, sv4, sv5, sv6, sv7, sv8, sv9 };
		ArrayList<SinhVien> arrA = cauA(sinhViens);
		for (SinhVien temp : arrA) {
			System.out.println(temp);
		}
		System.out.println("================================");
		ArrayList<SinhVien> arrB = new ArrayList<SinhVien>();
		arrB = cauB(arrA);
		for (SinhVien temp : arrB) {
			System.out.println(temp);
		}
	}

	public static ArrayList<SinhVien> cauA(SinhVien[] sinhViens) {
		ArrayList<SinhVien> test = new ArrayList<SinhVien>();
		for (int i = 0; i < sinhViens.length; i++) {
			boolean b = true;
			for (int j = 0; j < sinhViens.length; j++) {
				if (i != j) {
					if (sinhViens[i].getId() == sinhViens[j].getId()) {
						b = false;
					}
				}
			}
			if (b) {
				test.add(sinhViens[i]);
			}
		}
		return test;
	}

	public static ArrayList<SinhVien> cauB(ArrayList<SinhVien> temp) {
		ArrayList<SinhVien> result = new ArrayList<SinhVien>();
		for (SinhVien sv : temp) {
			if (sv.getRank().equals("A")) {
				result.add(sv);
			}
		}
		return result;
	}

}
