package random;
import java.util.Random;
public class Ex03 {
	private static Random rd =new Random(); 
	public static void main(String[] args) throws InterruptedException {
		String[] students = {"An","Binh","Trang","Tu","Hao"}; 
		System.out.println(students[rd.nextInt(students.length)]);
		//chon ngau nhien 2
		String preStudent="";
		for(int i=1;i<=2;i++) {
			String strand=students[rd.nextInt(students.length)];
			while(preStudent==strand) {
				strand=students[rd.nextInt(students.length)];
			}
			Thread.sleep(3000);
			preStudent=strand;
			System.out.println(strand);
		}
	}
}
