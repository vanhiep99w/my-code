package main;

public class Ex03 {
	
	/**
	 * Access modifier
	 * +Public: can be accessed in its class or other outer class
	 * +Private: only can be accessed in its class. Can't be accessed from outer class
	 */
	
	private static int number = 10;
	
	public static void main(String[] args) 
	{
		android();
		ios();
		System.out.println(number);
	}
	
	public static void android() 
	{
		System.out.println("ANDROID - PUBLIC "+number);
	}
	
	public static void microsoft () 
	{
		System.out.println("MICROSOFT");
	}
	
	private static void ios() 
	{
		System.out.println("iOS - PRIVATE");
	}
	

}
