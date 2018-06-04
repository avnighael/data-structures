package stack;

public class Stack {
	int top;
	int s[];
	
	/**
	 * Constructor
	 */
	public Stack() {
		this.top = -1;
		s = new int[100];
	}
	
	/**
	 * Pushes the given item on top of the stack
	 * @param d - item to be pushed in stack
	 */
	public void push(int d) {
		if(this.isFull()) {
			System.out.println("Stack Overflow. Cannot push item " + d);
			return;
		}
		
		this.top++;
		s[this.top] = d;
	}
	
	public void pop() {
		if(this.isEmpty()) {
			System.out.println("Stack Underflow;");
			System.exit(0);
		}
		
		this.top --;
	}
	
	/**
	 * Returns the top element of the stack
	 * @return - int top element of the stack
	 */
	public int peek() {
		return s[this.top];
	}
	
	public int size() {
		return this.s.length;
	}
	
	/**
	 * Returns whether the stack is empty or not
	 * @return - true if stack is empty, false otherwise
	 */
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	/**
	 * Returns whether the stack is full or not
	 * @return - true if stack is full, else false
	 */
	public boolean isFull() {
		return this.top == this.size() - 1;
	}
	
	/**
	 * Wrapper to print the stack elements
	 */
	public void printStack() {
		printStackUtil(this.top);
	}
	
	/**
	 * Util to print the stack elements recursively
	 * @param curTop - the current top index of stack
	 * to be printed
	 */
	public void printStackUtil(int curTop) {
		if(curTop == -1) {
			return;
		}
		System.out.println(this.s[curTop]);
		printStackUtil(curTop - 1);
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("The size of stack is: " + stack.size());
		stack.push(0);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.pop();
		stack.pop();
		
		System.out.println("The top element instack is:" + stack.peek());
		System.out.println("The elementsof stack from top is:");
		stack.printStack();
	}

}
