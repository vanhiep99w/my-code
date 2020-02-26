package review;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("In ra thông tin tất cả các ngày chủ nhật trong năm:");
		getAllSundaysInYear();
		System.out.println("===================================================");

		System.out.println("In ra ngày chủ nhật cuối cùng của một năm bất kỳ:");
		Scanner ip = new Scanner(System.in);
		int year;
		do {
			System.out.println("Nhập năm bất kì:");
			String sYear = ip.nextLine();
			try {
				year = Integer.parseInt(sYear);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Năm không hợp lệ!");
			}

		} while (true);
		getLastSunday(year);

	}

	private static void getAllSundaysInYear() {
		Calendar c = Calendar.getInstance();
		c.set(2019, Calendar.JANUARY, 1);
		DateFormat df = new SimpleDateFormat(" dd/MM/yyyy");
		for (int i = 1; i < c.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
			if (c.get(Calendar.DAY_OF_WEEK) == 1) {
				System.out.println(df.format(c.getTime()));
			}
			c.add(Calendar.DATE, 1);
		}
	}

	private static void getLastSunday(int year) {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.set(year, Calendar.DECEMBER, 31);
		while (true) {
			if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
				date = cal.getTime();
				break;
			}
			cal.add(Calendar.DATE, -1);
		}
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String strdate = sdf.format(date);
		System.out.println(strdate);

	}

}