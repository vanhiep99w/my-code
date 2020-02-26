package polimorphism.method;

public class Ex01 {

	public static void main(String[] args) {
		// Demo tích chất :đa  hình trong phương thức 
		//Overloading
		int first=10;
		int second=20;
		int third=30;
		sum(first,second);
	}
	/**
	 * 
	 * Các Hàm được gọi là overloading
	 * + Cùng tên
	 * + Thuộc cùng class
	 * + Cùng dữ liệu trả về
	 * 
	 * +Khác :
	 *       + khác số lượng tham số truyền vào
	 *       hoặc KDL truyền vào của các  tham số khác nhau
	 */
	
	private static int sum(int first,int second) {
		return first*second;
	}
	private static int sum(int first,int second,int third) {
		return first*second*third;
	}
	private static int sum(float first) {
		return 1;
	}
}
