package formatutils;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale locale: locales) {
			System.out.println("==>" + locale.getLanguage() + "_" + locale.getCountry());
		}
		
		Locale vietNam = new Locale("vi", "VN");
		System.out.println("===================");
		float number = 123456.656f;
		// singleton pattern
		NumberFormat nf = NumberFormat.getCurrencyInstance(vietNam);// format money
		// nếu muốn format number thì dùng getInstace hoặc getNumberInstance
		String formatedNumber = nf.format(number);
		System.out.println("formatedNumber: " + formatedNumber);
	}
}
