package homework;

import java.util.Calendar;

public class Bai01 {

	public static void main(String[] args) {
		getAllSundayInYear(2019);
		getLastSunday(2019);
	}
	
	public static void getAllSundayInYear(int year) {
		int i=1;	
		Calendar sundayInYear=Calendar.getInstance();
		Calendar endDayInYear =Calendar.getInstance();
		sundayInYear.set(year, 0, 1);
		endDayInYear.set(year+1, 0, 1);
		if(sundayInYear.get(Calendar.DAY_OF_WEEK)!=1) {
			int n=sundayInYear.get(Calendar.DAY_OF_WEEK);
			sundayInYear.add(Calendar.DAY_OF_MONTH, 8-n);
		}
	    while(sundayInYear.before(endDayInYear)) {
	    	System.out.println((i++)+" : "+ sundayInYear.get(Calendar.DAY_OF_MONTH)+ "/"+ (sundayInYear.get(Calendar.MONTH)+1));
	    	sundayInYear.add(Calendar.DAY_OF_MONTH, 7);
	    }
	}
	public static void getLastSunday(int year) {
		int i=1;
		Calendar endDayInYear =Calendar.getInstance();
		endDayInYear.set(year, 11, 31);
		if(Calendar.DAY_OF_WEEK!=1) {
			int n=endDayInYear.get(Calendar.DAY_OF_WEEK);
			endDayInYear.add(Calendar.DAY_OF_MONTH, -(n-1));
		}
		System.out.println((i++)+" : "+ endDayInYear.get(Calendar.DAY_OF_MONTH)+ "/"+ (endDayInYear.get(Calendar.MONTH)+1));
	}
}
