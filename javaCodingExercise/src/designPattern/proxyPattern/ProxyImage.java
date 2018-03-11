package proxyPattern;

public class ProxyImage implements Image {

	private String fileName;
	
	private RealImage realImage;
	
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	public void display() {
		if(null == this.realImage) {
			this.realImage = new RealImage(fileName);
		}
		this.realImage.display();
	}
	
}
