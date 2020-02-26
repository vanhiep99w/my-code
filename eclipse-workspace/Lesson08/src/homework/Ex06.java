package homework;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	 
		// nghỉ 30s r em chỉ nghĩ được sử dụng charat(100) cho nhanh thôi a !
		//===================================================================
		// coi như từ 1 đến 9 cũng có 2 chiếm 2 ô như từ 10 đến 99 thì ta có 99*2 ô
		// tím ô thứ 100 thì chỉ cần lấy (100+9)/2+1=55,5;
		// nếu tròn lấy số hàng chục nếu không tròn lấy số hàng đơn vị
		// kết quả số 5 (Hàng đơn vị)
		String test="";
		for(int i=1;i<100;i++) {
			test+=i;
		}
		System.out.println(test.charAt(100));
		
		
	}
	
}
