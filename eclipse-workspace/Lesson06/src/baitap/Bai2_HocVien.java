package baitap;

import java.sql.Date;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Bai2_HocVien {

	private String id;
	private String name;
	private Date birthDay;
	private String password;
	public Bai2_HocVien() {
	}
	public Bai2_HocVien(String id, String name, Date birthDay, String password) {
		
		this.id = id;
		this.name = name;
		this.birthDay = birthDay;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	public boolean checkName(String c) {
//		return c.matches("[\\w]{5,63}");
//	}
//	public boolean checkID(String c) {
//		return c.matches("^bkit-\\d{3}");
//	}
//	public boolean checkPassword(String c) {
//		return c.matches("[[A-Z]*[\\w]*[!@#$%^&*]*[\\w]*]{8,63}");
//	}
}
