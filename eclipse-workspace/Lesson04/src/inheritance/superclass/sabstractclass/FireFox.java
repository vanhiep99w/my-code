package inheritance.superclass.sabstractclass;

public class FireFox extends EmailLogin{

	@Override
	protected void login() {

		System.out.println("FireFox ======> login....");
	}

	@Override
	protected void enciptPassword() {

		System.out.println("FireFox =====> encipting....");
	}

	
}
