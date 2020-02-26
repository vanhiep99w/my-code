package blank;

import java.util.Scanner;

public class Blank {
	static KhachHang[] listKhachHang = new KhachHang[5];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		listKhachHang[0] = new KhachHang("123", "Trần Bá Hiệp", 123124151, 5000000);
		listKhachHang[1] = new KhachHang("234", "Trần Bá Hiệp", 123124151, 5000000);
		listKhachHang[2] = new KhachHang("345", "Trần Bá Hiệp", 123124151, 5000000);
		listKhachHang[3] = new KhachHang("456", "Trần Bá Hiệp", 123124151, 5000000);
		listKhachHang[4] = new KhachHang("567", "Trần Bá Hiệp", 123124151, 5000000);

		checkIn();

	}		

	public static void checkIn() {
		int temp = 0;
		String n;
		do {
			System.out.print("Nhập vào id tài khoản :");
			n = sc.nextLine();
			temp++;
			if (checkId(n) != null) {
				menu(n);
			}

		} while (temp < 3 && checkId(n) == null);
	}

	public static void menu(String id) {
		int choose;
		do {
			System.out.println("===========Menu===========");
			System.out.println("1. Nạp tiền .");
			System.out.println("2. Rút tiền .");
			System.out.println("3. Chuyển khoản .");
			System.out.println("4. Xem thông tin .");
			System.out.println("5. Thoát .");
			System.out.println("==========================");
			System.out.print("Nhập vào lựa chọn của bạn :");
			choose = Integer.parseInt(sc.nextLine());
			if (choose == 1) {
				deposit(id);
			} else if (choose == 2) {
				withdraw(id);
			} else if (choose == 3) {
				transfer(id);
			} else if (choose == 4) {
				showInfo(id);
			} else if (choose == 5) {
				System.exit(0);
			}
		} while (choose > 0 && choose < 5);
	}

	private static void showInfo(String id) {
		System.out.printf("%-15s%-15s%-15s%-15s", "id", "Họ và Tên", "SDT", "Số Dư");
		System.out.println();
		System.out.println("========================================================");
		for (int i = 0; i < 5; i++) {
			KhachHang k = checkId(id);
			System.out.printf("%-15s%-15s%-15s%-15s", k.getId(), k.getName(), k.getPhone(), k.getBlance());
		}

	}

	private static void transfer(String id) {
		KhachHang k=checkId(id);
		String m;
		do {
			System.out.print("Nhập vào số id muốn chuyển : ");
			m=sc.nextLine();
			if(checkId(m)!=null) {
				KhachHang k1=checkId(m);
				int money;
				
				do {
					System.out.print("Nhập vào số tiền cần chuyên : ");
					money=Integer.parseInt(sc.nextLine());
					if(money<=k.getBlance()) {
						k.setBlance(k.getBlance()-money);
						k1.setBlance(k1.getBlance()+money);
					}
				} while (money>k.getBlance());
			}
		}while(checkId(m)==null);
	}

	private static void withdraw(String id) {
		KhachHang k = checkId(id);
		int money;
		do {
			System.out.print("Nhập vào số tiền cần rút : ");
			money = Integer.parseInt(sc.nextLine());
			if (money <= k.getBlance()) {
				k.setBlance(k.getBlance() - money);
			}
		} while (money > k.getBlance());

	}

	private static void deposit(String id) {
		KhachHang k = checkId(id);
		int money;
		System.out.print("Nhập vào số tiền cần nạp : ");
		money = Integer.parseInt(sc.nextLine());
		k.setBlance(k.getBlance() + money);

	}

	public static KhachHang checkId(String n) {
		KhachHang k = null;
		for (int i = 0; i < 5; i++) {
			if (n.equals(listKhachHang[i].getId())) {
				return listKhachHang[i];
			}
		}
		return k;
	}
}
