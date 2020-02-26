package generic.type;

public class GClassOld {
	private Object o;
	
	public Object get() {
		return this.o;
	}
	
	private void set(Object o) {
		this.o = o;
	}
	
	public static void main(String[] args) {
		GClassOld gclass = new GClassOld();
		gclass.set("XX");
		Integer result = (Integer)gclass.get();
		
		System.out.println(result);
	}
}