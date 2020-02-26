package homework;

import java.util.Calendar;
import java.util.Scanner;


public class LoveDays {
	
	private static Scanner ip = new Scanner(System.in);
	private static Calendar now = Calendar.getInstance();

	public static void main(String[] args) {
		Calendar start = inputTheStart();
		showLovedTime(start);
	}
	
	private static Calendar inputTheStart() {
		Calendar start = Calendar.getInstance();
		int date;
		int month;
		int year;
		do {
			System.out.println("Day entry: ");
			date = Integer.parseInt(ip.nextLine());
			month= Integer.parseInt(ip.nextLine());
			year= Integer.parseInt(ip.nextLine());
			try {
				isValidDay(date, month, year);
				start.set(Calendar.YEAR, year);
				start.set(Calendar.MONTH, month);
				start.set(Calendar.DAY_OF_MONTH, date);
				start.set(Calendar.HOUR, 0);
				start.set(Calendar.MINUTE, 0);
				start.set(Calendar.SECOND, 0);
				break;
			}
			catch (InvalidDate e) {
				System.out.println(e.getMessage());
			}
			
		}
		while(true);
		
		return start;
	}

	private static boolean isValidDay(int date, int month, int year) throws InvalidDate {
		if (date > 31 || date < 0) {
			throw new InvalidDate("Invalid date! Please re-enter the date:");
		}
		if (year > now.get(Calendar.YEAR) || year < 0) {
			throw new InvalidDate("Invalid date! Please re-enter the date:");
		}
		if (month > 12 || month < 1) {
			throw new InvalidDate("Invalid date! Please re-enter the date:");
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
			throw new InvalidDate("Invalid date! Please re-enter the date:");
		} else if (year % 400 == 0 && month == 2 && date > 29) {
			throw new InvalidDate("Invalid date! Please re-enter the date:");
		} else if (year % 100 != 0 && year % 4 == 0 && month == 2 && date > 29) {
			throw new InvalidDate("Invalid date! Please re-enter the date:");
		} else if (((year % 400 != 0 || year % 100 != 0) && year % 4 != 0) && month == 2 && date > 28) {
			throw new InvalidDate("Invalid date! Please re-enter the date:");
		}
		return true;
	}
	private static void showLovedTime(Calendar start){
		long time = now.getTimeInMillis()- start.getTimeInMillis();
		long day = time/86400000;
		long hour = (time-day*86400000)/3600000;
		long minute = (time-day*86400000-hour*3600000)/60000;
		long second = (time-day*86400000-hour*3600000- minute*60000)/1000;
		System.out.println("So, they have fallen in love for " + day + " days," +hour+ " hours, "+minute+" minutes, "+second+" seconds.");
	}

}