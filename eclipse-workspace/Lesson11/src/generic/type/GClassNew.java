package generic.type;

public class GClassNew<T> {

	private T t;
	
	private T get() {
		return t;
	}
	
	private void set(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		GClassNew<String> stringClass = new GClassNew<>();
		stringClass.set("Hello");
		// stringClass.set(10); invalid type
		
		System.out.println("Value: " + stringClass.get());
		
	}
}