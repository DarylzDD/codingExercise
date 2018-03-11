package observerPattern;

public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	public void update() {
		System.out.println("Binary observer: "+Integer.toBinaryString(this.subject.getState()));
	}
}
