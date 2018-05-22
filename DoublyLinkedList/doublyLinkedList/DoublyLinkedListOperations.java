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

}
