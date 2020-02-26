package baitap;

public class Date {

	private int day;
	private int month;
	private int year;
	public Date() {
		// TODO Auto-generated constructor stub
	}
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public static boolean checkDate(int day,int month,int year) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 10:
		case 12:
			if(day==31) {
				return true;
			}
		case 2:
			if(year%400==0&month==29||year%400!=07&month==28) {
			    return true;
			}
		case 4:
		case 6:
		case 9:
		case 11:
			if(day==30) {
				return true;
			}
		default:
			return false;
		}
	}
	
	
}
