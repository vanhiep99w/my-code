package dao;

import java.util.Objects;

public class Dish {

	private String name;
	private boolean vegeterian;
	private int calories;
	private Type type;

	public Dish() {
	}

	public Dish(String name, boolean vegeterian, int calories, Type type) {
		this.name = name;
		this.vegeterian = vegeterian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegeterian() {
		return vegeterian;
	}

	public void setVegeterian(boolean vegeterian) {
		this.vegeterian = vegeterian;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o == null || !(o instanceof Dish)) {
			return false;
		}
		final Dish dish = (Dish) o;
		return Objects.equals(dish.getName(), getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName());
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegeterian=" + vegeterian + ", calories=" + calories + ", type=" + type + "]";
	}

}

public enum Type {
	MEAT, FISH, OTHER
};
