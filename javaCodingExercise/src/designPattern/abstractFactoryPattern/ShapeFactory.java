package abstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {
	Color getColor(String colorType) {
		return null;
	}
	
	public Shape getShape(String shapeType) {
		if(null == shapeType) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("rectangle")) {
			return new ShapeRectangle();
		} else if(shapeType.equalsIgnoreCase("circle")) {
			return new ShapeCircle();
		} else if(shapeType.equalsIgnoreCase("square")) {
			return new ShapeSquare();
		}
		return null;
	}
}
