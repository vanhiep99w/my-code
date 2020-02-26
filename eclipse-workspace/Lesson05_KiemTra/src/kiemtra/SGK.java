package kiemtra;

public class SGK extends Sach {

	public SGK(String id, int donGia, int amount, String nhaXB,boolean tinhTrang) {
		this.id = id;
		this.donGia = donGia;
		this.amount = amount;
		this.nhaXB = nhaXB;
		this.tinhTrang = tinhTrang;
		this.thue = 0;
	}

	@Override
	protected int thanhTien() {
		if(this.tinhTrang==true) {
			return amount*donGia;
		}else return amount*donGia*50/100;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s%-15d%-15d%-15s%-15s", id,donGia,amount,nhaXB,tinhTrang);
	}
}
