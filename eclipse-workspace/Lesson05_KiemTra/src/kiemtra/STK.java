package kiemtra;

public class STK extends Sach{

	public STK(String id, int donGia, int amount, String nhaXB,int thue) {
		this.id = id;
		this.donGia = donGia;
		this.amount = amount;
		this.nhaXB = nhaXB;
		this.tinhTrang = true;
		this.thue = thue;
	}
	@Override
	protected int thanhTien() {
		return amount*donGia+thue;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s%-15d%-15d%-15s%-15d", id,donGia,amount,nhaXB,thue);
	}
}
