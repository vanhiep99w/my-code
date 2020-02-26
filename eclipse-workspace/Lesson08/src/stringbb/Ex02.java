package stringbb;

public class Ex02 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer ();
		s.append("HEllo word");
		s.reverse();
		s.insert(5, "Xin chao");
		s.deleteCharAt(s.length()-1);
		System.out.println(s);
	}
	
}
