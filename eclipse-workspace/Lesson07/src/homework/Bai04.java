package homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Bai04 {

	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		Calendar c=Calendar.getInstance();
		Date date=new Date();
		timeInNewYork(c);
		System.out.println("Tháng hiện tại có : "+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy ");
		DateFormat df2=new SimpleDateFormat("HH:mm:ss a");
		System.out.println("Ngày cuối cùng của tháng hiện tại là : "+ df.format(date));
		c.add(c.DAY_OF_YEAR,7-c.get(Calendar.DAY_OF_WEEK) );
		System.out.println("Ngày cuối của tuần hiện tại : "+ df.format(c.getTime()));
		c.add(c.DAY_OF_YEAR,-6 );
		System.out.println("Ngày cuối của tuần hiện tại : "+ df.format(c.getTime()));
		String[] days= {"Chủ Nhật ","Thứ Hai ","Thứ Ba ","Thứ Tư ","Thứ Năm ","Thứ Sáu ","Thứ Bảy "};
		System.out.println("Ngày hôm nay là thứ : "+days[now.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println("Giờ hiện tại là : "+ df2.format(now.getTime()));
		now.add(Calendar.HOUR, 4);
		System.out.println("Thêm 4h :"+ df2.format(now.getTime()));
		LocalDate ldStart=LocalDate.of(2019, 2,21);
		LocalDate ldEnd=LocalDate.of(2019,5,9);
		if(ldStart.isBefore(ldEnd)) {
			Period p=Period.between(ldStart, ldEnd);
			System.out.println(p.getDays()+" "+ p.getMonths()+" "+ p.getYears());
		}
		System.out.print("Hôm nay là : Thứ "+days[now.get(Calendar.DAY_OF_WEEK)-1]+df.format(now.getTime()));
		now.add(Calendar.DAY_OF_YEAR, 14);
		System.out.println(" Sau 2 tuần : thứ "+days[now.get(Calendar.DAY_OF_WEEK)-1]+df.format(now.getTime()));
		System.out.println("Số tháng hiện tại trong năm : "+ (12-now.get(Calendar.MONTH)-1));
		LocalDate ldBirthday=LocalDate.of(1998,10,6);
		Period age=Period.between(ldBirthday, LocalDate.now());
		System.out.println("Tuổi của tôi : "+ age.getDays()+" "+ age.getMonths()+" "+ age.getYears());
	}
	public static void timeInNewYork(Calendar c) {
		TimeZone timeZone=TimeZone.getTimeZone("America/New_York");
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
		df.setTimeZone(timeZone);
		System.out.print("Thời gian hiện tại ở NewYork : ");
		System.out.println(df.format(c.getTime()));
		
	}
	

}
