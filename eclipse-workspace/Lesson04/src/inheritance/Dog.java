package inheritance;

public class Dog extends Animal{

	
	private boolean isLoyal;
	public void security() {
		if(isLoyal) {
			System.out.println("Dog ====> security....");
		}else {
			System.out.println("Dog ====> non_security....");
		}
	}
	public Dog() {
	}
	public Dog(String color, boolean gender, boolean isLoyal) {
		super(color, gender);
		this.isLoyal=isLoyal;
	}
	public Dog(String color, boolean gender) {
		//c1
//		super(color, gender);
//		this.isLoyal=true;
		//c2
		this(color, gender, true);
	}
}
