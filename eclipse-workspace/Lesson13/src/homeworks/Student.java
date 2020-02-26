package homeworks;

import java.io.Serializable;

public class Student {

	
	private int id;
	private String name;
	private float diemTB;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, float diemTB) {
		this.id = id;
		this.name = name;
		this.diemTB = diemTB;
	}

	@Override
	public String toString() {
		return id +"-"+ name +"-"+ diemTB;
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
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	
	
}
