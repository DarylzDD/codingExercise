package test001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyList {
	public static void printList(List<Integer> lst) {
		for( int i = 0; i < lst.size(); i++ ) {
			System.out.println(lst.get(i));
		}
	}
	
	public static void removeEvens(List<Integer> lst) {
		Iterator<Integer> itr = lst.iterator();
		while(itr.hasNext()) {
			if (itr.next()%2 == 0) {
				itr.remove();
			}
		}
	}
	
	public static void example() {
		ArrayList<Integer> aLst = new ArrayList<Integer>();
		aLst.add(new Integer(1));
		aLst.add(new Integer(2));
		aLst.add(new Integer(3));
		
		printList(aLst);
		removeEvens(aLst);
		System.out.println("------------");
		printList(aLst);
		
		System.out.println("--------------------------------");
		
		LinkedList<Integer> lLst = new LinkedList<Integer>();
		lLst.add(new Integer(1));
		lLst.add(new Integer(2));
		lLst.add(new Integer(3));
		
		printList(lLst);
		removeEvens(lLst);
		System.out.println("------------");
		printList(lLst);
	}
}
