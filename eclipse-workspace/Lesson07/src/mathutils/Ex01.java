package mathutils;

public class Ex01 {

	public static void main(String[] args) {
		double rand=Math.random()*5+5;
		//random từ 5 đến 10;
		double simpi6=Math.sin(Math.PI/6);
		System.out.println(rand);
		
		long round=Math.round(rand);//normal
		double ceil=Math.ceil(rand);//làm tròn lên
		double floor=Math.floor(rand);//làm tròn xuống
		
				
		System.out.println(round);
		System.out.println(ceil);
		System.out.println(floor);
	}
}
