package homeworks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		createdData();
		File dir = new File("images");
		File[] fileJPG = dir.listFiles(t -> t.getName().endsWith(".jpg"));
		File[] filePNG = dir.listFiles(t -> t.getName().endsWith(".png"));
		int i = 1;
		for (File file : filePNG) {
			file.renameTo(new File(dir.getName() + "\\" + (i++) + ".png"));
		}
		int j = 1;
		for (File file : fileJPG) {
			file.renameTo(new File(dir.getName() + "\\" + (j++) + ".jpg"));
		}

	}

	public static boolean createdDirectory(String path) {
		File dir = new File(path);
		if (!dir.exists()) {
			return dir.mkdirs();
		}
		return false;
	}

	public static void createdFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void createdData() {
		String[] extension = { "jpg", "png" };
		String parentpath = "images";
		System.out.println(createdDirectory(parentpath));
		for (int i = 0; i < 30; i++) {
			Random rd = new Random();
			int indexRamdom = rd.nextInt(extension.length);
			String path = parentpath + "\\" + System.currentTimeMillis() + "." + extension[indexRamdom];
			createdFile(path);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
