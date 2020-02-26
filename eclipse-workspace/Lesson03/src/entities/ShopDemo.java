package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ShopDemo {

	public static void main(String[] args) {
		//Khởi tạo mặt hàng 
		Phone lgG3=new Phone("lgG3-123","androi","black",700);
		Phone ssS7=new Phone("ssS7","androi","black",400);
		Phone ipXs=new Phone("ipXS-123","ios","black",100);
		Phone ip8p=new Phone("ip8-123","ios","red",200);
		
		// khởi tạo khách hàng 
		Customer lena=new Customer("lena","156464654","000","Quận 1 "); // 01
		Customer hoangTeo=new Customer("Hoangteo","156412354","111","Quận 2 "); // 02
		
		lena = hoangTeo; // 02
		// 01: garabage
		
		//THực hiện mua hàng 
		// lena mua 2 cái lgg3 và s7
		//hoàng tèo mua dt ipxs
		
		// Danh sách sản phẩm của khách hàng mua
		
		Phone[] lenaPhone= {lgG3,ssS7};
		lena.setPhones(lenaPhone);
		System.out.println(money(lenaPhone));
		
	}
	private void exportBill(Customer customer) {
		System.out.println("=======THông tin khách hàng======");
		System.out.println(customer.getName()+","+customer.getAddress());
		System.out.println("==========Mua hàng");
		Phone[] phones=customer.getPhones();
		for(int i=0;i<phones.length;i++) {
			Phone phone=phones[i];
			System.out.println(phone.getPid()+","+phone.getOs()+","+phone.getCost());
		}
		System.out.println("Tổng tiền "+ money(phones));
	}
	private static int money(Phone[] phones) {
		int money=0;
		String date="20/11";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		String currentDate =sdf.format(Calendar.getInstance().getTime());
		for(int i=0;i<phones.length;i++) {
			Phone phone=phones[i];
			int cost=phone.getCost();
			if(cost>=590 && currentDate.equals(date)) {
				cost=cost*90/100;
			}
			money+=cost;
		}
		return money;
	}
}
