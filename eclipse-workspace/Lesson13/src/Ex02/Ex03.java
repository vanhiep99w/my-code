package Ex02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		Customer c=new Customer("Lena", 12345679, "nam cao");
		Customer c1=new Customer("hoang teo", 12345679, "nam cao");
		Customer c2=new Customer("van duc", 12345679, "nam cao");
		List<Customer> customers=Arrays.asList(c,c1,c2);
		File file=new File("customer.txt");
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw=new FileWriter(file,true);
			bw=new BufferedWriter(fw);
			for (Customer customer : customers) {
				String s=customer.toString();
				bw.write(s);
				bw.newLine();
			}
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
		
	}
}
