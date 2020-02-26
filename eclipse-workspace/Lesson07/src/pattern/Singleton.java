package pattern;

public class Singleton {

	//Can a contructor be private ?
	private static Singleton singleton =null;
	private String text;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(singleton==null) {
			singleton=new Singleton();
			}
		return singleton;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
