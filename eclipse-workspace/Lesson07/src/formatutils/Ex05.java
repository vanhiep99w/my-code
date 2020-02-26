package formatutils;

import java.text.NumberFormat;

public class Ex05 {

	public static void main(String[] args) {
		// kết quả phải làm tròn hai chữ số thập phân
		float bill=145000.55669053353f;
		
		NumberFormat nf=NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(7);
		String fmtedBill=nf.format(bill);
		System.out.println(fmtedBill);
		//nf.pa
	}
}
