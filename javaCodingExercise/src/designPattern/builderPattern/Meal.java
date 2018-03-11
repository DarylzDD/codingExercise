package builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items = new ArrayList<Item>();
	
	public void addItems(Item item) {
		this.items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for(Item item: this.items) {
			cost += item.getPrice();
		}
		return cost;
	}
	
	public void showItems() {
		for(Item item: this.items) {
			System.out.println("name: "+item.getName());
			System.out.println("pack: "+item.getPacking().getPack());
			System.out.println("price: "+item.getPrice());
		}
	}
}
