package j2eeCompositeEntityPattern;

public class CompositeEntityPatternDemo {

	public static void main(String[] args) {
		
		Client client = new Client();
		
		client.setData("aaaaa", "bbbb");
		
		client.printData();
		
	}
	
}
