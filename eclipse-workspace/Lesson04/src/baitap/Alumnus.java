package baitap;

public class Alumnus {

	private int id;
	private String name;
	private float lt,th;
	public Alumnus() {
		// TODO Auto-generated constructor stub
	}
	
	public Alumnus(int id, String name, int lt, int th) {
		super();
		this.id = id;
		this.name = name;
		this.lt = lt;
		this.th = th;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getLt() {
		return lt;
	}
	public void setLt(Float lt) {
		this.lt = lt;
	}
	public float getTh() {
		return th;
	}
	public void setTh(Float th) {
		this.th = th;
	}

	public float calMideumScore() {
		return (lt+th)/2;
	}
	public String toString() {
		return String.format("%-15d%-15s%-15f%-15f%-15f", id,name,lt,th,calMideumScore());
	}
	
}
