package leetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class MinStackQ155 {
	
	/** initialize your data structure here. */
	private List<Integer> stack = null;
	private List<Integer> stackMin = null;
	
    public MinStackQ155() {
    	this.stack = new ArrayList<Integer>();
    	this.stackMin = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        this.stack.add(x);
        if((this.stackMin.size() == 0) || (x <= this.stackMin.get(this.stackMin.size()-1))) {
        	this.stackMin.add(x);
        }
    }
    
    public void pop() {
        Integer val = this.stack.remove(this.stack.size()-1);
        if(val.equals(this.stackMin.get(this.stackMin.size()-1))) {
        	this.stackMin.remove(this.stackMin.size()-1);
        }
    }
    
    public int top() {
        return this.stack.get(this.stack.size()-1);
    }
    
    public int getMin() {
        return this.stackMin.get(this.stackMin.size()-1);
    }

}
