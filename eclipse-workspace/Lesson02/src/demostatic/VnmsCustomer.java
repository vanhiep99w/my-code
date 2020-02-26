package demostatic;

public class VnmsCustomer {

	private static String language ="VietNamese";
	private String fullName;
	
	public VnmsCustomer() {
		// TODO Auto-generated constructor stub
	}

	public String getLanguage() {
		return language;
	}

	public VnmsCustomer( String fullName) {
	
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
