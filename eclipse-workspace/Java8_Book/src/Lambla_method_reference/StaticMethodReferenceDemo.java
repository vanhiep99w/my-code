package Lambla_method_reference;

public class StaticMethodReferenceDemo {

	 public StaticMethodReferenceDemo() {
	    }
	    // This method takes a functional interface as the type of its first parameter. Thus it can accept a reference to any instance of that
	    // interface, including one created by a method reference
	    public boolean numCheck(IntPredicate p, int n) {
	        return p.check(n);
	    }
}
