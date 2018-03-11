package j2eeInterceptingFilterPattern;

public class FilterManager {

	private FilterChain chain;
	
	
	public FilterManager(Target target) {
		this.chain = new FilterChain();
		this.chain.setTarget(target);
	}
	
	public void setFilter(Filter filter) {
		this.chain.addFilter(filter);
	}
	
	public void filterRequest(String request) {
		this.chain.execute(request);
	}
	
}
