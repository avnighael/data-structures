
public class StackMain {
	public static Stack stack = new Stack();
	
	public static void printStack() {
		System.out.println("The elements of stack from top:");
		int index = 0;
		
		while(index < stack.size()) {
			System.out.println(stack.getStackElem(index++));
		}
	}

	public static void main(String[] args) {		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("The size of the stack after push operations is: " + stack.size());
		System.out.println("The top element is: " + stack.peek());
		printStack();
				
		stack.pop();
		stack.pop();
		stack.push(5);
		System.out.println("The size of stack after pop operations is: " + stack.size());
		
		printStack();

	}

}
