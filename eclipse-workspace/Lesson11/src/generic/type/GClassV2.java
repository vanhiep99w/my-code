package generic.type;

import java.lang.reflect.Array;

public class GClassV2<T> {
	
	private T[] ts;
	
	@SuppressWarnings("unchecked")
	private GClassV2() {
		ts = (T[])Array.newInstance(Object.class, 0);
	}
	
	private T get(int i) {
		if (i < 0 || i > ts.length) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		return ts[i] ;
	}
	
	private int size() {
		return ts.length;
	}
	
	private void set(int i, T t) {
		if (i < 0 || i > ts.length) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		ts[i] = t;
	}
	
	@SuppressWarnings("unchecked")
	private boolean add(T t) {
		int size = ts.length;
		T[] temp = (T[])Array.newInstance(Object.class, size + 1);
		for (int i = 0 ; i < ts.length; i++) {
			temp[i] = ts[i];
		}
		temp[size] = t;
		this.ts = temp;
		return true;
	}
	
	private boolean contains(T ti) {
		for (T t: ts) {
			if (t.equals(ti)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		GClassV2<String> students = new GClassV2<>();
		students.add("A");
		students.add("B");
		students.add("C");
		students.set(0, "Tony");
		System.out.println("size: " + students.size());
		System.out.println("Phan tu 2: " + students.get(0));
		System.out.println("Contains: " + students.contains("B"));
		
	}
	
}