package leetcode.linkedList;

public class SolutionServiceImpl implements SolutionService {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		if (null == l1 && null == l2) {
			return new ListNode(0);
		} else if (null == l1) {
			return l2;
		} else if (null == l2) {
			return l1;
		} else {
			ListNode lst = null;
			ListNode pLstNow = null;
			ListNode pLstPre = null;
			boolean isFirst = true;
			int c = 0;
			while (null != l1 || null != l2) {
				// calc
//				System.out.println("l1: "+l1.val+", l2: "+l2.val);
				int sum = 0;
				if (null == l1) {
					sum = c + l2.val;
				} else if (null == l2) {
					sum = c + l1.val;
				} else {
					sum = c + l1.val + l2.val;
				}
				if (sum >= 10) {
					c = sum / 10;
					sum = sum % 10;
				} else {
					c = 0;
				}
//				System.out.println("sum: "+sum+", c: "+c);
				pLstNow = new ListNode(sum);
				// deal first
				if (isFirst) {
					lst = pLstNow;
					pLstPre = pLstNow;
					pLstNow = pLstPre.next;
					isFirst = false;
				} else {
					pLstPre.next = pLstNow;
					pLstNow = pLstPre.next;
					pLstPre = pLstPre.next;
				}
				if (null != l1) {
					l1 = l1.next;
				}
				if (null != l2) {
					l2 = l2.next;
				}
			}
			if (c > 0) {
				pLstNow = new ListNode(c);
				pLstPre.next = pLstNow;
			}
			return lst;
		}
	}
	
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode ret = null;
		ListNode pos = null;
		
		if (null != l1 && null != l2) {
			if (l1.val <= l2.val) {
				pos = l1;
				l1 = l1.next;
			} else {
				pos = l2;
				l2 = l2.next;
			}
			ret = pos;
		} else if (null != l1) {
			return l1;
		} else if (null != l2) {
			return l2;
		} else {
			return null;
		}
		while((null != l1) && (null != l2)) {
			if (l1.val <= l2.val) {
				pos.next = l1;
				l1 = l1.next;
			} else {
				pos.next = l2;
				l2 = l2.next;
			}
			pos = pos.next;
		}
		if (null != l1) {
			pos.next = l1;
		} else if (null != l2) {
			pos.next = l2;
		}
		
		return ret;
	}
	
	
	public ListNode deleteDuplicates(ListNode head) {
		
		if ((head == null) || (head.next == null)) {
			return head;
		}
		
		ListNode pNow = head.next;
		ListNode pPre = head;
		
		while(pNow != null) {
			if (pPre.val == pNow.val) {
				pPre.next = pNow.next;
			} else {
				pPre = pNow;
			}
			pNow = pNow.next;
		}
		
		return head;
	}
	
	
	public boolean hasCycle(ListNode head) {
		if (null == head) {
			return false;
		}
		if (null == head.next) {
			return false;
		}
		
		ListNode pLow = head.next;
		ListNode pFast = head.next.next;
		
		while((null != pLow) && (null != pFast)) {
			if (pLow == pFast) {
				return true;
			}
			pLow = pLow.next;
			pFast = pFast.next;
			if (null != pFast) {
				pFast = pFast.next;
			}
		}
		
		return false;
	}
	
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		
		
		
		return null;
	}
	
}
