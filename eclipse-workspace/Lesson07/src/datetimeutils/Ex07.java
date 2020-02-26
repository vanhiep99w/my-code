package datetimeutils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex07 {

	public static void main(String[] args) {
		//THời gian hiện tại ở pháp
		Calendar c=Calendar.getInstance();
		TimeZone timeZone=TimeZone.getTimeZone("Europe/berlin");
		
	
		/*for(String s: TimeZone) {
			System.out.println(s);
		}*/
		
		DateFormat df=new SimpleDateFormat("hh:mm:ss a");
		
		df.setTimeZone(timeZone);
		
		
		System.out.println("====================");
		
		System.out.println(timeZone);
		
		System.out.println(df.format(c.getTime()));
		LocalTime lt=LocalTime.of(15, 16, 25);
		LocalTime lt2=LocalTime.of(19,14,23);
		Duration d=Duration.between(lt, lt2);
		System.out.println();
	}
}
