package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TranderExecutingTransactions {

	public static void main(String[] args) {

		List<Transaction> transactions = mock();
		transactions.forEach(t -> System.out.println(t));
		System.out.println("============================");

		// Find all transactions in the year 2011 and sort them by value (small to
		// high).

		System.out.println("all transactions in the year 2011 and sort them by value");
		List<Transaction> result1 = transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted((Comparator.comparing(Transaction::getValue))).collect(Collectors.toList());
		result1.forEach(t -> System.out.println(t));
		System.out.println("============================");
		// Find all transactions have value greater than 300 and sort them by trader�s
		// city
		System.out.println("all transactions have value greater than 300 and sort them by trader�s city");

		Function<Transaction, Trader> t = Transaction::getTrader;
		List<Transaction> result2 = transactions.stream().filter(t1 -> t1.getValue() >= 300)
				.sorted(Comparator.comparing(t.andThen(Trader::getCity))).collect(Collectors.toList());

		result2.forEach(System.out::println);
		System.out.println("============================");

		// What are all the unique cities where the traders
		// work?=====================================
		System.out.println("all the unique cities where the traders work");

		List<String> result3 = transactions.stream().map(x -> x.getTrader().getCity()).distinct()
				.collect(Collectors.toList());
		result3.forEach(System.out::println);
		System.out.println("============================");

		// Find all traders from Cambridge and sort them by name desc and city asc.
		System.out.println("all traders from Cambridge and sort them by name desc and city asc");
		Function<Transaction, Trader> temp = Transaction::getTrader;
		List<Transaction> result4 = transactions.stream().filter(s -> "Cambridge".equals(s.getTrader().getCity()))
				.sorted(Comparator.comparing(temp.andThen(Trader::getName), Comparator.reverseOrder()))
						.collect(Collectors.toList());
		result4.forEach(System.out::println);
		System.out.println("============================");

		// Return a string of all traders� names sorted alphabetically.
		System.out.println("a string of all traders� names sorted alphabetically");
		String stringResult = "";
		stringResult=transactions.stream().map(temp.andThen(Trader::getName)).sorted().reduce("",(s1,s2)->s1+s2);
		System.out.println(stringResult);
		System.out.println("============================");

		// Are any traders based in Milan?
		System.out.println("Are any traders based in Milan ?");

		boolean b = transactions.stream().anyMatch(t5 -> "Milan".equals(t5.getTrader().getCity()));
		if (b) {
			System.out.println("Yes");}
		else
			{System.out.println("No");}
		System.out.println("============================");

		// Count the number of traders in Milan.

		System.out.println("the number of traders in Milan.");
		long count = transactions.stream().filter(t6 -> "Milan".equals(t6.getTrader().getCity())).count();
		System.out.println(count);
		System.out.println("============================");

		// Print all transactions� values from the traders living in Cambridge.
		System.out.println("all transactions� values from the traders living in Cambridge");

		List<Integer> result7 = transactions.stream().filter(t7 -> "Cambridge".equals(t7.getTrader().getCity()))
				.map(Transaction::getValue).collect(Collectors.toList());
		result7.forEach(System.out::println);
		System.out.println("============================");

		// What�s the highest value of all the transactions?
		System.out.println(" the highest value of all the transactions");

		transactions.sort(Comparator.comparing(Transaction::getValue));
		System.out.println(transactions.get(transactions.size() - 1).getValue());
		System.out.println("============================");

		// Find the transaction with the smallest value.
		System.out.println("the transaction with the smallest value");
		System.out.println(transactions.get(0));

	}

	private static List<Transaction> mock() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
		return transactions;
	}

}
