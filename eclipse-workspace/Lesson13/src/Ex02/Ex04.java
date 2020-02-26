package Ex02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		List<Customer> customers=new ArrayList<Customer>();
		File file=new File("customer.txt");
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			String line="";
			while ((line=br.readLine())!=null) {
				String[] t=line.split(",");
				Customer customer=new Customer(t[0],Integer.parseInt(t[1]),t[2]);
				customers.add(customer);
			}
			
		}catch (Exception e) {
		} 
		customers.forEach(System.out::println);
	}
}
