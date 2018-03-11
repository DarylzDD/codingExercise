package j2eeServiceLocatorPattern;

public class ServiceLocatorPatternDemo {

	public static void main(String[] args) {
		
		Service service = ServiceLocator.getService("service1");
		service.execute();
		ServiceLocator.getService("service2");
		service.execute();
		ServiceLocator.getService("service1");
		service.execute();
		ServiceLocator.getService("service2");
		service.execute();
		
	}
	
}
