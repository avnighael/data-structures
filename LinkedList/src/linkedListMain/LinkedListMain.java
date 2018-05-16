package linkedListMain;

import java.util.ArrayList;
import java.util.Scanner;

import linkedListOperations.LinkedListOperations;

public class LinkedListMain {
	

	public LinkedListMain() {
		
	}
	
	
	public static void main(String args[]) {
		 Scanner sc = new Scanner( System.in );
		LinkedListOperations llist = new LinkedListOperations();
		LinkedListOperations linkedList = llist.createLlist();
		int i = 0;
		
//		System.out.println("Welcome to play with Linked List");
//		System.out.println("Do you want to create/Insert/Delete? y/n");
//		String ans = sc.nextLine().toLowerCase();
//		String ans2 = null;
//		
//		switch (ans) {
//		case "y":
//			System.out.println("Press 1 to create a linked list");
//			System.out.println("Press 2 to insert in linked list");
//			System.out.println("Press 3 to delete from linked list");
//			ans2 = sc.nextLine();
//			break;
//		case "n":
//			System.out.println("GoodBye!");
//			break;
//		default:
//			System.out.println("You have entered the wrong input!");
//			break;
//		}
////		
//		switch (ans2) {
//		case "1":
//			System.out.println("Enter the data to create a node in the list");
//			int data = Integer.parseInt(sc.nextLine());
//			TraverseThreeNodes llist = new TraverseThreeNodes();
//			TraverseThreeNodes linkedList = llist.createLlist();
//			break;
//		case "2":
//			System.out.println("Enter the position where you want to insert after");
//			int pos = Integer.parseInt(sc.nextLine());
//			System.out.println("Enter the new node data you want to insert at above specified position");
//			int newData = Integer.parseInt(sc.nextLine());
//			TraverseThreeNodes.InsertsAfter(pos, newData);
//			break;
//		}
		
		linkedList.insertsAtBeginning(i);
		linkedList.insertsAtEnd(5);
		linkedList.InsertsAfter(3, 4);
		linkedList.println();
		linkedList.deleteFromBeginning();
		linkedList.deleteFromEnd();
		linkedList.deleteTheSpecified(2);
		System.out.println("After deletion");
		linkedList.println();
		
		// Create n number of nodes in linked list, given an array
		ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist  
		list.add(7);
		list.add(3);
		LinkedListOperations llist2 = new LinkedListOperations();
		LinkedListOperations linkedList2 = llist2.createLlist();
	}

}
