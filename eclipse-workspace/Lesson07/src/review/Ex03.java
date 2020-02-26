package review;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import datetimeutils.DateUtils;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Date date = null;
		do {
			System.out.println("Nhập dd/MM/yyyy");
			String sdate = ip.nextLine();
			try {
				date = convertToDate(sdate);
				break;
			} catch (ParseException e) {
				System.out.println("Không hợp lệ !");
			}
		} while (true);
		Calendar c = Calendar.getInstance();
		c = DateUtils.convertToCalendar(date);
		DateFormat df = new SimpleDateFormat("dd MMMM yyyy ");
		System.out.print(df.format(date) + "is a " + nameDayOfWeek(c));

		System.out.println();

		System.out.println("Additional Facts:");
		additionalFacts(c);
	}

	private static String nameDayOfWeek(Calendar c) {
		DateFormatSymbols symbols = new DateFormatSymbols(new Locale("US"));
		String[] dayNames = symbols.getWeekdays();
		return dayNames[c.get(Calendar.DAY_OF_WEEK)];
	}

	private static String nameOfMonths(Calendar c) {
		DateFormatSymbols symbols = new DateFormatSymbols(new Locale("US"));
		String[] monthNames = symbols.getMonths();
		return monthNames[c.get(Calendar.MONTH)];
	}

	private static Date convertToDate(String sdate) throws ParseException {
		if (sdate.isEmpty()) {
			return null;
		}
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.parse(sdate);
	}

	private static void additionalFacts(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		System.out.print("It is day number " + dayOfYear + " of the year, "
				+ (c.getActualMaximum(Calendar.DAY_OF_YEAR) - dayOfYear) + " days left.");
		System.out.println();
		System.out.print("It is " + nameDayOfWeek(c) + " number " + c.get(Calendar.WEEK_OF_YEAR) + " out of "
				+ c.getActualMaximum(Calendar.WEEK_OF_YEAR) + " in " + year + ".");
		System.out.println();

		System.out.print("It is " + nameDayOfWeek(c) + " number " + c.get(Calendar.WEEK_OF_MONTH) + " out of "
				+ c.getActualMaximum(Calendar.WEEK_OF_MONTH) + " in " + nameOfMonths(c) + " " + year + ". ");
		System.out.println();

		System.out.print("Year " + year + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days.");
		System.out.println();
		System.out.print(nameOfMonths(c) + " " + year + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days.");

	}

}