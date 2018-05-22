package doublyLinkedList;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		DoublyLinkedListOperations dl = new DoublyLinkedListOperations();
		dl.insertAtBeginning(2);
		dl.insertAtBeginning(1);
		dl.insertAtEnd(3);
		dl.insertAtEnd(5);
		dl.insertAfter(dl.head.next.next, 4);
		dl.insertBefore(dl.head.next.next, 0);
		dl.deleteNode(dl.head.next.next);

		dl.println(dl.head);
	}

}
