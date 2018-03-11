package observerPattern;

/*
 * http://www.runoob.com/design-pattern/observer-pattern.html
 * 
 * */


public class ObserverPatternDemo {

	public static void main(String[] args) {
		
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		
		subject.setState(15);
		System.out.println("\nSubject: "+subject.getState());
		
	}
	
}
