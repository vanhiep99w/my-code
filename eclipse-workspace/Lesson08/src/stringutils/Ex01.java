package stringutils;

public class Ex01 {
	/**
	   1. Tính chiều dài của chuỗi s
	   2. Nối chuỗi s1 vào chuỗi s
	   3. Lấy một ký tự tại vị trí index trong chuỗi s
	   4. Duyệt từng phần tử trong chuỗi
  	   5. Tìm vị trí xuất hiện đầu tiên, cuối cùng của chuỗi s2 trong chuỗi s
	 */
	public static void main(String[] args) {
		String s = "Welcome to Java06 class";
		String s1 = " - Da Nang";
		String s2 = "c";
		
		System.out.println("(s1) hashing: " + System.identityHashCode(s));

		System.out.println("1. Độ dài chuỗi: " + s.length());
		
		// s += s1;
		s = s.concat(s1);
		
		System.out.println("(s1) hashing - updated: " + System.identityHashCode(s));
		System.out.println("2. Nối chuỗi s1 vào s: " + s);
		
		System.out.println("Giá trị tại index = 11: " + s.charAt(11));
		
		System.out.println("Duyệt từng phần tử trong chuỗi s");
		for (int i = 0 ; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println("Vị trí xuất hiện đầu tiên của s2 trong s: " + s.indexOf(s2));
		System.out.println("Vị trí xuất hiện cuối cùng của s2 trong s: " + s.lastIndexOf(s2));
		
		// Kiểm tra kí tự đầu tiên trong chuỗi có phải là số hay không
		char first = s.charAt(0);
		System.out.println("Kí tự đầu tiên là số phải không: " + Character.isDigit(first)); 
		
	}
}