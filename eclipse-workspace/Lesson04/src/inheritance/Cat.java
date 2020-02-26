package inheritance;

public class Cat extends Animal{

	public void catchMouse() {
		System.out.println("Cat ===> catching Mouse....");
	}

	public Cat() {
		super();
		//this super : special key in Java
		//Thuộc phạm vi của đối tượng(Not Class)
		//trong một class thay vì new cat()=> gọi methosd,attributrs
		//Cat cat=new Cat();cat.getGender()
		//This=contructor(Đối tượng
		

	}

	public Cat(String color, boolean gender) {
		super(color, gender);
		// TODO Auto-generated constructor stub
	}
}
