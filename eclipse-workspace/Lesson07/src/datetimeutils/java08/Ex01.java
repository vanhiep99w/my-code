package datetimeutils.java08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	//Complain : LocalDate(prtiod) - LocalTime - LocalDateTime

	public static void main(String[] args) {
		LocalDate lDate= LocalDate.of(2019, Month.AUGUST, 05);
		lDate=lDate.withDayOfMonth(22).plusDays(10);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatedValue=dtf.format(lDate);
		System.out.println(formatedValue);
		System.out.println("================");
		
		LocalDate ldNow=LocalDate.of(2019,Month.FEBRUARY,1);
		LocalDate ldDead=LocalDate.of(2019, Month.MARCH, 1);
		if(ldDead.isAfter(ldNow)) {
			Period p=Period.between(ldNow, ldDead);
			System.out.println(p.getDays()+" "+ p.getMonths()+" "+ p.getYears());
		}
		LocalTime lTime=LocalTime.now();
		System.out.println(lTime);
		//Duration p=Duration.be
	}
	
}
