package factoryPattern;


/*
 * http://www.runoob.com/design-pattern/factory-pattern.html
 * 
 * */

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("rectangle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("square");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("circle");
		shape3.draw();
	}
}
