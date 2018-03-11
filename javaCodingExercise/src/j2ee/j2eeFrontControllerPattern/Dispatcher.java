package j2eeFrontControllerPattern;

public class Dispatcher {

	private StudentView studentView;
	
	private HomeView homeView;
	
	
	public Dispatcher() {
		this.studentView = new StudentView();
		this.homeView = new HomeView();
	}
	
	public void dispatcher(String request) {
		if (request.equalsIgnoreCase("home")) {
			this.homeView.show();
		} else {
			this.studentView.show();
		}
	}
	
}
