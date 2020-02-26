package polimorphism.object;

public class ShapeDemo {

	//đối tượng chỉ được khởi tạo tại runtime
	public static void main(String[] args) {
//		Shape shape=new Shape();
//		shape.draw();
//		
//		Rectangle rectangle=new Rectangle();
//		rectangle.draw();
//		
//		Square square=new Square();
//		square.draw();
		
		Shape shapeRectangle=new Rectangle();
		Shape shapeSquare=new Square();
		
		show(shapeRectangle);
		show(shapeSquare);
		
		//Tại sao lại sinh ra tính đa hình đối tượng :
		//1 . Design patterns :
		// Easy to cast to another relational object 
		//HCN có 4 cạnh bằng nhau là hình vuông
		// chỉ có thể over
		
		shapeRectangle=shapeSquare;
		show(shapeRectangle);
	}
	public static void show(Shape shape) {
		shape.draw();
		shape.remove();
	}
}
