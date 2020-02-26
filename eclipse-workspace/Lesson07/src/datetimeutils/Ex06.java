package datetimeutils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Date date=null;
		/* String sdate=converToString(date); System.out.println(converToString(date));
		  * System.out.println("==================");
		 */
		Scanner ip=new Scanner(System.in);
		System.out.println("THông tin : ");
		String sdate=ip.nextLine();
		do {
			try {
				date=DateUtils.convertToDate(sdate);
				break;
			} catch (ParseException e) {
				System.out.println("Invalid date format");
			}
		} while (true);
		System.out.println(date);
		Calendar c=DateUtils.convertToCalendar(date);
		System.out.println("Today is" + c.get(Calendar.DAY_OF_WEEK));
	}
	
	
	
   
}
