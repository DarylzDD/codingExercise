package test001;

public class MyLinkedList<AnyType> implements Iterable<AnyType> {
	
	private static class Node<AnyType> {
		public AnyType data;
		public Node<AnyType> prev;
		public Node<AnyType> next;
		
		public Node(AnyType data, Node<AnyType> prev, Node<AnyType> next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
	}
	
	
	private int theSize;
	
	private int modCount = 0;	// count change times
	
	private Node<AnyType> beginMarker;
	
	private Node<AnyType> endMarker;
	
	
	public MyLinkedList() {
		this.clear();
	}
	
	public void clear() {
		this.beginMarker = new Node<AnyType>(null, null, null);
		this.endMarker = new Node<AnyType>(null, this.beginMarker, null);
		
		this.beginMarker.next = this.endMarker;
		
		this.theSize = 0;
		this.modCount++;
	}
	
	public int size() {
		return this.theSize;
	}
	
	public boolean isEmpty() {
		return this.theSize == 0;
	}
	
	public void trimToSize() {}
	
	public AnyType get(int idx) {
		return this.getNode(idx).data;
	}
	
	public AnyType set(int idx, AnyType newVal) {
		Node<AnyType> p = this.getNode(idx);
		AnyType old = p.data;
		p.data = newVal;
		return old;
	}
	
	public boolean add(AnyType val) {
		this.add(val);
		return true;
	}
	
	public void add(int idx, AnyType val) {
		this.addBefore(this.getNode(idx), val);
	}
	
	public AnyType remove(int idx) {
		return this.remove(this.getNode(idx));
	}
	
	public java.util.Iterator<AnyType> iterator() {
		return new MyLinkedListIterator();
	}
	
	
	private void addBefore(Node<AnyType> p, AnyType x) {
		Node<AnyType> newNode = new Node<AnyType>(x, p.prev, p);
		newNode.prev.next = newNode;
		p.prev = newNode;
		this.theSize++;
		this.modCount++;
	}
	
	private Node<AnyType> getNode(int idx) {
		Node<AnyType> p;
		if (idx < 0 || idx > this.size()) {
			throw new IndexOutOfBoundsException();
		}
		if (idx < this.size()/2) {
			p = this.beginMarker.next;
			for(int i = 0; i < idx; i++) {
				p = p.next;
			}
		} else {
			p = this.endMarker;
			for(int i = this.size(); i > idx; i--) {
				p = p.prev;
			}
		}
		return p;
	}
	
	private AnyType remove(Node<AnyType> p) {
		p.next.prev = p.prev;
		p.prev.next = p.next;
		this.theSize--;
		this.modCount++;
		return p.data;
	}
	
	
	private class MyLinkedListIterator implements java.util.Iterator<AnyType> {
		
		private Node<AnyType> current = MyLinkedList.this.beginMarker.next;
		
		private int expectedModCount = MyLinkedList.this.modCount;
		
		private boolean okToRemove = false;
		
		
		public boolean hasNext() {
			return this.current != MyLinkedList.this.endMarker;
		}
		
		public AnyType next() {
			if (MyLinkedList.this.modCount != this.expectedModCount) {
				throw new java.util.ConcurrentModificationException();
			}
			if (!this.hasNext()) {
				throw new java.util.NoSuchElementException();
			}
			
			AnyType nextItem = this.current.data;
			this.current = this.current.next;
			this.okToRemove = true;
			return nextItem;
		}
		
		public void remove() {
			if (MyLinkedList.this.modCount != this.expectedModCount) {
				throw new java.util.ConcurrentModificationException();
			}
			if (!this.okToRemove) {
				throw new IllegalStateException();
			}
			
			MyLinkedList.this.remove(this.current.prev);
			this.okToRemove = true;
			this.expectedModCount++;
		}
	}
	
}
