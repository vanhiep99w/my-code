package inheritance;

public class Animal {

	protected String color;
	protected boolean gender;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String color, boolean gender) {
		this.color = color;
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	protected void eat() {
		System.out.println("animal ====> eating....");
	}
	protected void move() {
		System.out.println("animal ====> moving....");
	}
}
