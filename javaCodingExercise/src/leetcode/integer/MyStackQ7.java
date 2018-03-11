package leetcode.integer;

public class MyStackQ7 {

	private static int STACK_SIZE = 10;
	
	private int[] stack;
	
	private int top;
	
	
	public MyStackQ7() {
		this.stack = new int[STACK_SIZE];
		this.top = -1;
	}
	
	
	public boolean push(int val) {
		if (this.top >= STACK_SIZE) {
			System.out.println("[warning] stack is full...");
			return false;
		}
		this.top++;
		this.stack[this.top] = val;
		this.printStack();
		return true;
	}
	
	public int pop() {
		if (this.top < 0) {
			System.out.println("[warning] stack is empty...");
			this.printStack();
			return 0;
		}
		int ret = this.stack[this.top];
		this.top--;
		this.printStack();
		return ret;
	}
	
	public boolean isEmpty() {
		if (this.top >= 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void printStack() {
		System.out.print("stack: bottom-top ");
		for(int i = 0; i <= this.top; i++) {
			System.out.print(this.stack[i]+", ");
		}
		System.out.println("\ntop:"+this.top);
	}
	
}
