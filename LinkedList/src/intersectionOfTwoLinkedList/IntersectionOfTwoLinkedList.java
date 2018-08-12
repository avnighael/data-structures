package intersectionOfTwoLinkedList;

public class IntersectionOfTwoLinkedList {
	
	 private static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	 }
	 
	 public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode curA = headA, curB = headB;
	        
	        int linkedListASize = getSize(curA);
	        int linkedListBSize = getSize(curB);
	        
	        if(linkedListASize > linkedListBSize) {
	        	int diffA = linkedListASize - linkedListBSize;

	        	while(diffA > 0) {
	        		curA = curA.next;
	        		diffA--;
	        	}
	        } else if (linkedListASize < linkedListBSize) {
	        	int diffB = linkedListBSize - linkedListASize;
	        	
	        	while(diffB > 0) {
	        		curB = curB.next;
	        		diffB--;
	        	}
	        }
	        
	        int min = Math.min(linkedListASize, linkedListBSize);
	        int equalCount = 0;
	        ListNode resultNode = new ListNode(0);
	        
	        while(min > 0) {
	        	if(curA.val != curB.val) {
	        		equalCount = 0;
	        		if(curA.next.val == curB.next.val) {
	        			resultNode = curA.next;
	        		}
	        	} else {
	        		equalCount += 1;
	        	}
	        	curA = curA.next;
        		curB = curB.next;
        		min --;
	        }
	        return equalCount != 0 ? resultNode : null;
	    }
	 
	 public static int getSize(ListNode head) {
		 int size = 0;
		 while(head != null) {
	            size +=1;
	            head = head.next;
	        }
		 return size;
	 }


	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		a.next = new ListNode(2);
		a.next.next = new ListNode(3);
		a.next.next.next = new ListNode(4);
		a.next.next.next.next = new ListNode(5);
		
		ListNode b = new ListNode(0);
		b.next = new ListNode(6);
		b.next.next = new ListNode(7);
		b.next.next.next = new ListNode(8);
		b.next.next.next.next = new ListNode(3);
		b.next.next.next.next.next = new ListNode(4);
		b.next.next.next.next.next.next = new ListNode(6);
		
		ListNode intersectingPoint = getIntersectionNode(a,b);
		System.out.println(intersectingPoint.val);

	}

}
