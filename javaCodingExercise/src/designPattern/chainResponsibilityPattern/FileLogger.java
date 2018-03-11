package chainResponsibilityPattern;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}
	
	protected void write(String string) {
		System.out.println("[FILE]"+string);
	}
}
