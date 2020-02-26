package datastructure;

public class Ex06 {
	public static void main(String[] args) {
		SoNguyen a = new SoNguyen(10);
		SoNguyen b = new SoNguyen(50);
		swap(a, b);
		System.out.println(a + "," + b);
	}

	private static void swap(SoNguyen a, SoNguyen b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
}

class SoNguyen {
	int value;

	// constructor
	public SoNguyen(int value) {
		this.value = value;
	}

	// khi in tu dong goi ham toString
	public String toString() {
		return value + "";
	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}

}
