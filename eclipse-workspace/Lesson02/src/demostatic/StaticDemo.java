package demostatic;

public class StaticDemo {

	public static void main(String[] args) {
		VnmsCustomer leTeo=new VnmsCustomer("teo");
		VnmsCustomer leTrung=new VnmsCustomer("trung");
		VnmsCustomer leLoi=new VnmsCustomer("Loi");
		System.out.println(leLoi.getLanguage());
	}
}
