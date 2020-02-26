package homework;

public class Ex04 {

	public static void main(String[] args) {
		String s1 = luuUocSoNGuyenTo(12);
		String s2 = luuUocSoNGuyenTo(60);
		System.out.println(isPrimeNumberTogether(s1, s2));

	}

	private static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPrimeNumberTogether(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (!s2.contains(s1.charAt(i) + "")) {
				return false;
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if (!s1.contains(s2.charAt(i) + "")) {
				return false;
			}
		}
		return true;
	}

	public static String luuUocSoNGuyenTo(int n) {
		// em ko có ý tưởng về tên hàm nên cần a giúp vs ạ
		// lưu tất cả các ước là số nguyển tố của n
		String s1 = "";
		for (int i = 2; i < n; i++) {
			if (n % i == 0 && isPrimeNumber(i)) {
				s1 += i;
			}
			if (n % i == 0 && !isPrimeNumber(i)) {
				s1 += luuUocSoNGuyenTo(i);
			}
		}
		return s1;
	}

}
