package basic_array;

public class Ex03 {

	public static void main(String[] args) {
		//duyệt các phần tử trong mảng
		String[] flowers= {"Hồng","Lan","Đào"};
		for(int i=0;i<flowers.length;i++) {
			System.out.println(flowers[i]);
		}//for each
		System.out.println("================================");
		for(String flow:flowers) {
			System.out.println(flow);
		}
	}
}
