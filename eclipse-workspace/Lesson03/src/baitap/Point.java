package baitap;

public class Point {

	private int xPoint;
	private int yPoint;
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public Point(int xPoint, int yPoint) {
		super();
		this.xPoint = xPoint;
		this.yPoint = yPoint;
	}
	public int getxPoint() {
		return xPoint;
	}
	public void setxPoint(int xPoint) {
		this.xPoint = xPoint;
	}
	public int getyPoint() {
		return yPoint;
	}
	public void setyPoint(int yPoint) {
		this.yPoint = yPoint;
	}
	@Override
	public String toString() {
		return "("+xPoint+","+yPoint+")";
	}

}
