package service;

import java.util.List;

import dao.ItemGroupDao;
import entities.ItemGroup;

public class ItemGroupService {
	private ItemGroupDao itemGroupDao = null;

	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}

	public List<ItemGroup> getItemGroups( String dayOfSale) {
		return itemGroupDao.getItemGroups(dayOfSale);
	}
	
	public boolean getItemGroups(int idBill ) {
		return (itemGroupDao.getItemGroups(idBill)==1);
	}
	
	
}
