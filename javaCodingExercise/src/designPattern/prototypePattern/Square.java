package prototypePattern;

public class Square extends Shape {

	public Square() {
		this.type = "square";
	}
	
	public void draw() {
		System.out.println("square draw...");
	}
}
