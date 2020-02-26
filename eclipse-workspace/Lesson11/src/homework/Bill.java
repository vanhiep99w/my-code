package homework;

public  class Bill {

	private String nameCustomer;
	private String idBill;
	private String day;
	private String idRoom;
	private int price;
	
	
	public Bill() {
		// TODO Auto-generated constructor stub
	}
	public Bill(String nameCustomer, String idBill, String day, String idRoom, int price) {
		this.nameCustomer = nameCustomer;
		this.idBill = idBill;
		this.day = day;
		this.idRoom = idRoom;
		this.price = price;
	}
	public String getNameCustomer() {
		return nameCustomer;
	}
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}
	
	
	@Override
	public String toString() {
		return "Bill [nameCustomer=" + nameCustomer + ", idBill=" + idBill + ", day=" + day + ", idRoom=" + idRoom
				+ ", price=" + price + "]";
	}
	public String getIdBill() {
		return idBill;
	}
	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	public String getIdRoom() {
		return idRoom;
	}
	public void setIdRoom(String idRoom) {
		this.idRoom = idRoom;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int pay() {
		return 0;
	}
}
