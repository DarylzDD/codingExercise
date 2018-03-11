package j2eeServiceLocatorPattern;

public class InitialContext {

	public Service lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("service1")) {
			return new Service1();
		} else {
			return new Service2();
		}
	}
	
}
