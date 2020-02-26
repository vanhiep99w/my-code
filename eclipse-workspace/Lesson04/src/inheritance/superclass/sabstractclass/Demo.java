package inheritance.superclass.sabstractclass;

public class Demo {

	public static void main(String[] args) {
		EmailLogin chromeEmailLogin=new Chrome();
		chromeEmailLogin.loginWith2Steps();
		
		EmailLogin fireFoxEmailLogin=new FireFox();
		fireFoxEmailLogin.loginWith2Steps();
	}
}
  