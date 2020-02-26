package kiemtra;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào Tên tài khoản : ");
		String user = sc.nextLine();
		Account acc = new Account(user);
		System.out.println("Mật khẩu hiện tại của bạn là ADMIM123");
		System.out.print("Nhập mật khẩu mới : ");
		do {
			try {
				String newPass = sc.nextLine();
				acc.isCorrectPass(newPass);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.print("Mời nhập lại ! ");
			}
		} while (true);
		System.out.println("Đổi mật khẩu thành công .");
	}
}
