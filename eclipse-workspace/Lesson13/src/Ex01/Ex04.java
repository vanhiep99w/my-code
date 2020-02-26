package Ex01;

import java.io.File;
import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		String path="cources";
		File[] roots=File.listRoots();
		Arrays.stream(roots).forEach(System.out::println);
		File java06=new File(path);
		File[] files=java06.listFiles(File::isDirectory);
		File[] files1=java06.listFiles(f->f.getName().endsWith(".txt"))
		Arrays.stream(files).forEach(System.out::println);
		System.out.println("======================");
		Arrays.stream(files1).forEach(System.out::println);
	}
}
