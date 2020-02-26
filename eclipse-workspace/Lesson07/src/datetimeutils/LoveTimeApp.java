package datetimeutils;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class LoveTimeApp {

	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2019, Calendar.AUGUST, 3, 21, 55, 0);
		Calendar end = Calendar.getInstance();

		long duration = end.getTimeInMillis() - start.getTimeInMillis();

		long days = TimeUnit.MILLISECONDS.toDays(duration);

		long remainingHours = duration - TimeUnit.DAYS.toMillis(days);
		long hour = TimeUnit.MILLISECONDS.toHours(remainingHours);

		long remainingMinutes = remainingHours - TimeUnit.HOURS.toMillis(hour);
		long minute = TimeUnit.MILLISECONDS.toMinutes(remainingMinutes);

		System.out.println(days + " " + hour + " " + minute);

	}
}
