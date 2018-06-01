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
	 * Reverses the queue recursively
	 */
	public void reverse() {
		if(!this.s1.isEmpty()) {
			int temp = this.dequeue();
			reverse();
			this.enqueue(temp);
		}
	}
	
	/**
	 * Reverses the first k elements in the queue
	 * keeping the remaining elements in the same order
	 * @param k - int position until the reversal of queue needs to be done
	 */
	public void reverseFirstK(int k) {
		QueueUsingStack q2 = new QueueUsingStack();
		
		if(this.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		
		if(k > this.size() || k < 0) {
			System.out.println("k exceeds/ is less than number of elements in the queue");
			return;
		}
		
		reverseFirstKOnly(q2, k);
		transfer(this, q2);
		transfer(q2, this);
	}
	
	/**
	 * Reverses only the first k elements and return
	 * @param q2 - the temporary queue to store queue
	 * @param k - int position until the reversal of queue needs to be done
	 */
	public void reverseFirstKOnly(QueueUsingStack q2, int k)  {		
		if(k > 0) {
			int temp = this.dequeue();
			reverseFirstKOnly(q2, k-1);
			q2.enqueue(temp);
		}

	}
	
	/**
	 * Transfers all the elements of q1 to q2
	 * @param q1 - Queue which needs to be transfered
	 * @param q2 -  Queue which is the destination queue
	 */
	public void transfer(QueueUsingStack q1, QueueUsingStack q2) {
		if(!q1.isEmpty()) {
			int temp = q1.dequeue();
			q2.enqueue(temp);
			transfer(q1, q2);
		}
	}
	
	/**
	 * Checks whether the queue is empty or not
	 * @return - boolean
	 */
	public boolean isEmpty() {
		return this.s1.isEmpty();
	}
	
	/**
	 * Size of array
	 * @return - int size of array
	 */
	public int size() {
		return this.s1.size();
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
		q.enqueue(50);
		q.enqueue(60);
		
		q.reverseFirstK(4);
		System.out.println(q.getFront());
		System.out.println(q.getRear());
		System.out.println(q.dequeue());
		System.out.println(q.getFront());
//		q.reverse();
//		
//		System.out.println(q.getFront());
//		System.out.println(q.getRear());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.getRear());
//		System.out.println(q.getFront());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.getRear());
//		System.out.println(q.getFront());

	}

}
