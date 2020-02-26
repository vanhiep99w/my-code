package Ex02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class Ex08 {

	public static void main(String[] args) {
		Customer c = new Customer("Lena", 12345679, "nam cao");
		Customer c1 = new Customer("hoang teo", 12345679, "nam cao");
		Customer c2 = new Customer("van duc", 12345679, "nam cao");
		List<Customer> customers = Arrays.asList(c, c1, c2);
		File file = new File("customer.txt");
		writeFile(file, customers);
		List<Customer> reslt = (List<Customer>) readFile(file);
		reslt.forEach(System.out::println);

	}

	private static void writeFile(File file, Object object) {
		FileOutputStream fof = null;
		ObjectOutputStream oos = null;

		try {
			fof = new FileOutputStream(file);
			oos = new ObjectOutputStream(fof);
			oos.writeObject(object);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fof.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("resource")
	private static Object readFile(File file) {
		FileInputStream fof = null;
		ObjectInputStream oos = null;

		try {
			fof = new FileInputStream(file);
			oos = new ObjectInputStream(fof);
			return oos.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fof.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
