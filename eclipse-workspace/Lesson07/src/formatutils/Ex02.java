package formatutils;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex02 {

	public static void main(String[] args) {
		float input=123456f;
		NumberFormat nf=NumberFormat.getNumberInstance();
		String fmtedNumber = nf.format(input);
		System.out.println(fmtedNumber);
		Locale[] locales=Locale.getAvailableLocales();
		for(Locale locale: locales) {
			
			System.out.println(getCurrencyUnit(locale, 100000000));
			System.out.println(locale.getDisplayCountry());
			
		}
	
		
	}
	private static String getCurrencyUnit(Locale locale,long money) {
		NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
		return nf.format(money);
	}
	private static void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
