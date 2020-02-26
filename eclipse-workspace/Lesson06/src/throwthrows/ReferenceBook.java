package throwthrows;

public class ReferenceBook extends Book{

	private int tax;

	public ReferenceBook() {
	}

	public ReferenceBook(int id, String name, int tax) {
		super(id, name);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

}
