package model.bean;

public class CumThi {
	private int id;
	private String ten_cum;
	
	public CumThi() {
		// TODO Auto-generated constructor stub
	}

	public CumThi(int id, String ten_cum) {
		super();
		this.id = id;
		this.ten_cum = ten_cum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen_cum() {
		return ten_cum;
	}

	public void setTen_cum(String ten_cum) {
		this.ten_cum = ten_cum;
	}
	@Override
	public String toString() {
		return +getId()+ "#" +getTen_cum();
	}
	
}
