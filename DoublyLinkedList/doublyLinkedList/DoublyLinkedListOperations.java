package doublyLinkedList;


public class DoublyLinkedListOperations {
	static Node head;
	
	public static class Node {
		Node prev;
		Node next;
		int data;
		
		// Constructor to create a new node
        // next and prev is by default initialized as null
		Node(int d) {
			data = d;
		}
	}
	
	/**
	 * Prints a doubly linked list
	 */	
	public static void println(Node head) {
		while(head !=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	/**
	 * Insets a new node at the beginning of the doubly linked list
	 * @param data
	 */
	public static void insertAtBeginning(int data) {	
		Node newNode = new Node(data);
		
		newNode.next = head;
		newNode.prev = null;
		
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;	
	}
	
	/**
	 * Inserts a new node at the end of doubly linked list
	 * @param data
	 */
	public static void insertAtEnd(int data) {
		Node newNode = new Node(data);
		Node h = head;
		
		newNode.next = null;
		
		while(h.next != null) {
			h = h.next;
		}
		
		h.next = newNode;
		newNode.prev = h;
	}
	
	/**
	 * Given a node as previous node, inserts a new node
	 * after given node
	 * @param prev - node after the new node needs to be inserted
	 * @param data - data of new node
	 */
	public static void insertAfter(Node prev, int data) {
		Node newNode = new Node(data);
		Node h = head;
		
		while(h != prev) {
			h = h.next;
		}
		
		newNode.next = h.next;
		h.next = newNode;
		newNode.prev = h;
	}
	
	/**
	 * 
	 * @param next - node before the new node needs to be inserted
	 * @param data - data of new node
	 */
	public static void insertBefore(Node next, int data) {
		Node newNode = new Node(data);
		Node h = head;
		
		while(h.next != next) {
			h = h.next;
		}
		
		newNode.next = next;
		newNode.prev = h;
		h.next = newNode;
		
	}
	
	public static void deleteNode(Node nodeToDelete) {
		Node h = head;
		
		if(h == null || nodeToDelete == null) {
			return;
		}
		
		if(h == nodeToDelete) {
			h = h.next;
			return;
		}
		
		if(nodeToDelete.next != null) {
			nodeToDelete.next.prev = nodeToDelete.prev;
		}
		
		if(nodeToDelete.prev != null) {
			nodeToDelete.prev.next = nodeToDelete.next;
		}
		return;
		
	}
	
	/**
	 * Wrapper for reverseRecursively
	 * @return head of the reversed doubly linked list
	 */
	public static Node reverseRecursively() {
		return reverseRecursivelyUtil(head, null);
	}
	
	/**
	 * Reverses the doubly linked list recursively
	 * @param cur - current head node
	 * @param rest - next of the current node
	 * @return head node of the reversed doubly linked list
	 */
	public static Node reverseRecursivelyUtil(Node cur, Node rest) {
		if(cur.next == null) {
			head = cur;
			cur.next = rest;
			rest.prev = cur;
			return null;
		}
		
		Node temp = cur.next;
		cur.next = rest;
		
		if(cur.prev != null) {
			rest.prev = cur;
		}
			
		reverseRecursivelyUtil(temp, cur);
		return head;
	}

}
