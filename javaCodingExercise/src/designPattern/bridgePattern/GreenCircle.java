package bridgePattern;

public class GreenCircle implements DrawAPI {

	public void drawCircle(int x, int y, int radius) {
		System.out.println("draw green circle, pos: ("+x+", "+y+"), radius: "+radius);
	}
	
}
