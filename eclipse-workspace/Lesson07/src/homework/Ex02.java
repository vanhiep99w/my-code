package homework;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int second = c.get(Calendar.SECOND);
		int minute = c.get(Calendar.MINUTE);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println("Hiện Tại : "+second+"(s) "+minute+ "(m) " + hour + "(h) " +day + "(d) " + month + "(mo) " + year+ "(y)");
		c = scanfDayLoving();
		calDayLoving(day, month, year, hour, second, minute, c);	
	}
	public static void calDayLoving(int day, int month, int year, int hour, int second, int minute, Calendar c) {

		int dayTime = c.getActualMaximum(Calendar.DAY_OF_MONTH) - c.get(Calendar.DAY_OF_MONTH) + day;
		int monthTime = 0;
		int yearTime = 0;
		int dayTotal = dayTime;
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.MONTH, c.get(Calendar.MONTH) + 1);

		int tempYear = c.get(Calendar.YEAR);
		while (!(month == c.get(Calendar.MONTH) && year == c.get(Calendar.YEAR))) {
			dayTotal = dayTotal + c.getActualMaximum(Calendar.DAY_OF_MONTH);
			c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + c.getActualMaximum(Calendar.DAY_OF_MONTH));
			monthTime++;
		}
		yearTime = c.get(Calendar.YEAR) - tempYear;
		int secondTime = (60 - c.get(Calendar.SECOND) + second);
		int minuteTime = 60 - c.get(Calendar.MINUTE) + minute;
		int hourTime = 24 - c.get(Calendar.HOUR_OF_DAY) + hour;
		dayTime = dayTime - 2;
		if (secondTime >= 60) {
			secondTime = secondTime - 60;
			minuteTime++;
		}
		if (minuteTime >= 60) {
			minuteTime = minuteTime - 60;
			hourTime++;
		}
		if (hourTime >= 24) {
			hourTime = 24 - hourTime;
			dayTime++;
		}
		
		System.out.println(secondTime + "(s) " + minuteTime + "(m) " + hourTime + "(h) " + dayTime + "(d) "
				+ monthTime + "(mo) " + yearTime + "(y) ");
		int secondTotal = secondTime + minuteTime * 60 + hour * 60 * 60 + dayTotal * 24 * 60 * 60;
		System.out.println("Tổng Ngày : " + dayTotal+"(d)");
		System.out.println("Tổng Giây : " + secondTotal+"(s)");
	}

	
	public static Calendar scanfDayLoving() {

		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();

		System.out.println("Nhớ nhập đúng nhé @@ ");
		System.out.print("Nhập vào giây : ");
		int secondLoving = Integer.parseInt(sc.nextLine());
		c.set(Calendar.SECOND, secondLoving);

		System.out.print("Nhập vào phút : ");
		int minuteLoving = Integer.parseInt(sc.nextLine());
		c.set(Calendar.MINUTE, minuteLoving);

		System.out.print("Nhập vào giờ : ");
		int hourLoving = Integer.parseInt(sc.nextLine());
		c.set(Calendar.HOUR_OF_DAY, hourLoving);

		System.out.print("Nhập vào Ngày : ");
		int dayLoving = Integer.parseInt(sc.nextLine());
		c.set(Calendar.DAY_OF_MONTH, dayLoving);

		System.out.print("Nhập vào Tháng : ");
		int MonthLoving = Integer.parseInt(sc.nextLine());
		c.set(Calendar.MONTH, MonthLoving - 1);

		System.out.print("Nhập vào Năm : ");
		int yearLoving = Integer.parseInt(sc.nextLine());
		c.set(Calendar.YEAR, yearLoving);

		return c;
		
	}
}
