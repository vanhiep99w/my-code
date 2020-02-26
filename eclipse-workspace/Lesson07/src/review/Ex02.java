package review;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import datetimeutils.DateUtils;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String firstPerson;
		String secondPerson;
		System.out.println("Nhập tên của người thứ nhất:");
		firstPerson = ip.nextLine();
		System.out.println("Nhập tên của người thứ hai:");
		secondPerson = ip.nextLine();

		System.out.println("Nhập ngày giờ bắt đầu hẹn hò:");

		Date date = null;
		do {
			System.out.println("Nhập dd/MM/yyyy HH:mm");
			String sdate = ip.nextLine();
			try {
				date = DateUtils.convertToDate(sdate);
				break;
			} catch (ParseException e) {
				System.out.println("Không hợp lệ !");
			}
		} while (true);
		Calendar c = Calendar.getInstance();
		c = DateUtils.convertToCalendar(date);
		System.out.print("Ngày bắt đầu hẹn họ là ngày ");
		countDayOfWeek(c);
		System.out.print("Mối tình đã bắt đầu được ");
		countLoveDateTime(c);
		System.out.println("Dự đoán mối tình sẽ chia tay vào thời gian nào. Lý do chia tay");
		countBreakUpDateTime(c);
	}

	private static void countDayOfWeek(Calendar c) {
		DateFormatSymbols symbols = new DateFormatSymbols(new Locale("vi"));
		String[] dayNames = symbols.getWeekdays();
		System.out.println(dayNames[c.get(Calendar.DAY_OF_WEEK)]);
	}

	private static void countLoveDateTime(Calendar c) {
		LocalDateTime start = LocalDateTime.of(c.get(Calendar.YEAR), (c.get(Calendar.MONTH) + 1),
				c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE));
		LocalDateTime end = LocalDateTime.now();

		LocalDate ldStart = start.toLocalDate();
		LocalDate ldEnd = end.toLocalDate();
		Period period;

		LocalTime ltStart = start.toLocalTime();
		LocalTime ltEnd = end.toLocalTime();
		Duration duration = null;

		LocalTime startDay = LocalTime.of(0, 0, 0);
		LocalTime endDay = LocalTime.of(23, 59, 59);

		if (ltStart.isBefore(ltEnd)) {
			duration = Duration.between(ltStart, ltEnd);
			period = Period.between(ldStart, ldEnd);

		} else {
			duration = Duration.between(ltStart, endDay);
			duration = duration.plus(Duration.between(startDay, ltEnd));
			duration = duration.plusSeconds(1);
			ldEnd = ldEnd.minusDays(1);
			period = Period.between(ldStart, ldEnd);
		}

		long durationSeconds = duration.getSeconds();
		long hours = TimeUnit.SECONDS.toHours(durationSeconds);
		long remainingMinutes = durationSeconds - TimeUnit.HOURS.toSeconds(hours);
		long minutes = TimeUnit.SECONDS.toMinutes(remainingMinutes);

		System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days "
				+ hours + " hours " + minutes + " minutes. ");

	}

	private static void countBreakUpDateTime(Calendar c) {
		Random rd = new Random();

		System.out.print("Mối tình sẽ chia tay vào ngày:");
		randomOneDay(c);
		String[] reason = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "x", "y", "z" };

		System.out.println("Lí do: " + reason[rd.nextInt(15)]);

	}

	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}

	private static void randomOneDay(Calendar c) {

		int year = random(c.get(Calendar.YEAR), c.get(Calendar.YEAR) + 50);
		int month = random(1, 12);
		int day = 0;

		switch (month) {
		case 2:
			if (isLeapYear(year)) {
				day = random(1, 29);
			} else {
				day = random(1, 28);
			}
			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = random(1, 31);
			break;

		default:
			day = random(1, 30);
			break;
		}

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		c.set(year, month, day);
		System.out.println(df.format(c.getTime()));

	}

	private static int random(int lowerBound, int upperBound) {
		return (lowerBound + (int) Math.round(Math.random() * (upperBound - lowerBound)));
	}

}