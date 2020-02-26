package Ex02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {

	public static void main(String[] args) {
		Customer c=new Customer("Lena", 12345679, "nam cao");
		Customer c1=new Customer("hoang teo", 12345679, "nam cao");
		Customer c2=new Customer("van duc", 12345679, "nam cao");
		List<String> customers=Arrays.asList(c,c1,c2).stream().map(Customer::toString).collect(Collectors.toList());


		try {
			Files.write(file.toPath(), customers, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
