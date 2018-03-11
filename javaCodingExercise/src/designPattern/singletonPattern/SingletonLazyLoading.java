package singletonPattern;

public class SingletonLazyLoading {
	
	private static class SingletonHolder {
		private static final SingletonLazyLoading INSTANCE = new SingletonLazyLoading();
	}
	
	private SingletonLazyLoading() {}
	
	public static final SingletonLazyLoading getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	public void show() {
		System.out.println("singleton lazy loading show...");
	}
}
