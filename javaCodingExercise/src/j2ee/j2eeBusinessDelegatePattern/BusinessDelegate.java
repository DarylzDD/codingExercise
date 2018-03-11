package j2eeBusinessDelegatePattern;

public class BusinessDelegate {

	private BusinessLookup lookup = new BusinessLookup();
	private BusinessService service;
	private String serviceType;
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public void doTask() {
		this.service = lookup.getBusinessService(this.serviceType);
		this.service.doProcessing();
	}
	
}
