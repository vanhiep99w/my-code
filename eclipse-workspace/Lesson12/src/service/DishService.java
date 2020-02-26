package service;

import java.util.List;

import dao.Dish;
import dao.DishDao;

public class DishService {

	private DishDao dishDao;
	public DishService() {
		dishDao=new DishDao();
	}
	public List<Dish> getAll(){
		return dishDao.getAll();
	}
}
