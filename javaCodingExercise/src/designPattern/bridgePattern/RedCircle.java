package bridgePattern;

public class RedCircle implements DrawAPI {

	public void drawCircle(int x, int y, int radius) {
		System.out.println("draw red circle, pos: ("+x+", "+y+"), radius: "+radius); 
	}
	
}
