package baitap;

public class Vehicle {

	private Owner owner;
	private String kindOfVehicle;
	private int capacity;
	private int value;
	private int tax;
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public Vehicle(Owner owner, String kindOfVehicle, int capacity, int value) {
		this.owner = owner;
		this.kindOfVehicle = kindOfVehicle;
		this.capacity = capacity;
		this.value = value;
		this.tax = calTax();
	}
	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public String getKindOfVehicle() {
		return kindOfVehicle;
	}
	public void setKindOfVehicle(String kindOfVehicle) {
		this.kindOfVehicle = kindOfVehicle;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return owner+"    ";
	}
	private int calTax() {
		if(capacity<100) {
			return value/100;
		}else if(capacity>200) {
			return value*5/100;
		}
		return value*3/100;
	}
}
