package pattern;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton s=Singleton.getInstance();
		s.setText("1111");
		System.out.println(s.getText());
	}
}
