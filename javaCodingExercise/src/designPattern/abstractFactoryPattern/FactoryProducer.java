package abstractFactoryPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryType) {
		if(null == factoryType) {
			return null;
		}
		if(factoryType.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if(factoryType.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
