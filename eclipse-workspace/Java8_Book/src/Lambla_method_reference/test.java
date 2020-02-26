package Lambla_method_reference;

public class test {

	 public static void main(String[] args) {
	        StaticMethodReferenceDemo demo = new StaticMethodReferenceDemo();
	        boolean result;
	        int num = 9;
	        // Here, Using lambda expression to check if a number is even
	        IntPredicate lb1 = number -> (number % 2) ==0;
	        result = demo.numCheck(lb1, num);
	        System.out.println("Using lambda expression: " + num + " is even: " + result);
	        // Here, a method reference to  static method isEven of IntPredicatesChecker is passed to numCheck().
	        result = demo.numCheck(IntPredicatesChecker::isEven, num);
	        System.out.println("Using static method reference: " + num + " is even: " + result);
	        // Here, Using lambda expression to check if a number is positive
	        IntPredicate lb2 = number -> number > 0;
	        result = demo.numCheck(lb2, num);
	        System.out.println("Using lambda expression: " + num + " is positive: " + result);
	        // Here, a method reference to  static method isPositive of IntPredicatesChecker is passed to numCheck().
	        result = demo.numCheck(IntPredicatesChecker::isPositive, num);
	        System.out.println("Using static method reference: " + num + " is positive: " + result);
	    }
}
