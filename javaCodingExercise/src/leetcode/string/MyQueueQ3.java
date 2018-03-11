package leetcode.string;

public class MyQueueQ3 {

	private ListNode listHead;
	
	private ListNode listTail;
	
	private int len;
	
	private int lenMaxHistory;
	
	
	public MyQueueQ3() {
		this.listHead = null;
		this.listTail = null;
		this.len = 0;
		this.lenMaxHistory = 0;
	}
	
	public MyQueueQ3(char ch) {
		this.listHead = new ListNode(ch);
		this.listTail = listHead;
		this.len = 1;
		this.lenMaxHistory = 1;
	}
	
	
	public void clear() {
		this.listHead = null;
		this.listTail = null;
		this.len = 0;
	}
	
	public boolean put(char ch) {
		if (null == this.listHead && null == this.listTail) {
//			System.out.println("1111111111.");
			this.listHead = new ListNode(ch);
			this.listTail = this.listHead;
			this.lenOptAdd();
			return true;
		} else if (null != this.listHead && null != this.listTail) {
//			System.out.println("2222222222.");
			ListNode newNode = new ListNode(ch);
			this.listTail.next = newNode;
			this.listTail = this.listTail.next;
			this.lenOptAdd();
			return true;
		} else {
//			System.out.println("333333333.");
			return false;
		}
	}
	
	public char take() {
		char ch = '\0';
		if (null != this.listHead && null != this.listTail) {
			ch = this.listHead.val;
			this.listHead = this.listHead.next;
			this.lenOptSub();
		}
		return ch;
	}
	
	public void takeQueue(char ch) {
		ListNode pos = this.listHead;
		int count = 0;
		while(pos != null) {
			count++;
			if (ch == pos.val) {
//				System.out.println("[Hit]"+ch+"("+count+")");
				while (this.listHead.val != ch) {
					this.take();
				}
				this.take();
//				this.listHead = pos.next;
//				this.lenOptSub(count);
				if(this.listHead == null) {
					this.listTail = null;
				}
//				System.out.println("[Hit]"+this.listHead+", "+this.listTail);
				break;
			}
			pos = pos.next;
		}
	}
	
	public int getLenMaxHistory() {
		return this.lenMaxHistory;
	}
	
	public void printList() {
		ListNode pos = this.listHead;
		System.out.print("list:");
		while(pos != null) {
			System.out.print(pos.val);
			pos = pos.next;
		}
		System.out.println("\nlen:"+this.len+", lenMax:"+this.lenMaxHistory);
	}
	
	
	private void lenOptAdd() {
		this.len++;
		if (this.len > this.lenMaxHistory) {
			this.lenMaxHistory = len;
		}
	}
	
	private void lenOptSub() {
		this.len--;
	}
	
	private void lenOptSub(int count) {
		this.len -= count;
	}
	
}
