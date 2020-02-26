package Pom_Parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class Ex01 {
	public static void main(String[] args) {
		String pathXMLFile = "input.xml";
		File file = new File(pathXMLFile);
		InputStream in = null;
		Properties pro = null;
		System.out.println(file.exists());
		try {
			in = new FileInputStream(file);
			pro = new Properties();
			pro.loadFromXML(in);
			System.out.println(pro.toString());
			System.out.println(pro.get("abc"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
