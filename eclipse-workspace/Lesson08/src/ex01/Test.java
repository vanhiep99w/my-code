package ex01;

public class Test {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(01, "Đa Tèo", 18);
		SinhVien sv2 = new SinhVien(05, "Dê Nam", 20);
		SinhVien sv3 = new SinhVien(01, "Văn Ngọc", 18);
		SinhVien[] sinhViens = { sv1, sv2, sv3 };

		for (int i = 1; i < sinhViens.length; i++) {
			SinhVien temp;
			int a = sinhViens[0].getFullName().compareTo("a");
			if (sinhViens[i].getFullName().compareTo("a") < a) {
				temp=sinhViens[0];
				sinhViens[0]=sinhViens[i];
				sinhViens[i]=temp;
			}
		}
		for (int i = 0; i < sinhViens.length; i++) {
			System.out.println(sinhViens[i]);
		}
	}
	public static void sort(SinhVien[] sinhViens) {
		for(int out=sinhViens.length-1;out>0;out--) {
			for(int in =0;in<=out;in++) {
				if(sinhViens[out].getFullName().compareTo(sinhViens[in].getFullName())>0) {
					
				}
			}
		}
	}
}
