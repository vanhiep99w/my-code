package execution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		File file=null;
		try {
			file=creatFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileWriter fw=null;
		try {
			fw=new FileWriter(file);
			fw.write("hello java 06");
			fw.write("hello java 06");
			
		} catch ( ArithmeticException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("kết thức chương trình");
		
	}
	private static File creatFile() throws IOException {
		String filePath="F:\\Temp\\student.txt";
		File file=new File(filePath);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("tao file thanh cong");
		}
		
		return file;
		
	}
}
