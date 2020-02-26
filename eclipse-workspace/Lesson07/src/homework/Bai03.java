package homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {
		Date date ;
		Scanner sc=new Scanner(System.in);
		DateFormat dfDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		do {
			try {
				date=dfDateFormat.parse(sc.nextLine());
				break;
			} catch (ParseException e) {
				System.out.println("Nhập sai định dạng ngày");
				e.printStackTrace();
			}
		}while(true);
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		int day=c.get(Calendar.DAY_OF_YEAR);
		int leftDays=c.getActualMaximum(Calendar.DAY_OF_YEAR)-day;
		System.out.println("It is day number "+day+" of the year, "+leftDays+ "  days left");
		infoDay(c);
		System.out.println("Year "+ c.get(Calendar.YEAR)+ " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR)+ " days");
		System.out.println( ("Month "+(c.get(Calendar.MONTH)+1)+ " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH)+ " days"));
		
	}
	public static boolean isLeapYear(int year) {
		boolean b=false;
		GregorianCalendar gr=new GregorianCalendar();
		if(gr.isLeapYear(year)) {
			b=true;
		}
		return b;
	}
	public static void infoDay(Calendar c) {
		int temp1=1; // đếm số các thứ trong năm	
		int temp2=0; // lưu vị trí thứ trong năm
		int temp3=0; // đếm số thứ trong tháng
		int temp4=0; // lưu vị trí thứ trong tháng
		String[] days= {"Sunday ","Monday ","Tuesday ","Wedday ","Thursday","Friday","Saturday "};
		Calendar dayInYear=Calendar.getInstance();
		Calendar endDayInYear =Calendar.getInstance();
		dayInYear.set(c.get(Calendar.YEAR), 0, 1);
		endDayInYear.set(c.get(Calendar.YEAR)+1, 0, 1);
		int a=c.get(Calendar.DAY_OF_WEEK);
		int b=dayInYear.get(Calendar.DAY_OF_WEEK);
		if(b<a) {
			dayInYear.add(Calendar.DAY_OF_MONTH, a-b);
		}if(b>a) {
			dayInYear.add(Calendar.DAY_OF_MONTH, a+7-b);
		}
	    while(dayInYear.before(endDayInYear)) {
	    	
	    	if(dayInYear.get(Calendar.MONTH)==c.get(Calendar.MONTH)) {
	    		temp3++;
	    	}if(dayInYear.get(Calendar.DAY_OF_YEAR)==c.get(Calendar.DAY_OF_YEAR)) {
	    		temp2=temp1;
	    		temp4=temp3;
	    	}
	    	dayInYear.add(Calendar.DAY_OF_MONTH, 7);
	    	temp1++;
	    }
	    
	    System.out.println("It is "+ days[c.get(Calendar.DAY_OF_WEEK)-1]+" Number "+ temp2+ 
	    	" out of "+temp1+ " in "+ c.get(Calendar.YEAR)	);
	    System.out.println("It is "+ days[c.get(Calendar.DAY_OF_WEEK)-1]+" Number "+ temp4+ 
		    	" out of "+temp3+ " in "+(c.get(Calendar.MONTH)+1)+"/"+ c.get(Calendar.YEAR)	);
	}
	
	
}
