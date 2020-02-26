package homework;

public class BillByDay extends Bill{

	private int dayRend;
	
	public BillByDay() {
		// TODO Auto-generated constructor stub
	}

	
	public BillByDay(String nameCustomer, String idBill, String day, String idRoom, int price,int dayRend) {
		super(nameCustomer,idBill,day,idRoom,price);
		this.dayRend = dayRend;
	}


	public int getDayRend() {
		return dayRend;
	}


	public void setHourRend(int dayRend) {
		this.dayRend = dayRend;
	}


	@Override
	public int pay() {
		return (dayRend>7) ? (dayRend*this.getPrice()*80/100*24):(dayRend*this.getPrice()*24); 
	}
	
}
