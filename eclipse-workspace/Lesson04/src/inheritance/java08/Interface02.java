package inheritance.java08;

public interface Interface02 {

	public void method02();
	default void log(String log) {
		System.out.println("Interface02 :  =====>"+ log);
	}
}
