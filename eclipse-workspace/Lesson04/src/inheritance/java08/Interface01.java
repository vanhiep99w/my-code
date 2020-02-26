package inheritance.java08;

public interface Interface01 {

	public void method01();
	default void log(String log) {
		System.out.println("Interface01 :  =====>"+ log);
	}
	static void display() {
		System.out.println("Interface01 : ======> shows a messagen");
	}
}
