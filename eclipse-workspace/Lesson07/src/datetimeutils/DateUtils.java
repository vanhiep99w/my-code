package datetimeutils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	    public static Date convertToDate(String sdate) throws ParseException {
	    	if(sdate.isEmpty()) {
	    		return null;
	    	}
			DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
			return df.parse(sdate);
		}
	    public static Calendar convertToCalendar(Date date) {
	    	if(date==null) {
	    		return null;
	    	}
	    	Calendar c=Calendar.getInstance();
	    	c.setTime(date);
	    	return c;
	    	
	    }
	    public static Date convertToCalender(Calendar c) {
	    	if(c==null) {
	    		return null;
	    	}
	    	return c.getTime();
	    }
}
