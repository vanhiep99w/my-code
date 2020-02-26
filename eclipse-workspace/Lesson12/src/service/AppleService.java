package service;

import java.util.List;

import dao.AppleDao;
import view.Apple;

public class AppleService {

	private AppleDao appleDao;
	
	public AppleService() {
		appleDao=new AppleDao();
	}
	public List<Apple> getAll(){
		return appleDao.getAll();
	}
}
