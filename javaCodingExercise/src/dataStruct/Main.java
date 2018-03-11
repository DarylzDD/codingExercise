package test001;

import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("============ test Class MyList ===========");
		MyList myList = new MyList();
		myList.example();
		
		System.out.println("============ test Class MyArrayList ===========");
		MyArrayList myArrayList1 = new MyArrayList<Integer>();
		myArrayList1.add(new Integer(1));
		myArrayList1.add(new Integer(2));
		myArrayList1.add(new Integer(3));
		Iterator myArrayListIter1 = myArrayList1.iterator();
		while(myArrayListIter1.hasNext()) {
			System.out.println(myArrayListIter1.next());
		}
		System.out.println("-------------------------------");
		MyArrayList myArrayList2 = new MyArrayList<String>();
		myArrayList2.add(new String("aaaaaaaa"));
		myArrayList2.add(new String("bbbbbbbb"));
		myArrayList2.add(new String("cccccccc"));
		Iterator myArrayListIter2 = myArrayList2.iterator();
		while(myArrayListIter2.hasNext()) {
			System.out.println(myArrayListIter2.next());
		}
	}
}
