package j2eeBusinessDelegatePattern;

public class EJBService implements BusinessService {

	public void doProcessing() {
		System.out.println("EJB service processing...");
	}
	
}
