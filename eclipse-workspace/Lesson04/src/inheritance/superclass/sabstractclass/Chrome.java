package inheritance.superclass.sabstractclass;

public class Chrome extends EmailLogin{

	@Override
	protected void login() {
		System.out.println("chrome ======> login....");
	}

	@Override
	protected void enciptPassword() {
		System.out.println("chrome ======> encripting(Mã hóa)");
	}

	@Override
	protected void loginWith2Steps() {
		System.out.println("chrome ====> login with 2 steps");
	}
	
}
