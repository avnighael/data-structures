package linkedListOperations;

public class LinkedListOperations {
	private static Node head; //head of the list
	
	static class Node {
		int data;
		Node next;
		
		Node (int d) {
			data = d;
			next = null;
		}
	}
	
	/**
	 * Prints a linked list
	 */	
	public static void println() {
		Node h = getHead();
		while(h !=null) {
			System.out.println(h.data);
			h = h.next;
		}
	}
	
	/**
	 * Creates linked list of 3 nodes
	 * @return Linked list
	 */	
	public static LinkedListOperations createLlist() {
		LinkedListOperations llist = new LinkedListOperations(); 
		
		llist.setHead(new Node(1));
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.getHead().next = second;
		second.next = third;
		third.next = null;
		
		return llist;
	}
	
	/**
	 * Inserts data at the beginning of the linked list
	 * @param args- newData which is the int data to be added at the beginning
	 */	
	public static void insertsAtBeginning(int newData) {		
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
		
	}
	
	/**
	 * Inserts data at the end of the linked list
	 * @param newData - is the int data to be added at the end of the linked list
	 */	
	public static void insertsAtEnd(int newData) {
		Node h = head;
		
		Node newNode = new Node(newData);
		
		if(h == null) {
			head =  newNode;
			return;
		}
		
		while(h.next != null) {
			h = h.next;
		}

		h.next = newNode;
		newNode.next = null;
				
	}
	
	/**
	 *  Given a position, insert a new node after the given position
	 * @param prevNode
	 * @param newData
	 */	
	public static void InsertsAfter(int position, int newData) {
		int size = getCount();
		/* 1. Check if the given Node is null */
	    if (position == 0)
	    {
	        System.out.println("The given previous node cannot be null");
	        return;
	    }
	    
	    if(size < position) {
	    	System.out.println("The given previous node position exceeded the size of the list");
	    	return;
	    }
	    
	    Node h = head;
	    int count = 0;
	    
	    while(h !=null && count < position) {
			h = h.next;
			count ++;
		}
	    
		Node newNode = new Node(newData);
		newNode.next = h.next;
		h.next = newNode;		
	}
	
	/**
	 * Deletes a node from the beginning
	 */
	public static void deleteFromBeginning() {
		Node h = head;
		head = h.next;
		h = null;
	}
	
	/**
	 * Deletes a node from end
	 */
	
	public static void deleteFromEnd() {
		Node h = head;
		
		while(h.next.next != null) {
			h = h.next;
		}
		
		h.next = null;
	}
	
	/**
	 * Deletes the node from specified position
	 * @param pos = index(starting from 1) starting from where the node 
	 * you want to delete
	 */
	public static void deleteTheSpecified(int pos) {
		int size = getCount();
		
		if(pos == 0) {
			System.out.println("Cannot delete null node");
		} else if(pos == 1) {
			deleteFromBeginning();
		} else if(pos == size) {
			deleteFromEnd();
		} else if(pos > 1 && pos < size) {
			Node h = head;
			int i = 1;
			
			while(h != null && i < pos - 1) {
				h = h.next;
				i++;
			}
			
			h.next = h.next.next;
		} else {
			System.out.println("The positon exceeded the size of linkedlist");
		}
	}
	
	/**
	 * Reverse the linkedlist iteratively
	 */
	public static void reverseIteratively() {
		int length = getCount();
		
		if(head == null || length == 1) {
			return;
		}
		
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	/**
	 * Wrapper of getCountCalc
	 * @return length of the linkedlist in int
	 */
	
	public static int getCount() {
		return getCountCalc(head);
	}
	
	/**
	 * calculated=s the size of the linkedlist recursively
	 * @param node
	 * @return length of the linkedlist in int
	 */
	public static int getCountCalc(Node node) {
		if(node == null) {
			return 0;
		}
		
		return 1 + getCountCalc(node.next);
	}

	/*
	 * getter of Node head
	 */	
	public static Node getHead() {
		return head;
	}

	/*
	 * Setter of head Node
	 */
	public static void setHead(Node head) {
		LinkedListOperations.head = head;
	}

}

