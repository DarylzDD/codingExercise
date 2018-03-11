package chainResponsibilityPattern;

public abstract class AbstractLogger {
	
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger abstractLogger) {
		this.nextLogger = abstractLogger;
	}
	
	public void logMessage(int level, String string) {
		if(this.level <= level) {
			//System.out.println("this.level:"+this.level+", level:"+level);
			this.write(string);
		}
		if(this.nextLogger != null) {
			this.nextLogger.logMessage(level, string);
		}
	}
	
	protected abstract void write(String string);
	
}
