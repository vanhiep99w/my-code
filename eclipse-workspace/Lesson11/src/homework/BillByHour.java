package homework;

public class BillByHour extends Bill{

	private int hourRend;

	public BillByHour() {
		// TODO Auto-generated constructor stub
	}

	public int getHourRend() {
		return hourRend;
	}

	public void setHourRend(int hourRend) {
		this.hourRend = hourRend;
	}

	public BillByHour(String nameCustomer, String idBill, String day, String idRoom, int price,int hourRend) {
		super(nameCustomer,idBill,day,idRoom,price);
		this.hourRend = hourRend;
	}
	@Override
	public int pay() {
		if(hourRend<30&& hourRend>24) {
			return 24*this.getPrice();
		}
		if(hourRend>30) {
			BillByDay temp=new BillByDay(this.getNameCustomer(), this.getIdBill(), this.getDay(), this.getIdRoom(), this.getPrice(), hourRend/24);
			return temp.pay();
		}
		return hourRend*this.getPrice();
	}
}
