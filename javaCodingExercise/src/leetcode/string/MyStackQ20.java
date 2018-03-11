package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class MyStackQ20 {

	private List<String> stackArr;
	
	private int top;
	
	private int len;
	
	
	public MyStackQ20() {
		this.stackArr = new ArrayList<String>();
		this.top = -1;
		this.len = 0;
	}
	
	public void push(String s) {
		this.stackArr.add(s);
		this.top++;
		this.len++;
	}
	
	public String pop() {
		if (this.isEmpty()) {
			return null;
		}
		String ret = this.stackArr.remove(this.top);
		this.top--;
		this.len--;
		return ret;
	}
	
	public boolean isEmpty() {
//		System.out.println("stack size: "+this.stackArr.size()+", len: "+this.len);
		if (this.stackArr.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getTop() {
		if (this.stackArr.isEmpty()) {
			return null;
		}
		return this.stackArr.get(this.top);
	}
	
	
	public void printStack() {
		System.out.print("stack: ");
		for(int i = 0; i < this.stackArr.size(); i++) {
			System.out.print(this.stackArr.get(i)+", ");
		}
		System.out.println("size: "+this.stackArr.size()+", len: "+this.len);
	}
}
