package abstractFactoryPattern;

public class ColorFactory extends AbstractFactory {
	
	public Color getColor(String colorType) {
		if(null == colorType) {
			return null;
		}
		if(colorType.equalsIgnoreCase("red")) {
			return new ColorRed();
		} else if(colorType.equalsIgnoreCase("blue")) {
			return new ColorBlue();
		} else if(colorType.equalsIgnoreCase("green")) {
			return new ColorGreen();
		}
		return null;
	}
	
	Shape getShape(String shapeType) {
		return null;
	}
}
