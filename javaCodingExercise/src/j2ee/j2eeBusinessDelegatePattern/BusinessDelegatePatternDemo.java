package j2eeBusinessDelegatePattern;

public class BusinessDelegatePatternDemo {

	public static void main(String[] args) {
		
		BusinessDelegate business = new BusinessDelegate();
		
		Client client = new Client(business);
		
		business.setServiceType("EJB");
		client.doTask();
		
		business.setServiceType("JMS");
		client.doTask();
		
	}
	
}
