
public class Stack {
	private static Node head; //head of the list
	private int top;
	private Node l1;
	
	static class Node {
		int data;
		Node next;
		
		Node (int d) {
			data = d;
			next = null;
		}
	}
	
	public Stack() {
		this.setTop(0);
	}
	
	public boolean isEmpty() {
		return this.peek() == 0;
	}
	
	public void push(int elem) {
		this.setTop(this.peek() + 1);
		Node h = head;
		Node newNode = new Node(elem);
		
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
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("The stack is empty");
			return;
		}
		
		this.setTop(this.peek() - 1);
		Node h = head;
		
		while(h.next.next != null) {
			h = h.next;
		}
		
		h.next = null;
	}
	
	public int getStackElem(int index) {
		Node h = head;
		int count = 0;
		
		while(h != null && count < index) {
			h = h.next;
			count++;
		}
		
		return h.data;
	}
	
	public int size() {
		return peek();
	}
	
	public int peek() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
}
