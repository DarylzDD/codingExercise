package leetcode.linkedList;

public interface SolutionService {

	//2.Add Two Numbers
	public ListNode addTwoNumbers(ListNode l1, ListNode l2);
	
	//21.Merge Two Sorted Lists
	public ListNode mergeTwoLists(ListNode l1, ListNode l2);
	
	//83.Remove Duplicates from Sorted List
	public ListNode deleteDuplicates(ListNode head);
	
	//141.Linked List Cycle
	public boolean hasCycle(ListNode head);
	
	//160.Intersection of Two Linked Lists
	public ListNode getIntersectionNode(ListNode headA, ListNode headB);
	
}
