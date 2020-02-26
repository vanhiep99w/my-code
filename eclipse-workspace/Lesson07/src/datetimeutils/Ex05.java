package datetimeutils;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex05 {

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();
		//Date date=new Date(c.getTimeInMillis());
		 //Date date=c.getTime();
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		String dmySlash=df.format(c.getTime());
		System.out.println(dmySlash);
	}
}
