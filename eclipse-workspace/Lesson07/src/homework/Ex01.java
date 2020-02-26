package homework;

import java.util.Calendar;

public class Ex01 {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.print("Năm nay là : "+ c.get(Calendar.YEAR));
		boolean b=isLeapYear(c);
		if(b) System.out.println(" là Năm nhuận");
		else System.out.println(" Không là năm nhuận");
		System.out.println("Số ngày trong tháng "+c.get(Calendar.MONTH)+ " : "+ maximumDayInMonth(c));
		System.out.println("Hôm nay là thứ : "+ dayOfWeek(c));
		System.out.println("Số ngày chủ nhật trong tháng : " + sundayInTheMonth(c));
		infoDay(c);
		infoDay2(c);
		
	}
	public static boolean isLeapYear(Calendar c) {
		boolean b=false;
		if(c.get(Calendar.YEAR)%400==0 || c.get(Calendar.YEAR)%4==0&& c.get(Calendar.YEAR)%100!=0) {
			b=true;
		}
		//Hoặc sử dụng GregorianCalendar.isLeapYear (Một calendar dương lịch)
		return b;
	}
	public static int maximumDayInMonth(Calendar c) {
		return c.getActualMaximum(Calendar.DAY_OF_MONTH);
		// c.getMaximun chỉ chả về 31
	}
	public static String dayOfWeek(Calendar c) {
		//c.set(Calendar.DAY_OF_WEEK, 1);
		String[] days= {"Chủ Nhật ","Thứ Hai ","Thứ Ba ","Thứ Tư ","Thứ Năm ","Thứ Sáu ","Thứ Bảy "};
		return days[c.get(Calendar.DAY_OF_WEEK)-1];
	}
	public static int sundayInTheMonth(Calendar c) {
		int i=4;
		c.set(Calendar.DAY_OF_MONTH, 1);
		if(c.get(Calendar.DAY_OF_WEEK)==1
				||c.get(Calendar.DAY_OF_WEEK)==1 && c.getActualMaximum(Calendar.DAY_OF_MONTH)==29
				||c.get(Calendar.DAY_OF_WEEK)==1 && c.get(Calendar.DAY_OF_WEEK)==7 && c.getActualMaximum(Calendar.DAY_OF_MONTH)==30
				||c.get(Calendar.DAY_OF_WEEK)==1 && c.get(Calendar.DAY_OF_WEEK)>=6&& c.getActualMaximum(Calendar.DAY_OF_MONTH)==31) {
			i++;
		}
		return i;
	}
	public static void infoDay(Calendar c) {
		int month=c.get(Calendar.MONTH)+1;
		do {
			System.out.println(c.get(Calendar.DAY_OF_MONTH)+"/"+ month+ " Thứ : "+ dayOfWeek(c) );
			c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH)+1);
		}while(c.get(Calendar.DAY_OF_MONTH)!=1);
			// sử dụng before after
		/*
		 * Calendar from=Calendar.getInstance(); from.set(2019, 7, 15); Calendar
		 * to=Calendar.getInstance(); to.set(2019, 8, 15); to.add(Calendar.DAY_OF_MONTH,
		 * 1); while(from.before(to)) { int day=from.get(Calendar.DAY_OF_MONTH); int
		 * month2=from.get(Calendar.MONTH)+1; int year=from.get(Calendar.YEAR);
		 * System.out.println(day+ " " +month2+" "+ year);
		 * from.add(Calendar.DAY_OF_MONTH, 1); }
		 */
		System.out.println("=============");
	
	}
	public static void infoDay2(Calendar c) {
		int month=c.get(Calendar.MONTH)+1;
		c.setFirstDayOfWeek(month);
		System.out.println(c.getFirstDayOfWeek());
		do {
			System.out.println(c.get(Calendar.DAY_OF_MONTH)+"/"+ month+ " Thứ : "+ dayOfWeek(c) );
			c.set(Calendar.DAY_OF_WEEK, c.get(Calendar.DAY_OF_MONTH)+1);
		}while(c.get(Calendar.DAY_OF_WEEK)!=c.getFirstDayOfWeek());
	}
}
