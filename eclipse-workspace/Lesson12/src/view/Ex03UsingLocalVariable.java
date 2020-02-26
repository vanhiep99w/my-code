package view;

public class Ex03UsingLocalVariable {

	public static void main(String[] args) {
		Runnable runable=running(300);
		runable.run();
	}
	private static Runnable running(int time) {
		String running="running......";
		Apple a=new Apple();
	
		return ()->{
			a.setColor("blue");
			String student="adam";
			System.out.println(student+" is "+running+" in " +time+" s");
		};
	}
}
