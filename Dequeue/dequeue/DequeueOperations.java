package dequeue;

class QNode {
	QNode next, prev;
	int data;
	
	QNode(int d) {
		data = d;
	}
}

public class DequeueOperations {
	QNode front, rear;
	int size;
	QNode current;
	
	public DequeueOperations() {
		this.front = this.rear = null;
		this.size = 0;
	}
	
	/**
	 * Inserts an item at the front of dequeue
	 * @param data - item to be inserted at front of dequeue
	 */
	public void insertFront(int data) {
		QNode newNode = new QNode(data);

		if(this.isEmpty()) {
			this.setFront(newNode);
			this.setRear(newNode);
			return;
		}
		newNode.next = this.getFront();
		newNode.prev = null;
		
		this.getFront().prev = newNode;
		this.setFront(newNode);	
		this.size++;
	}
	
	/**
	 * Deletes an item from the front of dequeue
	 */
	public void deletefront() {
		QNode newFront = this.getFront().next;
		this.setFront(newFront);
		this.getFront().prev = null;
		this.size --;
	}
	
	/**
	 * Inserts an item at the rear of dequeue
	 * @param data - item to be inserted at rear
	 */
	public void insertLast(int data) {
		QNode newNode = new QNode(data);
		
		if(this.isEmpty()) {
			this.setFront(newNode);
			this.setRear(newNode);
			return;
		}
		
		newNode.prev = this.getRear();
		newNode.next = null;
		
		this.getRear().next = newNode;
		this.setRear(newNode);
		this.size++;
	}
	
	/**
	 * Deletes the last item of dequeue
	 */
	public void deleteLast() {
		QNode newRear = this.getRear().prev;
		this.setRear(newRear);
		this.getRear().next = null;
		this.size--;
	}
	
	/**
	 * Returns the size of dequeue
	 * @return - int size of dequeue
	 */
	public int size() {
		return this.size;
	}
	
	/**
	 * Sets the front item of the queue
	 * @param node - item which is to be set to the front of dequeue
	 */
	public void setFront(QNode node) {
		this.front = node;
	}
	
	/**
	 * Gets the front item of the queue
	 * @return - the front item QNode
	 */
	public QNode getFront() {
		return this.front;
	}
	
	/**
	 * Sets the rear item of the queue
	 * @param node - item which is to be set to the rear of dequeue
	 */
	public void setRear(QNode node) {
		this.rear = node;
	}
	
	/**
	 * Gets the rear item of the dequeue
	 * @return - the rear item QNode
	 */
	public QNode getRear() {
		return this.rear;
	}
	
	/**
	 * Returns if dequeue is empty or not
	 * @return - true if dequeue is empty, else false
	 */
	public boolean isEmpty() {
		return this.getFront() == null;
	}
	
	/**
	 * Prints the dequeue iteratively
	 */
	public void printDequeue() {
		current = this.getFront();
		System.out.println("The elements in dequeue is:");
		while(this.hasNext()) {
			System.out.println(this.next().data);
		}
	}

	/**
	 * Returns the current item of dequeue and move the pointer to next
	 * @return - the QNode current item of dequeue
	 */
	public QNode next() {
		if(this.current == null) {
			System.out.println("The dequeue is empty");
			System.exit(0);
		}
		
		QNode temp = this.current;
		this.current = this.current.next;
		return temp;
	}
	
	/**
	 * Returns if the dequeue has next item
	 * @return - true if dequeue has next item, else false
	 */
	public boolean hasNext() {
		return this.current != null;
	}
	
	public static void main(String[] args) {
		DequeueOperations dq = new DequeueOperations();
		dq.insertFront(3);
		dq.insertFront(2);
		dq.insertFront(1);
		dq.insertFront(0);
		dq.insertLast(4);
		dq.insertLast(5);
		dq.deletefront();
		dq.deleteLast();

		dq.printDequeue();
		
	}

}
