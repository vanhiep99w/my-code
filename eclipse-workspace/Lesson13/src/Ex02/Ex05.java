package Ex02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex05 {

	public static void main(String[] args) {
		List<Customer> customers=new ArrayList<Customer>();
		File file=new File("customer.txt");
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			customers=br.lines().map(t->{
				String[] arr=t.split(",");
				return new Customer(arr[0],Integer.parseInt(arr[1]),arr[2]);
			}).filter(t->t!=null).collect(Collectors.toList());
			
		}catch (Exception e) {
		} 
		customers.forEach(System.out::println);
	}
}
