package datetimeutils;

import java.text.ParseException;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DateFormatter;

//import beentogether.DateException;

public class SuperUltimateRelationshipCalculator {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập vào tên của bạn nam : ");
		String male = ip.nextLine();
		System.out.println("Nhập vào tên bạn nữ: ");
		String feMale = ip.nextLine();
		Calendar start = Calendar.getInstance();
		int year = 0, month = 0, day = 0, hour = 0, minute = 0, sec = 0;
		LocalDate lDstart;
		LocalDate lDNow = LocalDate.now();

		LocalTime lTstart;
		LocalTime lTnow = LocalTime.now();

		System.out.println("Nhập vào ngày tháng hai bạn quen nhau. ");
		do {
			do {
				do {

					try {
						System.out.println("Ngày:  ");
						day = Integer.parseInt(ip.nextLine());
						System.out.println("Tháng:  ");
						month = Integer.parseInt(ip.nextLine());
						System.out.println("Năm:  ");
						year = Integer.parseInt(ip.nextLine());

						break;
					}

					catch (NumberFormatException e) {
						System.out.println("Nhập sai, mời nhập lại !.");
					}

				} while (true);
				try {
					lDstart = LocalDate.of(year, month, day);
					break;

				} catch (DateTimeException e) {
					System.out.println("Nhập ngày tháng hợp lệ.");
				}
			} while (true);
		} while (lDstart.isAfter((lDNow)));
		do {
			do {
				do {
					try {
						System.out.println("Giờ:  ");
						hour = Integer.parseInt(ip.nextLine());
						System.out.println("Phút:  ");
						minute = Integer.parseInt(ip.nextLine());
						System.out.println("Giây:  ");
						sec = Integer.parseInt(ip.nextLine());

						break;
						
					} catch (NumberFormatException e) {
						System.out.println("Nhập sai, mời nhập lại !.");
					}

				} while (true);
				try {
					lTstart = LocalTime.of(hour, minute, sec);
					break;
				} catch (DateTimeException e) {
					System.out.println("Nhập ngày giờ hợp lệ ! ! ! ");

				}

			} while (true);
		} while (lDstart.equals(lDNow) && lTstart.isAfter(lTnow));
		System.out.println(lTstart);
		// LocalDate lDNow= LocalDate.of(2019 ,Month.JANUARY, 5);
		// LocalTime lTnow = LocalTime.of(10, 18, 20);
		int yearRes, monthRes, dayRes;

		Duration duration = Duration.between(lTstart, lTnow);
		Duration timeRes;
		Period period;
		LocalTime endDay = LocalTime.of(23, 59, 59);
		LocalTime beginDay = LocalTime.of(0, 0, 0);
		if (lTnow.isBefore(lTstart)) {
			// System.out.println("A");
			timeRes = Duration.between(lTstart, endDay);
			// System.out.println(timeRes);
			timeRes = timeRes.plus(Duration.between(beginDay, lTnow));
			timeRes = timeRes.plusSeconds(1);
			lDNow = lDNow.minusDays(1);
			period = Period.between(lDstart, lDNow);

		} else {
			period = Period.between(lDstart, lDNow);
			timeRes = duration;
		}

		yearRes = period.getYears();
		monthRes = period.getMonths();
		long hourRes;
		long minRes, secRes;
		hourRes = TimeUnit.SECONDS.toHours(timeRes.getSeconds());
		long hourRemain = timeRes.getSeconds() - TimeUnit.HOURS.toSeconds(hourRes);
		minRes = TimeUnit.SECONDS.toMinutes(hourRemain);
		long minRemain = hourRemain - TimeUnit.MINUTES.toSeconds(minRes);
		secRes = minRemain;

		String[] daysInWeek = { "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy" };
		System.out.print("Ngày hẹn hò của hai bạn là vào : ");
		DayOfWeek temp = lDstart.getDayOfWeek();
		switch (temp) {
		case MONDAY:
			System.out.println("Thứ Hai ");
			break;
		case TUESDAY:
			System.out.println("Thứ Ba ");
			break;
		case WEDNESDAY:
			System.out.println("Thứ Tư ");
			break;
		case THURSDAY:
			System.out.println("Thứ Năm ");
			break;
		case FRIDAY:
			System.out.println("Thứ Sáu ");
			break;
		case SATURDAY:
			System.out.println("Thứ Bảy ");
			break;
		case SUNDAY:
			System.out.println("Chủ Nhật ");
			break;

		default:
			break;
		}

		System.out.print(male + " ♥ " + feMale + " được : ");
		System.out.println(period.getYears() + " Year(s) " + period.getMonths() + " Month(s) " + period.getDays()
				+ " Day(s) " + " , " + hourRes + " giờ " + minRes + " phút " + secRes + " giây.");
		Random rd = new Random();

		int dice = rd.nextInt(3);
		int breakUp;
		if (dice == 1) {
			breakUp = 1000 + rd.nextInt(9000);
		} else {
			breakUp = rd.nextInt(600);
		}

		int dayBreakUp, yearBreakUp, monthBreakup;
		Calendar checkPoint = Calendar.getInstance();
		checkPoint.add(Calendar.DAY_OF_YEAR, breakUp);
		System.out.print("Hai bạn sẽ chia tay sau " + breakUp + " ngày, vào ");
		System.out.println(" ngày " + checkPoint.get(Calendar.DAY_OF_MONTH) + " Tháng "
				+ (checkPoint.get(Calendar.MONTH) + 1) + " Năm " + checkPoint.get(Calendar.YEAR));
		String[] reason = { " Hôi nách. ", " Thối Mồm.", " Ngoại tình.", "Chán yêu.", "Bede nhập.", "Phá sản.",
				"Cãi cọ.", "Ham chơi game.", "Không hiểu nhau.", "Bố mẹ cấm.", "Anh còn sự nghiệp",
				"Em quay lại với người cũ rồi", "Không muốn yêu xa" };
		System.out.println("Lí do là vì " + reason[rd.nextInt(12)]);

	}
}