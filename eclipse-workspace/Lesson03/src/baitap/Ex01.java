package baitap;

import java.util.Scanner;

public class Ex01 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Nhập vào thông tin đường tròn : ");
		System.out.print("Nhập vào hoàng độ tâm : ");
		int n=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập vào tung độ tâm : ");
		int m=Integer.parseInt(sc.nextLine());
		Point pCenter=new Point(n, m);
		System.out.print("Nhập vào bán kính đường tròn : ");
		int r=Integer.parseInt(sc.nextLine());
		Circle c=new Circle(pCenter, r);
		System.out.println("Nhập vào thông tin điểm cần kiểm tra : ");
		System.out.print("Nhập vào hoàng độ tâm : ");
		n=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập vào tung độ tâm : ");
		m=Integer.parseInt(sc.nextLine());
		Point pointA=new Point(n, m);
		System.out.println("Tâm đường tròn : "+ pCenter);
		System.out.println("Bán kính đường tròn :"+ r);
		System.out.println("Điểm cần xét : "+pointA);
		System.out.println(isPointBelongToCricle(pointA, c).value);
		
		
	}
	private static CricleString isPointBelongToCricle(Point a,Circle o) {
		
		double temp=Math.sqrt((a.getxPoint()-o.getPointCenter().getxPoint())*(a.getxPoint()-o.getPointCenter().getxPoint())+
				(a.getyPoint()-o.getPointCenter().getyPoint())*(a.getyPoint()-o.getPointCenter().getyPoint()));
		if(temp==o.getRadius()) {
			return CricleString.ONSIDE;
		}else if(temp<o.getRadius()) {
			return CricleString.INSIDE;
		}
		return CricleString.OUTSIDE;
	}

}
