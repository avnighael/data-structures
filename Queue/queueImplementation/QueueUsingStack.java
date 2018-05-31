package queueImplementation;

import java.util.Stack;

public class QueueUsingStack {
	
	private Stack<Integer> s1;
	
	/**
	 * Constructor
	 */
	public QueueUsingStack() {
		s1 = new Stack<Integer>();
	}
	

	/**
	 * Adds the element at the end of the queue
	 * @param data - it element to be pushed
	 */
	public void enqueue(int data) {
		this.s1.push(data);
	}
	
//	 deQueue:
//	  1) If stack1 is empty then error.
//	  2) If stack1 has only one element then return it.
//	  3) Recursively pop everything from the stack1, store the popped item 
//	    in a variable temp,  push the temp back to stack1 and return temp
	
	/**
	 * Pops the first element from the queue
	 * @return - int first element of the queue
	 */
	public int dequeue() {
		int temp;
		if(this.s1.isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(0);
		}
		
		if(this.s1.size() == 1) {
			return this.s1.pop();
		}
		
		temp = this.s1.pop();
		int first =  dequeue();
		this.s1.push(temp);
		return first;
	}
	
	/**
	 * Gets the last element of the queue
	 * @return - int last element
	 */
	public int getRear() {
		if(this.s1.isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(0);
		}
		return this.s1.peek();
		
	}
	
	/**
	 * Gets the front of the queue
	 * @return - int first element
	 */
	public int getFront() {
		int temp;
		if(this.s1.isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(0);
		}
		
		if(this.s1.size() == 1) {
			return this.s1.peek();
		}
		
		temp = this.s1.pop();
		int first =  getFront();
		this.s1.push(temp);
		return first;
	}
	

	public static void main(String[] args) {
		QueueUsingStack q = new QueueUsingStack();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.getFront());
		System.out.println(q.getRear());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.getRear());
		System.out.println(q.getFront());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.getRear());
		System.out.println(q.getFront());

	}

}
