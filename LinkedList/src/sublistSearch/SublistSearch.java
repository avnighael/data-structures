package sublistSearch;

public class SublistSearch {
	private static Node head;
	private static class Node {
		Node next;
		int data;
		
		Node(int d) {
			data = d;
		}
	}
	
	/**
	 * Outputs whether list1 is present in list2
	 * @param node1 - head of list1
	 * @param node2 - head of list2
	 * @return - true if list1 is present in list2, false otherwise
	 */
	public boolean findSublist(Node node1, Node node2) {
		Node temp1 = node1;
		
		if(node1 == null && node2 == null) {
			return true;
		}
		
		if(node1 == null || node2 == null) {
			return false;
		}
		
		while(node2 != null && node1 != null) {
			if(node1.data == node2.data) {
				node1 = node1.next;
				node2 = node2.next;
			} else {
				node1 = temp1;
				if(temp1.data != node2.data) {
					node2 = node2.next;
				} 
			}
		}
		
		if(node1 == null) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Finds if list1 is present in list2 recursively
	 * @param node1 - head of list1
	 * @param node2 - head of list2
	 * @return - true if list1 is present in list2; false otherwise
	 */
	public boolean findSublistRecursively(Node node1, Node node2) {
		if(node1 == null && node2 == null) {
			return true;
		}
		
		Node head1 = node1;
		return findSublistUtil(node1, node2, head1);
	}
	
	/**
	 * Util to search for list1 in list2
	 * @param node1 - head of node1
	 * @param node2 - head of node2
	 * @param head1 - constant head of node 1 to move the pointer to head always
	 * when any element of list1 doesn't match list2
	 * @return - true if list1 is found in list2; false otherwise
	 */
	public boolean findSublistUtil(Node node1, Node node2, Node head1) {
		if(node1 == null) {
			return true;
		} 
		if(node2 == null) {
			return false;
		}
		
		if(node1.data == node2.data) {
			node1 = node1.next;
			node2 = node2.next;
		} else {
			node1 = head1;
			if(head1.data != node2.data) {
				node2 = node2.next;
			} 
		}
		
		return findSublistUtil(node1, node2, head1);
	}
	
	
	public static void main(String[] args) {
		Node a = new Node(1);
		a.next = new Node(2);
		a.next.next = new Node(3);
		a.next.next.next = new Node(4);
		a.next.next.next.next = new Node(5);
		
		Node b = new Node(1);
		b.next = new Node(2);
		b.next.next = new Node(2);
		b.next.next.next = new Node(1);
		b.next.next.next.next = new Node(2);
		b.next.next.next.next.next = new Node(3);
		b.next.next.next.next.next.next = new Node(4);
		b.next.next.next.next.next.next.next = new Node(6);
		
		SublistSearch search = new SublistSearch();
		System.out.println(search.findSublist(a, b)); //iteratively
		System.out.println(search.findSublistRecursively(a, b)); //recursively

	}

}
