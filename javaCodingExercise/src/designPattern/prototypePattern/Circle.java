package prototypePattern;

public class Circle extends Shape {

	public Circle() {
		this.type = "circle";
	}
	
	public void draw() {
		System.out.println("circle draw...");
	}
}
