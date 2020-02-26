package baitap;

public class Circle {

	private Point pointCenter;
	private int radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Point getPointCenter() {
		return pointCenter;
	}
	public void setPointCenter(Point pointCenter) {
		this.pointCenter = pointCenter;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Circle(Point pointCenter, int radius) {
		this.pointCenter = pointCenter;
		this.radius = radius;
	}
	
	
}
