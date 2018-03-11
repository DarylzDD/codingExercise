package j2eeInterceptingFilterPattern;

public class AuthenticationFilter implements Filter {

	public void execute(String request) {
		System.out.println("Authentication filter pass...request: "+request);
	}
	
}
