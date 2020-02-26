package homework2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Ex05 {

	public static void main(String[] args) {
		Map<String, Integer> arr=mockData();
		arr.forEach((k,v)->System.out.println(k+"="+v));
		
		//liet ke thong tin cac khoan chi lon hon 500n
		System.out.println("Cac chi tieu lon hon 500n");
		arr.forEach((k,v)->{
			if(v>500000) {
				System.out.println(k+"="+v);
			}
		});
		
		//Sap xep cac khoan chi tieu theo tang dan cua key
		System.out.println("sap xep khoan chi tieu");
		Map<String, Integer> result1=arr.entrySet().stream().sorted(Entry.
				comparingByKey()).collect(Collectors.
						toMap(Entry::getKey, Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));
		result1.forEach((k,v)->System.out.println(k+"="+v));
		//Sắp xếp các khoản chi theo thứ tự giảm dần bởi số tiền – value và in ra.
		System.out.println("sap xep theo thu tu giam dan cua co tien");
		Map<String, Integer> result2=arr.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.
						toMap(Entry::getKey, Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));
		result2.forEach((k,v)->System.out.println(k+"="+v));
	}
	public static Map<String, Integer> mockData(){
		Map<String, Integer> arr=new HashMap<String, Integer>();
		arr.put("an toi", 60000);
		arr.put("an trua", 20000);
		arr.put("an sang", 20000);
		arr.put("mua sach", 70000);
		arr.put("mua quat", 1000000);
		return arr;
	}
}
