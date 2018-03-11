package chainResponsibilityPattern;

/*
 * http://www.runoob.com/design-pattern/chain-of-responsibility-pattern.html
 * 
 * */


public class ChainPatternDemo {
	
	private static AbstractLogger getChainLogger() {
		
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}

	public static void main(String[] args) {
		
		AbstractLogger logger = ChainPatternDemo.getChainLogger();
		
		logger.logMessage(AbstractLogger.INFO, "this is info...");
		logger.logMessage(AbstractLogger.DEBUG, "this is debug...");
		logger.logMessage(AbstractLogger.ERROR, "this is error...");
	}
}
