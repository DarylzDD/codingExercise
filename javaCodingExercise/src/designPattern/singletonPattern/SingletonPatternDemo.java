package singletonPattern;

/*
 * http://www.runoob.com/design-pattern/singleton-pattern.html
 * 
 * */

public class SingletonPatternDemo {
	
	public static void main(String[] args) {
		
		SingletonNotLazyLoading singletonNotLazyLoading = SingletonNotLazyLoading.getInstance();
		
		SingletonLazyLoading singletonLazyLoading = SingletonLazyLoading.getInstance();
		
		singletonNotLazyLoading.show();
		
		singletonLazyLoading.show();
		
	}
	
}
