package view;

import java.util.List;

import entities.ItemGroup;
import service.ItemGroupService;

public class ItemGroupView {

	public static void main(String[] args) {
		ItemGroupService itemGroupService = new ItemGroupService();
		//cau 5
		List<ItemGroup> itemGroups = itemGroupService.getItemGroups("2019-11-23");
		itemGroups.forEach(System.out::println);
		//cau 6 
		System.out.println(itemGroupService.getItemGroups(1));
	}
}
