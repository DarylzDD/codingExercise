package j2eeServiceLocatorPattern;

public class Service1 implements Service {

	public String getName() {
		return "service1";
	}
	
	public void execute() {
		System.out.println("Service1 execute...");
	}
	
}
