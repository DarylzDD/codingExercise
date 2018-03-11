package leetcode.string;

public class MyArrQueue {

private static int QUEUE_SIZE = 20;
	
	private char[] queue;
	
	private int head;
	
	private int tail;
	
	private int len;
	
	
	public MyArrQueue() {
		this.queue = new char[QUEUE_SIZE];
		this.head = 0;
		this.tail = -1;
		this.len = 0;
	}
	
	
	public void clear() {
		this.head = 0;
		this.tail = -1;
		this.len = 0;
	}
	
	public boolean put(char ch) {
		if (len >= QUEUE_SIZE) {
			System.out.println("[warning] queue is full...");
			return false;
		}
		this.tail = (this.tail + 1) % QUEUE_SIZE;
		this.queue[this.tail] = ch;
		len++;
		return true;
	}
	
	public char take() {
		char ch = '\0';
		if (len > 0) {
			ch = this.queue[this.head];
			this.head = (this.head + 1) % QUEUE_SIZE;
			len--;
		}
		return ch;
	}
	
	
	public void printList() {
		System.out.print("queue:");
		if (this.head < this.tail) {
			for(int i = this.head; i <= this.tail; i++) {
				System.out.print(this.queue[i]);
			}
		} else {
			for(int i = this.head; i < QUEUE_SIZE; i++) {
				System.out.print(this.queue[i]);
			}
			for(int i = 0; i <= this.tail; i++) {
				System.out.print(this.queue[i]);
			}
		}
		System.out.println("\nlen:"+this.len);
		System.out.print("queue arr:");
		for(int i = 0; i < QUEUE_SIZE; i++) {
			System.out.print(this.queue[i]);
		}
		System.out.println("");
	}
	
}
