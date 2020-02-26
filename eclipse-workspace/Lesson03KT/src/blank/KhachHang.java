package blank;

public class KhachHang {

	private String id;
	private String name;
	private int phone;
	private int blance;
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	public KhachHang(String id, String name, int phone, int blance) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.blance = blance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getBlance() {
		return blance;
	}
	public void setBlance(int blance) {
		this.blance = blance;
	}
	
}
