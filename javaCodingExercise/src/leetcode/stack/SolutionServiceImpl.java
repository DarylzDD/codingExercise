package leetcode.stack;

public class SolutionServiceImpl implements SolutionService {
	
	public void Q155() {
		int val;
		MinStackQ155 minStack = new MinStackQ155();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		val = minStack.getMin();   //--> Returns -3.
		System.out.println("1.val="+val);
		minStack.pop();
		val = minStack.top();      //--> Returns 0.
		System.out.println("2.val="+val);
		val = minStack.getMin();   //--> Returns -2.
		System.out.println("3.val="+val);
	}

}
