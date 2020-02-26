package inheritance.funtional;

public class Ex01 {

	public static void main(String[] args) {
		int a=10,b=5;
		// prior java8 => anonymous class :
		// java8 => using lambd expression
		// lambda : 3 parts : (paramenters)-> {//body}
		//(x,y)->x+y là một lambda expression
		//use to replace with @FI  
		int sum=calculate(a, b, (x,y)->x+y);
		int sub=calculate(a, b, (x,y)->x-y);
	}
	public static int calculate(int a,int b,Operator ope) {
		return ope.operating(a, b);
	}
	
}
