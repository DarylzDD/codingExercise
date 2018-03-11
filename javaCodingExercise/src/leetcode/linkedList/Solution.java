package leetcode.linkedList;

public class Solution {

	public static void main(String[] args) {
		
		ListNodeService listNodeService = new ListNodeServiceImpl();
		
		SolutionService solutionService = new SolutionServiceImpl();
		
		//Q2
		// create a test list
//		int[] arr1 = {2, 4, 3};
//		ListNode lst1 = listNodeService.createList(arr1);
//		int[] arr2 = {5, 6, 4};
//		ListNode lst2 = listNodeService.createList(arr2);
//		// print test list
//		System.out.println("lst1:");
//		listNodeService.printList(lst1);
//		System.out.println("lst2:");
//		listNodeService.printList(lst2);
//		// solution
//		ListNode lst = solutionService.addTwoNumbers(lst1, lst2);
//		System.out.println("lst:");
//		listNodeService.printList(lst);
		
		//Q21
		// create test lists
//		int[] arr1 = {1,2,4};
//		ListNode lst1 = listNodeService.createList(arr1);
//		int[] arr2 = {1,3,4};
//		ListNode lst2 = listNodeService.createList(arr2);
//		// solution
//		ListNode lst = solutionService.mergeTwoLists(lst1, lst2);
//		System.out.println("lst:");
//		listNodeService.printList(lst);
		
		//Q83
		// create test lists
//		int[] arr = {1,1,2};
//		int[] arr = {1};
//		int[] arr = {1,1,2,3,4,5,6,6,7,7,8,8,8,8,8,9,10};
//		ListNode lst = listNodeService.createList(arr);
//		System.out.println("lst:");
//		listNodeService.printList(lst);
//		// solution
//		ListNode lstRet = solutionService.deleteDuplicates(lst);
//		System.out.println("lstRet:");
//		listNodeService.printList(lstRet);
		
		//Q141
		// create test lists
//		int[] arr = {1,1,2,3,4};
//		ListNode lst = listNodeService.createList(arr);
//		System.out.println("lst:");
//		listNodeService.printList(lst);
//		// solution
//		boolean ret = solutionService.hasCycle(lst);
//		System.out.println("ret:"+ret);
		
		//Q160
		// create test lists
		int[] arr1 = {1,2,3,4,5,6};
		ListNode lst1 = listNodeService.createList(arr1);
		int[] arr2 = {6,5,4,3,2,1};
		ListNode lst2 = listNodeService.createList(arr2);
		System.out.println("lst1:");
		listNodeService.printList(lst1);
		System.out.println("lst2:");
		listNodeService.printList(lst2);
		// solution
		ListNode ret = solutionService.getIntersectionNode(lst1, lst2);
		System.out.println("ret:"+ret);
	}
	
}
