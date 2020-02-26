package homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TheUltilmateRelationshipCalculator {

	public static void main(String[] args) {
		Random rd = new Random();
		Calendar startLoveDay = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		Calendar endDayLove = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String yourName,yourLoveName;
		System.out.print("Nhập vào tên bạn Nam :");
		yourName=sc.nextLine(); 
		System.out.print("Nhập vào tên bạn Nữ :"); 
        yourLoveName=sc.nextLine();
		
		do {
			try {
				System.out.println("Nhập vào giờ ngày tháng yêu nhau(Ngày/Tháng/Năm giờ:phút:giây) : ");
				startLoveDay.setTime(df.parse(sc.nextLine()));
				break;
			} catch (ParseException e) {
				System.out.println("Sai định dạng ngày tháng . Nhập lại !");
			}
		} while (true);
		LocalDateTime lcdtStarLove = LocalDateTime.of(startLoveDay.get(Calendar.YEAR),
				startLoveDay.get(Calendar.MONTH) + 1, startLoveDay.get(Calendar.DAY_OF_MONTH),
				startLoveDay.get(Calendar.HOUR), startLoveDay.get(Calendar.MINUTE));
		LocalDateTime lcdtNow = LocalDateTime.now();
		if (lcdtNow.isAfter(lcdtStarLove)) {
			Duration d = Duration.between(lcdtStarLove, lcdtNow);
			long day = d.toDays();
			long hour = d.toHours() - 24 * day;
			long minute = d.toMinutes() - hour * 60 - day * 60 * 24;
			System.out.println("hai bạn yêu nhau được : " + day + " ngày " + hour + " giờ " + minute + " Phút");
		} else
			System.out.println("2 bạn yêu nhau được 0 ngày");
		if (lcdtNow.isAfter(lcdtStarLove)) {
			int rdTimeMinute = rd.nextInt(2000000);// max là 4 năm
			int day = rdTimeMinute / 60 / 24;
			int hour = (rdTimeMinute - day * 24 * 60) / 60;
			int minute = (rdTimeMinute - hour * 60 - day * 60 * 24);
			System.out.println("hai bạn yêu nhau Thêm được : " + day + " ngày " + hour + " giờ " + minute + " Phút");
			endDayLove.add(Calendar.MINUTE, minute);
			endDayLove.add(Calendar.HOUR, hour);
			endDayLove.add(Calendar.DAY_OF_YEAR, day);
			System.out.println("Ngày : " + df.format(endDayLove.getTime()) + " 2 bạn chia tay");
		} 

	}

}
