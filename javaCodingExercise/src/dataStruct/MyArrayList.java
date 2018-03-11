package test001;

public class MyArrayList<AnyType> implements Iterable<AnyType> {
	
	private static final int DEFAULT_CAPACITY = 10;
	
	private int theSize;
	
	private AnyType[] theItems;
	
	
	public MyArrayList() {
		this.clear();
	}
	
	
	public void clear() {
		this.theSize = 0;
		this.ensureCapacity(DEFAULT_CAPACITY);
	}
	
	public int size() {
		return this.theSize;
	}
	
	public boolean isEmpty() {
		return this.theSize == 0;
	}
	
	public void trimToSize() {
		this.ensureCapacity(this.theSize);
	}
	
	public AnyType get(int idx) {
		if (idx < 0 || idx > this.size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return this.theItems[idx];
	}
	
	public AnyType set(int idx, AnyType newVal) {
		if (idx < 0 || idx > this.size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		AnyType old = this.theItems[idx];
		this.theItems[idx] = newVal;
		return old;
	}
	
	public void ensureCapacity(int newCapacity) {
		if (newCapacity < this.theSize) {
			return ;
		}
		AnyType[] old = this.theItems;
		this.theItems = (AnyType []) new Object[newCapacity];
		for (int i = 0; i < this.size(); i++) {
			this.theItems[i] = old[i];
		}
	}
	
	public boolean add(AnyType val) {
		this.add(this.size(), val);
		return true;
	}
	
	public void add(int idx, AnyType val) {
		if (this.theItems.length == this.theSize) {
			this.ensureCapacity(this.size()*2+1);
		}
		for(int i = this.theSize; i > idx; i--) {
			this.theItems[i] = this.theItems[i-1];
		}
		this.theItems[idx] = val;
		this.theSize++;
	}
	
	public AnyType remove(int idx) {
		AnyType removeItem = this.theItems[idx];
		for(int i = idx; i < this.size()-1; i++) {
			this.theItems[i] = this.theItems[i+1];
		}
		this.theSize--;
		return removeItem;
	}
	
	public java.util.Iterator<AnyType> iterator() {
		return new ArrayListIterator();
	}
	
	
	private class ArrayListIterator implements java.util.Iterator<AnyType> {
		
		private int  current = 0;
		
		public boolean hasNext() {
			return this.current < MyArrayList.this.size();
		}
		
		public AnyType next() {
			if(!this.hasNext()) {
				throw new java.util.NoSuchElementException();
			}
			return MyArrayList.this.theItems[this.current++];
		}
		
		public void remove() {
			MyArrayList.this.remove(this.current--);
		}
	}
	
}
