package j2eeServiceLocatorPattern;

import java.util.*;

public class Cache {

	private List<Service> services;
	
	
	public Cache() {
		this.services = new ArrayList<Service>();
	}
	
	public Service getService(String serviceName) {
		for(Service service: this.services) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("returning cached: "+serviceName);
				return service;
			}
		}
		return null;
	}
	
	public void addService(Service serviceNew) {
		boolean exists = false;
		for(Service service: this.services) {
			if (service.getName().equalsIgnoreCase(serviceNew.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			this.services.add(serviceNew);
		}
	}
	
}
