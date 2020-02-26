package homework2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Map<String, EnglishWord> arr = mockData();
		Scanner sc = new Scanner(System.in);
		arr.entrySet().stream().forEach(t -> System.out.println(t.getValue()));
		System.out.print("Nhap them word -Nhap vao so luong tu can them :");

		int n = Integer.parseInt(sc.nextLine());
		while (n != 0) {
			System.out.print("Nhap vao word :");
			String word = sc.nextLine();
			System.out.print("Nhap vao mean :");
			String mean = sc.nextLine();
			System.out.print("Nhap vao tu loai :");
			String kindOfWord = sc.nextLine();
			System.out.print("Nhap vao chu thich :");
			String note = sc.nextLine();
			if (arr.get(word) == null) {
				addWord(arr, new EnglishWord(word, mean, kindOfWord, note));
			} else {
				System.out.println("Tu nay da co trong tu dien");
			}
			n--;
		}
		arr.entrySet().stream().forEach(t -> System.out.println(t.getValue()));
		System.out.print("Tra Tu : Moi Nhap vao tu can tra :");
		String s=sc.nextLine();
		EnglishWord ressult=search(arr, s);
		System.out.println(ressult);
	}

	public static void addWord(Map<String, EnglishWord> directory, EnglishWord newWord) {
		if (newWord.getWord() == null) {
			System.out.println("Tu khong hop le !");
		} else {
			directory.put(newWord.getWord(), newWord);
		}
	}

	public static EnglishWord search(Map<String, EnglishWord> mapWords, String word) {
		if (mapWords.get(word) == null) {
			return null;
		} else {
			return mapWords.get(word);
		}
	}

	public static Map<String, EnglishWord> mockData() {
		Map<String, EnglishWord> dictionary = new HashMap<>();
		List<EnglishWord> arr = Arrays.asList(new EnglishWord("hello", "Xin chao", "donng tu", "mot loi chao"),
				new EnglishWord("hi", "Xin chao", "donng tu", "mot loi chao"),
				new EnglishWord("bye", "tam biet", "donng tu", "mot loi tam biet"),
				new EnglishWord("cut", "cat", "donng tu", "Chia 1 vat nao do thanh nhieu mang"));
		for (EnglishWord englishWord : arr) {
			dictionary.put(englishWord.getWord(), englishWord);
		}

		return dictionary;
	}
}
