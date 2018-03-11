package singletonPattern;

public class SingletonNotLazyLoading {
	
	private static SingletonNotLazyLoading instance = new SingletonNotLazyLoading();
	
	private SingletonNotLazyLoading() {}
	
	public static SingletonNotLazyLoading getInstance() {
		return instance;
	}
	
	public void show() {
		System.out.println("singleton not lazy loading show...");
	}
	
}
