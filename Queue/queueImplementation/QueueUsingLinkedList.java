package queueImplementation;

class QNode {
	int data;
	QNode next;
	
	QNode (int d) {
		this.data = d;
		this.next = null;
	}
}

public class QueueUsingLinkedList {
	QNode front, rear;
	
	public QueueUsingLinkedList() {
		this.front = this.rear = null;
	}
	
	/**
	 * Adds data in the end of queue
	 * @param data - to be inserted
	 */
	void enqueue(int data) {
		QNode newNode = new QNode(data);
		
		if(this.getRear() == null) {
			this.setFront(newNode);
			this.setRear(newNode);
			return;
		}
		
		this.rear.next = newNode;
		this.setRear(newNode);
	}
	
	/**
	 * Removes the element from the front of the queue
	 * @returns the first element
	 */
	QNode dequeue() {
		if(this.getFront() == null) {
			return null;
		}
		
		QNode temp =this.getFront();
		this.front = this.front.next;
		
		if(this.getFront() == null) {
			this.setFront(null);
		}
		return temp;
	}
	
	/**
	 * Returns the fist element of the queue
	 * @return - first node
	 */
	QNode getFront() {
		return this.front;
	}
	
	/**
	 * Returns the last element of the queue
	 * @return - last node
	 */
	QNode getRear() {
		return this.rear;
	}
	
	/**
	 * Sets the fist element of the queue
	 * @param node - to be set as first element in the queue
	 */
	void setFront(QNode node) {
		 this.front = node;
	}
	
	/**
	 * Sets the last element of the queue
	 * @param node - to be set as last element in the queue
	 */
	void setRear(QNode node) {
		 this.rear = node;
	}

	public static void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println(q.dequeue().data);
		
		System.out.println(q.getFront().data);
		System.out.println(q.getRear().data);

	}

}
