package entities;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("Dien tich : "+calSquare(10,5));
		System.out.println("Dien tich : "+calSquare(11,6));
		
		//trong một nhà kho có 100 thùng hàng ,
		//mỗi thùng hàng có kích thước dài rộng khác nhau tính diện tích 100 thùng hàng.
		//in ra thông tin diện tích thùng hàng thứ 32
		IteamBox redBox= new IteamBox();
		redBox.setName("nam");
		System.out.println(redBox.getName());
	}
	private static int calSquare(int a,int b) {
		return a*b;
	}
}
