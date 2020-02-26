package baitap;

public class EmailException {

	String stringEmail;
	public EmailException() {
		// TODO Auto-generated constructor stub
	}
	public EmailException(String stringEmail) {
		this.stringEmail = stringEmail;
	}
	
	public String getStringEmail() {
		return stringEmail;
	}
	public void setStringEmail(String stringEmail) {
		this.stringEmail = stringEmail;
	}
	public boolean isCorrectEmail() {
		boolean b=false;
		if(stringEmail.matches("[\\w]{1,15}@gmail.com[\\.]?[a-z]{0,5}")) {
			b=true;
		}
		return b;
	}
	
	
}
