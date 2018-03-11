package prototypePattern;

/*
 * http://www.runoob.com/design-pattern/prototype-pattern.html
 * 
 * */


public class PrototypPatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
//		Shape shape1 = (Shape) ShapeCache.getShape("1");
//		shape1.draw();
//		Shape shape2 = (Shape) ShapeCache.getShape("2");
//		shape2.draw();
//		Shape shape3 = (Shape) ShapeCache.getShape("3");
//		shape3.draw();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
	    System.out.println("Shape : " + clonedShape.getType());
	    clonedShape.draw();

	    Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	    System.out.println("Shape : " + clonedShape2.getType());
	    clonedShape2.draw();

	    Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	    System.out.println("Shape : " + clonedShape3.getType());
	    clonedShape3.draw();
	}
}
