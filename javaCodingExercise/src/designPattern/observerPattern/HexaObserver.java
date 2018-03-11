package observerPattern;

public class HexaObserver extends Observer {
	
	public HexaObserver(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	public void update() {
		System.out.println("Hexa observer: "+Integer.toHexString(this.subject.getState()));
	}
}
