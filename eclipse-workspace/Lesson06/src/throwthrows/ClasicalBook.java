package throwthrows;

public class ClasicalBook extends Book{

private boolean status;
	
	public ClasicalBook() {
		// TODO Auto-generated constructor stub
	}
	
	public ClasicalBook(int id, String name, boolean status) {
		super(id, name);
		this.setStatus(status);
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
