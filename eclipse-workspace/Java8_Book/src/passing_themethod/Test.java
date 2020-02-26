package passing_themethod;

import java.io.File;
import java.io.FileFilter;

public class Test {

	public static void main(String[] args) {
		 File[] files = new File("C:").listFiles(File::isHidden);
		Interface inter =Student::show; 
		inter.see();
	}
}
