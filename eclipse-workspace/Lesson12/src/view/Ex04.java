package view;

import java.util.function.Function;

public class Ex04 {

	public static void main(String[] args) {
		Runnable run=running(200);
		run.run();
	}
	private static Runnable running(int time) {
		String running="running......";
	
		return ()->{
			String student="adam";
			System.out.println(student+" is "+running+" in " +time+" s");
		};
	}
	
	public static int run(int time,Function<String, Integer> function) {
		String text="aaaaaaaaaaaaaa";
		return 1;
	}
}
