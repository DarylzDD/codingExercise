package j2eeBusinessDelegatePattern;

public class JMSService implements BusinessService {

	public void doProcessing() {
		System.out.println("JMS Service processing...");
	}
	
}
