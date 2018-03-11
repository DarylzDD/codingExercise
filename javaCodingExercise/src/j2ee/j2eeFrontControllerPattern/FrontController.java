package j2eeFrontControllerPattern;

public class FrontController {

	private Dispatcher dispatcher;
	
	
	public FrontController() {
		this.dispatcher = new Dispatcher();
	}
	
	public boolean isAuthenticUser() {
		System.out.println("authentic pass...");
		return true;
	}
	
	public void trackRequest(String request) {
		System.out.println("trace page request...");
	}
	
	public void dispatchRequest(String request) {
		
		this.trackRequest(request);
		
		if (this.isAuthenticUser()) {
			this.dispatcher.dispatcher(request);
		}
		
	}
	
}
