package formatutils;

import java.text.NumberFormat;

public class Ex04 {

	public static void main(String[] args) {
		NumberFormat nf=NumberFormat.getPercentInstance();
		System.out.println(nf.format(0.05));//chỉ chuyền từ 0.01<input must greater than 0,01>
	}
}
