package view;

import java.util.Comparator;
import java.util.List;

import service.AppleService;

public class Ex07_LambdaComposing {

	public static void main(String[] args) {
		AppleService appleService=new AppleService();
		List<Apple> inventory=appleService.getAll();
		//sort by contry,color
		inventory.sort(Comparator.comparing(Apple::getCountry,Comparator.reverseOrder()));
	}
}
