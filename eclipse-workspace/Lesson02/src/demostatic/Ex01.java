package demostatic;

public class Ex01 {

	// Biến static được khởi tạo lúc chương trình được thực thi
	private static int Current_Year=2019;
	public static void main(String[] args) {

		
	}

	//Hàm biến : static thuộc phạm vi của class
	public static int getCurrentYear() {
		return Current_Year;
	}
	//Biến hàm static được khởi tạo trươc còn nonstatic khởi tạo khi được gọi
	// hàm biến : non static thuộc phạm vi của object
	//còn hàm nonstatic chỉ được khởi tạo khi có biến 
	//gọi đến nó
	public void showYourHobbies() {
		System.out.println("lol");
	}
	//Nêu là static có thể lấy class vầ object gọi
	//còn nonstatic chỉ có object gọi được
}
