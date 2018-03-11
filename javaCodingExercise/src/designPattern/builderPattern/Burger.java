package builderPattern;

public abstract class Burger implements Item {
	
	public Packing getPacking() {
		return new Wrapper();
	}
	
	public abstract float getPrice();
	
}
