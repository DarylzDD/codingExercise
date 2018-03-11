package j2eeInterceptingFilterPattern;

import java.util.*;

public class FilterChain {

	private List<Filter> filters;
	
	private Target target;
	
	
	public FilterChain() {
		this.filters = new ArrayList<Filter>();
	}
	
	public void addFilter(Filter filter) {
		this.filters.add(filter);
	}
	
	public void execute(String request) {
		for(Filter filter: this.filters) {
			filter.execute(request);
		}
		this.target.execute(request);
	}
	
	public void setTarget(Target target) {
		this.target = target;
	}
	
}
