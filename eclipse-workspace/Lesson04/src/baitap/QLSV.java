package baitap;

public class QLSV {

	public static void main(String[] args) {
		Alumnus sv1=new Alumnus(123,"tran ba hiep",8,8);
		Alumnus sv2=new Alumnus(234, "UTF", 9, 9);
		Alumnus sv3=new Alumnus();
		sv3.setId(345);
		sv3.setName("THF");
		sv3.setLt(9.0f);
		sv3.setTh(9f);
		System.out.printf("%-15s%-15s%-15s%-15s%-15s","MSV","HỌ TÊN","ĐIỂM LT","ĐIỂM TH","ĐIỂM TB");
		System.out.println("\n======================================================================");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}
}
