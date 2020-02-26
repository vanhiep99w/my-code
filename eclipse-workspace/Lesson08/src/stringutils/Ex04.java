package stringutils;

public class Ex04 {

	public static void main(String[] args) {
		String s="bkit-234-da-nang";
		//s.sp
		String s1="234";
		String s2="Java06";
		s=s.replace(s1, s2);
		System.out.println(s);
		// Loại bỏ các khoảng trắng thừa
		String s3="   Welcome   ---to---java   ";
		s3=s3.trim().replaceAll("[ -;]+"," ");
		//[]Nhóm kí tự
		System.out.println(s3);
		//tạo chuỗi  con từ chuỗi s
		s="0123456789";
		String s4=s.substring(3);
		System.out.println(s4);
		String s5=s.substring(3, 7);
		System.out.println(s5);
		// kiểm tra s có trong chuỗi lớn ko
		String s6="xxx";
		System.out.println(s.contains(s5));
	}
}
