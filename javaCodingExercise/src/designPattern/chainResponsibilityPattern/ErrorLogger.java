package chainResponsibilityPattern;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}
	
	protected void write(String string) {
		System.out.println("[ERROR]"+string);
	}
	
}
