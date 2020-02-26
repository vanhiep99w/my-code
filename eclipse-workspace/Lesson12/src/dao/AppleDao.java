package dao;

import java.util.Arrays;
import java.util.List;

import view.Apple;

public class AppleDao {

	public List<Apple> getAll(){
		return Arrays.asList(new Apple("vang", "vn", "12"),
				new Apple("do", "cn", "14")
				,new Apple("tim", "usa", "22"),
				new Apple("vang", "tl", "1"),
				new Apple("xanh", "l", "14"),
				new Apple("xanh", "vn", "14"));
	}
}
