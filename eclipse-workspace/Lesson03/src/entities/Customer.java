package entities;

import java.sql.Date;

public class Customer {

	private String name;
	private String phone;
	private String id;
	private String address;
	private Phone[] phones;
	private Date day;
	
	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String phone, String id, String address) {
		this.name = name;
		this.phone = phone;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return name+" ,"+id+" ,"+address+" ,"+phone;
	}

	
	@Override
	public boolean equals(Object obj) {
		// tại compile :KDL object
		
		//this và obj cùng trỏ đến 1 cái heap menmory
		if (this==obj) {
			return true;
		}
		// tại runtime obj : customer
		if(!(obj instanceof Customer)) {
			return false;
		}
		Customer that=(Customer)obj;
		return id.equals(that.id);
	}
}
