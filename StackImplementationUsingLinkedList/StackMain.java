
public class StackMain {
	public static StackInbuilt stack = new StackInbuilt();
	public static Stack stack2 = new Stack();
	
	public static void printStackInbuilt(int size) {
		System.out.println("The elements of stack from top:");
		int index = 0;
		
		while(index < size) {
			System.out.println(stack.getStackElem(index++));
		}
	}
	

	public static void main(String[] args) {
		System.out.println("---------------- Inbuilt Stack -------------------");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("The size of the stack after push operations is: " + stack.size());
		System.out.println("The top element is: " + stack.peek());
		printStackInbuilt(stack.size());
				
		stack.pop();
		stack.pop();
		stack.push(5);
		System.out.println("The size of stack after pop operations is: " + stack.size());
		
		printStackInbuilt(stack.size());
		
		// ------------ Stack 2 driver ----------------
		
		System.out.println("---------------- Stack2 -------------------");
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.push(4);
		
		System.out.println("The size of the stack after push operations is: " + stack2.size());
		System.out.println("The top element is: " + stack2.peek());
		stack2.printStack();
				
		stack2.pop();
		stack2.pop();
		stack2.push(5);
		System.out.println("The size of stack after pop operations is: " + stack2.size());
		
		stack2.printStack();
		
	}

}
