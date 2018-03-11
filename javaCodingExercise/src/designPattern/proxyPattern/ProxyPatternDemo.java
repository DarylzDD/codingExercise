package proxyPattern;

/*
 * http://www.runoob.com/design-pattern/proxy-pattern.html
 * 
 * */


public class ProxyPatternDemo {

	public static void main(String[] args) {
		
		ProxyImage image = new ProxyImage("/test/image.jpg");
		
		image.display();
		
	}
	
}
