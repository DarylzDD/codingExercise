package builderPattern;

public abstract class ColdDrink implements Item {

	public Packing getPacking() {
		return new Bottle();
	}
	
	public abstract float getPrice();
	
}
