package review;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex04 {
	public static void main(String[] args) {
		timeInNewYork();
		dayInNowMonth();
		printLastDayInMonth();
		printFirstDayAndEndDayInWeek();
		ageOfMe();

	}

	private static void timeInNewYork() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		TimeZone NewYorkTime = TimeZone.getTimeZone("US/Eastern");
		df.setTimeZone(NewYorkTime);
		Calendar c = Calendar.getInstance(NewYorkTime);
		Date date = c.getTime();
		String sdate = df.format(date);
		System.out.println("Ngày giờ phút giây tại NewYork là : " + sdate);
	}

	private static void dayInNowMonth() {
		Calendar c = Calendar.getInstance();
		System.out.println(
				"Tháng " + (c.get(Calendar.MONTH) + 1) + " có " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " ngày");
	}

	private static void printLastDayInMonth() {
		Calendar c = Calendar.getInstance();
		int lastDayInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DATE, lastDayInMonth);
		System.out.println("Ngày cuối cùng của tháng hiện tại là : " + lastDayInMonth);
	}

	private static void printFirstDayAndEndDayInWeek() {
		Calendar firstDay = Calendar.getInstance();
		Calendar endDay = Calendar.getInstance();
		firstDay.set(Calendar.DAY_OF_WEEK, 1);
		endDay.set(Calendar.DAY_OF_WEEK, 7);
		int month = firstDay.get(Calendar.MONTH);
		int year = firstDay.get(Calendar.YEAR);
		System.out.println(
				"Ngày đầu tiên của tuần hiện tại là : " + firstDay.get(Calendar.DATE) + "/" + month + "/" + year);
		System.out.println(
				"Ngày cuối cùng của tháng hiện tại là : " + endDay.get(Calendar.DATE) + "/" + month + "/" + year);
	}

	private static void ageOfMe() {
		LocalDate ldBorn = LocalDate.of(2000, Month.JULY, 22);
		LocalDate ldNow = LocalDate.now();
		if (ldBorn.isBefore(ldNow)) {
			Period period = Period.between(ldBorn, ldNow);
			System.out.println("Tuổi của bạn : " + period.getYears() + "years" + period.getMonths() + "month "
					+ period.getDays() + "day");

		}

	}
}