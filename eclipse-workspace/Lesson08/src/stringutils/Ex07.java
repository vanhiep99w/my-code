package stringutils;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		String[] students= {"Le Na","Hoang Teo","Do Dat"};
		// sap  xep
		Arrays.sort(students);
		//noi cac phan tu trong student cách nhau bởi kí tự , trả về string
		String result=String.join(", ", students);
		System.out.println(result);
	}
}
