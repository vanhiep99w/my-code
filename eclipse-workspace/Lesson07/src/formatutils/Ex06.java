package formatutils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;



public class Ex06 {

	//Sử dụng decimal format
	public static void main(String[] args) {
		//Định dạng seperator "Phân cách"
		double number=42124.45d;
		//pattern : , trước dấu phẩy là phần nguyên 
		         //  . sau dấu chấm là phần thập phân
		DecimalFormatSymbols symbol=new DecimalFormatSymbols();
		symbol.setGroupingSeparator('-');
		symbol.setDecimalSeparator('+');
		
		DecimalFormat dcf=new DecimalFormat("#,####.##",symbol);
		String fmtedNumber=dcf.format(number);
		System.out.println(fmtedNumber);
	}
}
