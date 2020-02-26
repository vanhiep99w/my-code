package controlling;

import java.util.Calendar;

public class Ex05 {

	public static void main(String[] args) {
		int dayInMonth=getDayInMonth(10);
		System.out.println(dayInMonth );
		//Thư viện Calendar
		Calendar cal=Calendar.getInstance();//Lấy ngày giờ hiện tại
		
		cal.set(cal.MONTH, 1);//thay đổi tháng trong biến cal đã tạo
		System.out.println("số ngày trong tháng đã chọn "+ cal.getActualMaximum(cal.DAY_OF_MONTH));

	}
	private static int getDayInMonth(int month) {
		
		int dayInMonth=0;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayInMonth=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dayInMonth=30;
			break;
		case 2:
			dayInMonth=28;
			break;
		default:
			dayInMonth=0;
			break;
		}
		return dayInMonth;
	}

}
