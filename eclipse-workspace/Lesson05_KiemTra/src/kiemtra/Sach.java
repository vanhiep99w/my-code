package kiemtra;

public class Sach {

	
	protected String id;
	protected int donGia;
	protected int amount;
	protected String nhaXB;
	protected boolean tinhTrang;
	protected int thue;
	public Sach() {
	}
	
	
	public Sach(String id, int donGia, int amount, String nhaXB) {
		
		this.id = id;
		this.donGia = donGia;
		this.amount = amount;
		this.nhaXB = nhaXB;
		this.tinhTrang = true;
		this.thue = 0;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getDonGia() {
		return donGia;
	}


	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getNhaXB() {
		return nhaXB;
	}


	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}


	public boolean isTinhTrang() {
		return tinhTrang;
	}


	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}


	public int getThue() {
		return thue;
	}


	public void setThue(int thue) {
		this.thue = thue;
	}


	protected int thanhTien() {
		return 0;
	}
}
