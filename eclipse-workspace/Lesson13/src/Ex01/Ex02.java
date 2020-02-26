package Ex01;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		// nhập số lượng lớp học
		// n=2
		// cources
		// - Lesson01
		// ++ slide.pdf
		// ++ codeReview.xlsx
		// - java02
		// ++ slide.pdf
		// ++ codeReview.xlsx
		String pathTest="‪C:\\Users\\Admin\\Desktop\\New Text Document.txt";
		File file=new File(pathTest);
		System.out.println(file.exists());
		
		/*
		 * int n=2; for(int i=0;i<n;i++) {
		 * 
		 * 
		 * String path="cources\\lesson"+i+"\\slide.pdf"; String
		 * path2="cources\\lesson"+i+"\\codeReview.pdf"; isCreatedDirectory(path,path2);
		 * }
		 */

	}
	

	private static void isCreatedDirectory(String ...paths) {
		for (String path : paths) {
			File dir = new File(path);
			try {
				File parent = dir.getParentFile();
				if (!parent.exists()) {
					parent.mkdirs();
				}
				if (!dir.exists()) {
					dir.createNewFile();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
}
