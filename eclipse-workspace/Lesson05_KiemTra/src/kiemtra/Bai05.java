package kiemtra;

public class Bai05 {

	public static void main(String[] args) {
		SGK[] lishSGK = new SGK[3];
		lishSGK[0] = new SGK("SGK123", 100000, 5, "Kim Dong", true);
		lishSGK[1] = new SGK("SGK234", 100000, 5, "Kim Dong", false);
		lishSGK[2] = new SGK("SGK345", 100000, 5, "Kim Dong", true);
		STK[] lishSTK = new STK[2];
		lishSTK[3] = new STK("SGK123", 100000, 5, "Kim Dong", 100);
		lishSTK[4] = new STK("SGK123", 100000, 5, "Kim Dong", 100);
		show(lishSTK, lishSGK);
		System.out.println("Tổng SGK :");
		System.out.println(calSumSGK(lishSGK));
		System.out.println("Tổng STK :");
		System.out.println(calSumSTK(lishSTK));
		System.out.println("Trung binh STK :");
		System.out.println(calTBC(lishSTK));
		
	}

	public static int calSumSGK(SGK[] listSGK) {
		int sumSGK = 0;
		for (int i = 0; i < 3; i++) {
			sumSGK += listSGK[i].thanhTien();
		}
		return sumSGK;
	}

	public static int calSumSTK(STK[] listSTK) {
		int sumSTK = 0;
		for (int i = 0; i < 2; i++) {
			sumSTK += listSTK[i].thanhTien();
		}
		return sumSTK;
	}

	public static int calTBC(STK[] listSTK) {

		int sumAmount = 0;
		for (int i = 0; i < 2; i++) {
			sumAmount += listSTK[i].getAmount();
		}

		return calSumSTK(listSTK)/sumAmount;
	}
	public static void show(STK[] listSTK,SGK[] listSGK) {
		System.out.println("Sach Tham Khao : ");
		System.out.printf("%-15s%-15d%-15d%-15s%-15d", "id","donGia","amount","nhaXB","thue");
		for (int i = 0; i < 2; i++) {
			System.out.println(listSTK[i]);
		}
		System.out.println("Sach Giao Khoa : ");
		//System.out.printf("%-15s%-15d%-15d%-15s%-15s", id,donGia,amount,nhaXB,tinhTrang);
		for (int i = 0; i < 3; i++) {
			System.out.println(listSGK[i]);
		}
	}
}
