package model.bean;

public class Student {
	private int id;
	private String soBaDanh;
	private String HoTen;
	private String ngaySinh;
	private String cmt;
	private String khoiThi;
	private int diemMon1;
	private int diemMon2;
	private int diemMon3;
	public Student(int id, String soBaDanh, String hoTen, String ngaySinh, String cmt, String khoiThi, int diemMon1,
			int diemMon2, int diemMon3) {
		super();
		this.id = id;
		this.soBaDanh = soBaDanh;
		HoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.cmt = cmt;
		this.khoiThi = khoiThi;
		this.diemMon1 = diemMon1;
		this.diemMon2 = diemMon2;
		this.diemMon3 = diemMon3;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSoBaDanh() {
		return soBaDanh;
	}
	public void setSoBaDanh(String soBaDanh) {
		this.soBaDanh = soBaDanh;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getCmt() {
		return cmt;
	}
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	public String getKhoiThi() {
		return khoiThi;
	}
	public void setKhoiThi(String khoiThi) {
		this.khoiThi = khoiThi;
	}
	public int getDiemMon1() {
		return diemMon1;
	}
	public void setDiemMon1(int diemMon1) {
		this.diemMon1 = diemMon1;
	}
	public int getDiemMon2() {
		return diemMon2;
	}
	public void setDiemMon2(int diemMon2) {
		this.diemMon2 = diemMon2;
	}
	public int getDiemMon3() {
		return diemMon3;
	}
	public void setDiemMon3(int diemMon3) {
		this.diemMon3 = diemMon3;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String toString1() {
		return (getId()+"#"+getSoBaDanh()+"#"+getHoTen()+"#"
	+getNgaySinh()+"#"+getCmt()+"#"+getKhoiThi()+"#"+getDiemMon1()+"#"+getDiemMon2()+"#"+getDiemMon3()) ;
	}
}
