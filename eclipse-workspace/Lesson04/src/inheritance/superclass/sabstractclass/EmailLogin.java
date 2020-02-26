package inheritance.superclass.sabstractclass;

public abstract class EmailLogin {

	//Mandatory (bắt buộc)
	protected abstract void login();
	//Madatory(bắt buộc)
	protected abstract void enciptPassword();
	//Optional
	protected void  loginWith2Steps() {
		System.out.println("It's up to browser !");
	}
}
