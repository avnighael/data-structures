import java.util.LinkedList;

public class StackInbuilt {
	private int top;
	private LinkedList<Integer> l1;
	
	public StackInbuilt() {
		this.setTop(0);
		this.l1  = new LinkedList<Integer>();
	}
	
	public boolean isEmpty() {
		return this.peek() == 0;
	}
	
	public void push(int elem) {
		l1.add(elem);
		this.setTop(this.peek() + 1);
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("The stack is empty");
			return;
		}
		
		this.l1.remove(peek()-1);
		this.setTop(this.peek() - 1);
	}
	
	public int size() {
		return peek();
	}
	
	public int getStackElem(int index) {
		return this.l1.get(index);
	}

	public int peek() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

}
