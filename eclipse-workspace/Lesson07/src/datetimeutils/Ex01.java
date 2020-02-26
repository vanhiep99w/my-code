package datetimeutils;

import java.util.Calendar;

public class Ex01 {

	public static void main(String[] args) {
		// 
		Calendar c=Calendar.getInstance();
		//c.set(1998,0, 6);
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"-"+c.get(Calendar.MONTH)+ "-"+c.get(Calendar.YEAR)+"-"+
		c.get(Calendar.HOUR)+"-"+c.get(Calendar.MINUTE)+"-"+c.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("====================");
		//số ngày trong tháng
		System.out.println(c.getActualMaximum(Calendar.MONTH));
		//sun mon tue wed thu fri sat
		String[] dayOfWeek= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		System.out.println(c.get(Calendar.DAY_OF_WEEK)+":"+dayOfWeek[c.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println(c.getFirstDayOfWeek());
		//Calendar.SUNDAY;
	}
}
