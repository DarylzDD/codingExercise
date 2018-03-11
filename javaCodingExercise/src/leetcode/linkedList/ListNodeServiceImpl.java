package leetcode.linkedList;

public class ListNodeServiceImpl implements ListNodeService {

	public ListNode createList(int[] arr) {
		if (0 == arr.length) {
			return null;
		}
		ListNode lst = null;
		ListNode lstNow = null;
		ListNode lstPre = null;
		int i = 0;
		do {
			lstNow = new ListNode(arr[i]);
			if(0 == i) {
				lst = lstNow;
				lstPre = lstNow;
				lstNow = lstPre.next;
			} else {
				lstPre.next = lstNow;
				lstNow = lstPre.next;
				lstPre = lstPre.next;
			}
			i++;
		}
		while (i < arr.length);
		return lst;
	}
	
	public void printList(ListNode list) {
		boolean isFirst = true; 
		while(null != list) {
			if (!isFirst) {
				System.out.print("->");
			} else {
				isFirst = false;
			}
			System.out.print(list.val);
			list = list.next;
		}
		System.out.println("");
	}
	
}
