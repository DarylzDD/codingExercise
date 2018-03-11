package strategyPattern;

/*
 * http://www.runoob.com/design-pattern/strategy-pattern.html
 * 
 * */


public class StrategyPatternDemo {

	public static void main(String[] args) {
		
		Context context = new Context(new OperationAdd());
		System.out.println("context-add: "+context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubstract());
		System.out.println("context-sub: "+context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("context-mul: "+context.executeStrategy(10, 5));
		
	}
	
}
