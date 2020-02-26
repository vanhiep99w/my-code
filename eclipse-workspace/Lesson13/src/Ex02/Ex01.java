package Ex02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		File file=new File("student.txt");
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			long start=System.currentTimeMillis();
			for (int i = 0; i < 1000000; i++) {
				bw.write(i+"st - lesson01");
				bw.newLine();
			}
			System.out.println("time : "+ (System.currentTimeMillis()-start));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("done");
	}
}
