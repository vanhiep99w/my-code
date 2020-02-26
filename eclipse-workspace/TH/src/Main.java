import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
		Vehicle[] vehicles=new Vehicle[10];
		
		for (int i = 0; i < 1; i++) {
			String name =sc.nextLine();
			int dungTich=Integer.parseInt(sc.nextLine());
			int giaTri =Integer.parseInt(sc.nextLine());

			vehicles[i]=new Vehicle(name, dungTich, giaTri);
		}
		for (int i = 0; i < 1; i++) {
			System.out.println(vehicles[i]);
		}
	}
}
