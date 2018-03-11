package chainResponsibilityPattern;

public class ConsoleLogger extends AbstractLogger {
	
	public ConsoleLogger(int level) {
		this.level = level;
	}

	protected void write(String string) {
		System.out.println("[CONSOLE]"+string);
	}
	
}
