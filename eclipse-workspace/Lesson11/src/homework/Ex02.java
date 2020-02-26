package homework;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<Bill> bills=new ArrayList<Bill>();
		bills.add(new BillByDay("Trần bá Hiệp","10","29/2/2019","108",1000,1));
		bills.add(new BillByHour("Trần bá Hiệp1","11","29/2/2019","108",1000,22));
		bills.add(new BillByDay("Trần bá Hiệp2","12","29/2/2019","108",1000,40));
		bills.add(new BillByHour("Trần bá Hiệp3","13","29/2/2019","108",1000,5));
		bills.add(new BillByDay("Trần bá Hiệp4","14","29/2/2019","108",1000,16));
		bills.add(new BillByHour("Trần bá Hiệp5","15","29/9/2019","108",1000,37));
		bills.add(new BillByDay("Trần bá Hiệp6","16","29/2/2019","108",1000,8));
		bills.add(new BillByHour("Trần bá Hiệp7","17","29/9/2019","108",1000,69));
		show(bills);
		sumRenter(bills);
		
		for (Bill bill : bills) {
			if(bill.getIdBill().equals(10)) {
				bills.remove(bill);
			}
		}
		System.out.println("========");
		show(bills);
		
		//Tính trung bình thành tiền
		System.out.println("========");
         float result=tinhTrungBinh(bills);
		System.out.println("Trung bình tiền : "+ result);
		
	}
	public static void show(List<Bill> bills) {
		bills.forEach(bill->System.out.println(bill));
	}
	public static void sumRenter(List<Bill>bills) {
		List<Bill> billByDays=new ArrayList<Bill>();
		List<Bill>billByHours=new ArrayList<Bill>();
		for (Bill bill : bills) {
			if(bill instanceof BillByDay) {
				billByDays.add(bill);
				continue;
			}
			billByHours.add(bill);
		}
		System.out.println("Bill giờ :(số lượng : "+billByHours.size() +")");
		show(billByHours);
		System.out.println("========");
		System.out.println("Bill ngày :(số lượng :"+billByDays.size() +")");
		show(billByDays);
	}
	public static float tinhTrungBinh(List<Bill>bills) {
		int result=bills.stream().filter(t->t.getDay().matches("^\\d{1,2}/9/2019")).mapToInt(Bill::pay).sum();
		return result/bills.size();
	}
	

}
