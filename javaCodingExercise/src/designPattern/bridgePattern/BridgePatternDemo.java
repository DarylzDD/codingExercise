package bridgePattern;

public class BridgePatternDemo {

	public static void main(String[] args) {
		
		Shape redCircle = new Circle(1, 2, 3, new RedCircle());
		Shape greenCircle = new Circle(4, 5, 6, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
		
	}
	
}
