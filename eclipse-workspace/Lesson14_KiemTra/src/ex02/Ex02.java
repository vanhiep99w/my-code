package ex02;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int age;
		int sleepedHour,sleepedMinute;
		int sleepStartHour,sleepStartMinute;
		Duration temp=null;
		LocalTime startTime=null,sleepedTime,resultTime=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập vào tuổi hiện tại của bạn :");
		age=Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập vào thời gian đã ngủ trong ngày : ");
		System.out.print("Giờ : ");
		sleepedHour=Integer.parseInt(scanner.nextLine());
		System.out.print("Phút : ");
		sleepedMinute=Integer.parseInt(scanner.nextLine());
		sleepedTime=LocalTime.of(sleepedHour, sleepedMinute);
		System.out.println("Nhập vào thời gian bắt đầu ngủ : ");
		System.out.print("Giờ : ");
		sleepStartHour=Integer.parseInt(scanner.nextLine());
		System.out.print("Phút : ");
		sleepStartMinute=Integer.parseInt(scanner.nextLine());
		startTime=LocalTime.of(sleepStartHour, sleepStartMinute);
		System.out.println(startTime);
		GoodSleep[] goodSleeps=GoodSleep.values();
		for (GoodSleep goodSleep : goodSleeps) {
			if (age<goodSleep.getEnd()&&age>goodSleep.getStart()) {
				LocalTime t=LocalTime.of(goodSleep.getTimeOfGoodSleep(), 0);
				temp=Duration.between(sleepedTime, t);
				break;
			}
		}
		
		startTime=startTime.plusHours(temp.toHours());
		startTime=startTime.plusMinutes(temp.toMinutes()-temp.toHours()*60);
		System.out.println(startTime);
	}
}
