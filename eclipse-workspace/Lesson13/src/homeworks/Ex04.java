package homeworks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex04 {

	public static void main(String[] args) {
		String pathInput = "input.txt";
		String pathOutput = "output.txt";
		List<Integer> list = readFile(pathInput);
		System.out.println(writeFile(pathOutput, list));
	}

	public static List<Integer> readFile(String path) {
		BufferedReader br = null;
		List<Integer> list = null;

		try {
			br = Files.newBufferedReader(Paths.get(path));
			int n = Integer.parseInt(br.readLine());
			list = new ArrayList<Integer>();
			String line = "";
			while ((line = br.readLine()) != null) {
				list.add(findMaxNumber(line));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public static int findMaxNumber(String input) {
		String[] temp = input.split("[a-zA-Z0]+");
		return Stream.of(temp).mapToInt(t -> {
			if (!t.equals(""))
				return Integer.parseInt(t);
			return 0;
		}).max().orElse(0);
	}

	public static boolean writeFile(String path, List<Integer> list) {
		BufferedWriter bw = null;
		if(!Files.exists(Paths.get(path))||list==null) {
			return false;
		}else {
			try {
				bw = Files.newBufferedWriter(Paths.get(path));
				list.sort(Integer::compareTo);
				for (Integer integer : list) {
					bw.write(integer+"");
					bw.newLine();
				}
				return true;
			} catch (IOException e) { 
				e.printStackTrace();
			}finally {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return false;
		}
		
	}

}
