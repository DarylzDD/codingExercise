package j2eeServiceLocatorPattern;

public class ServiceLocator {

	private static Cache cache;
	
	
	static {
		cache = new Cache();
	}

	
	public static Service getService(String jndiName) {
		
		Service service = cache.getService(jndiName);
		
		if (service != null) {
			return service;
		}
		
		InitialContext context = new InitialContext();
		Service serviceNew = context.lookup(jndiName);
		cache.addService(serviceNew);
		return serviceNew;
		
	}
	
}
