package Ex02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex07 {

	public static void main(String[] args) {
		List<Customer> customers=new ArrayList<Customer>();
		try {
			customers=Files.lines(Paths.get("customer.txt")).map(t->{
				String[] arr=t.split(",");
				return new Customer(arr[0],Integer.parseInt(arr[1]),arr[2]);
			}).filter(t->t!=null).collect(Collectors.toList());
			
		}catch (Exception e) {
		} 
		customers.forEach(System.out::println);
	}
}
