package commandPattern;

public class Stock {

	private String name = "abc";
	
	private int quantity = 100;
	
	
	public void buy() {
		System.out.println("buy: "+this.name+", quantity: "+this.quantity);
	}
	
	public void sell() {
		System.out.println("sell: "+this.name+", quantity: "+this.quantity);
	}
	
}
