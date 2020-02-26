package dao;

import java.util.Arrays;
import java.util.List;

public class DishDao {

	public List<Dish> getAll() {
		// menu
		Dish d1 = new Dish("D01", true, 200, Type.OTHER);
		Dish d2 = new Dish("D02", false, 280, Type.MEAT);
		Dish d3 = new Dish("D03", false, 280, Type.MEAT);
		Dish d4 = new Dish("D04", false, 280, Type.FISH);
		Dish d5 = new Dish("D05", false, 230, Type.MEAT);
		return Arrays.asList(d1,d2,d3,d4, d5);
	}		
}
