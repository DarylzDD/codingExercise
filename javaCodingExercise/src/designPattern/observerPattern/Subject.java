package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	private int state;
	
	
	public int getState() {
		return this.state;
	}
	
	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}
	
}
