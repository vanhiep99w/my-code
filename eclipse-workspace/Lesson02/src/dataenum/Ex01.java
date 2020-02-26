package dataenum;

public class Ex01 {

	enum Operator {
		SUM, SUB, MUL, DIV;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int result = calculate(a,b,Operator.MUL);
		System.out.println(result);
	}

	private static int calculate(int a, int b, Operator operator) {
		switch(operator) {
		case SUM:
			return a+b;
		case SUB:
			return a-b;
		case MUL:
			return a*b;
		case DIV:
			return a/b;
		}
		return 0;
	}

}
