package j2eeInterceptingFilterPattern;

public class DebugFilter implements Filter {

	public void execute(String request) {
		System.out.println("Debug filter pass...request: "+request);
	}
	
}
