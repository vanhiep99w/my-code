package Ex01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import homeworks.DirEnum;
import homeworks.ExtensionEnum;

public class Ex05 {

	public static void main(String[] args) {
		File u=new File("test.txt");
		try {
			u.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		u.renameTo(new File("slide1.java"));
		
		/*
		 * System.out.println(source.getName()); if (source.exists()) { File target=new
		 * File(source.getName()); try { Files.move(source.toPath(), target.toPath(),
		 * StandardCopyOption.REPLACE_EXISTING); Files.mov } catch (IOException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } }
		 */
	}
}
