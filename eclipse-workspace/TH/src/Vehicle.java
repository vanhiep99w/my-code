
public class Vehicle {

	private String name;
	private int dungTich;
	private int giaTien;
	private int tax;
	public Vehicle() {
		
	}
	public Vehicle(String name, int dungTich, int giaTien) {
		this.name = name;
		this.dungTich = dungTich;
		this.giaTien = giaTien;
		this.tax = dungTich+giaTien;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public int getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}
	public int getTax() {
		return tax;
	}
	public void setTax() {
		
	}
	@Override
	public String toString() {
		return name+dungTich+giaTien;
	}
	
	
}
