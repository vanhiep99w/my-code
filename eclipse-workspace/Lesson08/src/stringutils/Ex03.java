package stringutils;

import java.util.Scanner;



public class Ex03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Ex03 test=new Ex03();
		String fullName;
		do {
			System.out.println("Enter fullname : ");
			fullName=sc.nextLine();
			try {
				test.isValid(fullName, "bkit-","123");
				break;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} while (true);
		System.out.println(fullName);
	}
	private  boolean isValid(String fullName,String prefix,String suffix)  throws Exception{
		if(fullName.length()!=8) {
			throw new Exception("FullName should contain 8 letters");
		}
		if(!fullName.startsWith(prefix)) {
			throw new Exception("FullName should be started be "+prefix);
		}
		if(!fullName.endsWith(suffix)) {
			throw new Exception("FullName should be started by"+ suffix);
		}
		return fullName.startsWith(prefix);
	}
}
