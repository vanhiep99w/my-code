package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.Set;
import java.util.TreeMap;

public class Ex01 {

	public static void main(String[] args) {
		Map<String, Integer> budget = new HashMap<String, Integer>();
		budget.put("Breakfast", 7);
		budget.put("coffee", 30);
		budget.put("Lunch", 15);
		budget.put("adsff", 14);
		System.out.println(budget.get("coffee"));
		budget.putIfAbsent("coffee", 70);
		budget.getOrDefault("bbbb", 1000);
		budget.replaceAll((key,value)-> value.intValue()>20 ? 20:value);

		//budget.
		//sort by key
		
	}

	public static void loop(Map<String, Integer> budget) {
		// loop by key
		Set<String> keys = budget.keySet();
		for (String string : keys) {
			System.out.println(string + " : " + budget.get(string));
		}

		// loop by value
		Collection<Integer> collection = budget.values();

		for (Integer integer : collection) {
			System.out.println(integer + " ");
		}

		// loop by entry
		Set<Entry<String, Integer>> entries = budget.entrySet();
		
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry);
		}
	}
}