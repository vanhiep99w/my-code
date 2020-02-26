package Ex01;

import java.io.File;

public class Ex03 {

	public static void main(String[] args) {
		String path="cources\\Lesson0\\slide.pdf";
		File file=new File(path);
		boolean isValid=false;
		if (file.exists()) {
			File newFile=new File("CodeReview.pdf");
			isValid = file.renameTo(newFile);
		}
		System.out.println("isValid : "+ isValid);
	}
}
