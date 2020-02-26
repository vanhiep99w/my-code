package polimorphism.object;

public class Rectangle extends Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle======>Drawing....");
		
	}
	public void abc() {
		
	}
	@Override
	public void remove() {
		System.out.println("REctangle======>Removing....");
	}
}
