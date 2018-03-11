package j2eeBusinessDelegatePattern;

public class Client {

	private BusinessDelegate service;
	
	public Client(BusinessDelegate businessDelegate) {
		this.service = businessDelegate;
	}
	
	public void doTask() {
		this.service.doTask();
	}
	
}
