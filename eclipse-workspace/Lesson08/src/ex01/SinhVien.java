package ex01;

public class SinhVien {

	private int id;
	private String fullName;
	private int age;
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SinhVien(int id, String fullName, int age) {
		this.id = id;
		this.fullName = fullName;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.id+" "+ this.fullName+" "+this.age;
	} 
}
