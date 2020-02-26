package view;

public class Apple {

	private String color;
	private String country;
	private String weight;

	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public Apple(String color, String country, String weight) {
		super();
		this.color = color;
		this.country = country;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", country=" + country + ", weight=" + weight + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null||!(obj instanceof Apple)) {
			return false;
		}
		Apple apple=(Apple)obj;
		return getColor().equals(apple.getColor())&&getCountry().equals(getCountry())&&getWeight().equals(getWeight());
	}

}
