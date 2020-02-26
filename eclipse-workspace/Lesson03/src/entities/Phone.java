package entities;

public class Phone {

	private String pid;
	private String os;
	private String color;
	private int cost;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String pid, String os, String color, int cost) {
		super();
		this.pid = pid;
		this.os = os;
		this.color = color;
		this.cost = cost;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pid+" ,"+os+" "+color+""+cost;
	}
	
}
