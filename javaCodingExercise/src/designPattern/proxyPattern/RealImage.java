package proxyPattern;

public class RealImage implements Image {

	private String fileName;
	
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		this.loadFromDisk(fileName);
	}
	
	public void display() {
		System.out.println("display..."+this.fileName);
	}
	
	public void loadFromDisk(String fileName) {
		System.out.println("loading..."+fileName);
	}
	
}
