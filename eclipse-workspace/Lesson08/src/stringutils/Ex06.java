package stringutils;

import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;



public class Ex06 {

	public static void main(String[] args) {
		String students="Hoang Teo,    Le Na,      Van Nam";
		Pattern.compile("").splitAsStream(students);
		Stream<String> studentStream=Pattern.compile(",\\s").splitAsStream(students).distinct().filter(student-> student.startsWith("Hoang"));
		studentStream.forEach(student->System.out.println(student));
		
	}
}
