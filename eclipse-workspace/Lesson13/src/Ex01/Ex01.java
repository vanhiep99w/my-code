package Ex01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Ex01 {

	public static void main(String[] args) {

		String path = "resource\\java06\\text.txt";
		boolean isCreated = createdNewFile(path);
		System.out.println("isCreated : " + isCreated);

		/*
		 * boolean isDir = createdNewDirectory("resours\\Java06");
		 * System.out.println("isDir : " + isDir);
		 */

	}

	private static boolean createdNewFile(String path) {
		File file = new File(path);
		
		boolean isCreated = false;
		
		try {
			System.out.println("path : "+file.getPath());
			System.out.println("absolute path : "+file.getAbsolutePath());
			System.out.println("canonical path : "+file.getCanonicalPath());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println();
		try {
			File parent=file.getParentFile();
			if (!parent.exists()) {
				parent.mkdirs();
			}
			if (!file.exists()) {
				isCreated = file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isCreated;
	}

	private static boolean createdNewDirectory(String path) {
		File dir = new File(path);
		boolean result = false;
		if (!dir.exists()) {
			result = dir.mkdirs();
		}
		return result;
	}
}
