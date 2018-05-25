
public class Stack {
	private static Node head; //head of the list
	private Node top;
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
		this.setTop(null);
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(int elem) {
		Node curTop = top;
		Node newNode = new Node(elem);

		if(curTop == null) {
			head = top = newNode;
			return;
		}

		newNode.next = curTop;
//		newNode.next = null;
		top = newNode;
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("The stack is empty");
			return;
		}

		 Node curTop = top;
		 top = curTop.next;
		 curTop = null;
		
	}
	
	public void printStack() {
		System.out.println("The elements of stack from top:");
		Node curTop = top;
		
		while(curTop != null) {
			System.out.println(curTop.data);
			curTop = curTop.next;			
		}
	}
	
	public int size() {
		return sizeCalc(top);
	}
	
	public int sizeCalc(Node h) {
		if(h == null) {
			return 0;
		}
		return 1 + sizeCalc(h.next);
	}
	
	
	public int peek() {
		return top.data;
	}

	public void setTop(Node top) {
		this.top = top;
	}
	
	public Node getTop() {
		return top;
	}
}
