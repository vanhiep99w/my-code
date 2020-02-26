package entities;

public class IteamBox {
	//access modifier : phạm vi truy cập 
	private int height,width;
	private String name,color;
	
	//default constructor.
	public IteamBox() {
		System.out.println("Calling IteamBox contructor");
		
	}
	
	// khi tạo mới constructor khác với default constructor thì default
	// constructor ko còn tồn tại nữa 
	// muốn sử dụng thì tạo default với no parenmenters
	
	
	public IteamBox(String name,String color,int width,int height) {
		this.name=name;
		this.color=color;
		this.width=width;
		this.height=height;
	}
	
	

	int calSquare() {
		return width*height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	
}
