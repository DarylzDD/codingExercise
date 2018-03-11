package abstractFactoryPattern;

/*
 * http://www.runoob.com/design-pattern/abstract-factory-pattern.html
 * 
 * */


public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		
		FactoryProducer factoryProducer = new FactoryProducer();
		
		AbstractFactory factoryColor = factoryProducer.getFactory("color");
		
		AbstractFactory factoryShape = factoryProducer.getFactory("shape");
		
		Color color1 = factoryColor.getColor("red");
		Color color2 = factoryColor.getColor("blue");
		Color color3 = factoryColor.getColor("green");
		
		Shape shape1 = factoryShape.getShape("rectangle");
		Shape shape2 = factoryShape.getShape("circle");
		Shape shape3 = factoryShape.getShape("square");
		
		color1.fill();
		color2.fill();
		color3.fill();
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
	}
}
